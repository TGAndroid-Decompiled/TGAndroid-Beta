package ui;

import android.media.AudioRecord;
import android.os.Handler;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.telegram.ui.lh0;
public final class a implements Runnable {
    public final int f49913a;
    public final org.telegram.utils.recorder.audio.d f49914b;

    public a(org.telegram.utils.recorder.audio.d dVar, int i10) {
        this.f49913a = i10;
        this.f49914b = dVar;
    }

    @Override
    public final void run() {
        double sqrt;
        switch (this.f49913a) {
            case 0:
                org.telegram.utils.recorder.audio.d dVar = this.f49914b;
                try {
                    if (dVar.f46414n) {
                        dVar.e(null);
                        return;
                    }
                    int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
                    if (minBufferSize <= 0) {
                        minBufferSize = 7680;
                    }
                    int max = Math.max(minBufferSize * 2, 7680);
                    AudioRecord audioRecord = new AudioRecord(0, 48000, 16, 2, max);
                    dVar.f46416p = audioRecord;
                    if (audioRecord.getState() == 1) {
                        dVar.f46416p.startRecording();
                        if (dVar.f46416p.getRecordingState() == 3) {
                            dVar.f46407f.b("AudioRecord started: minBufferBytes=" + minBufferSize + ", bufferBytes=" + max + ", sessionId=" + dVar.f46416p.getAudioSessionId());
                            dVar.f46418r = SystemClock.elapsedRealtime();
                            dc.e eVar = dVar.f46408g;
                            ((o) eVar.f8321c).f49951i.post(new lh0(eVar, eVar.f8319a, 3));
                            dVar.f46409i.post(new a(dVar, 2));
                            return;
                        }
                        throw new IllegalStateException("Unable to start AudioRecord");
                    }
                    throw new IllegalStateException("Unable to initialize AudioRecord");
                } catch (Throwable th2) {
                    dVar.e(org.telegram.utils.recorder.audio.d.a(th2));
                    return;
                }
            case 1:
                this.f49914b.e(null);
                return;
            default:
                org.telegram.utils.recorder.audio.d dVar2 = this.f49914b;
                if (!dVar2.f46415o) {
                    Exception exc = null;
                    if (dVar2.f46414n) {
                        dVar2.e(null);
                        return;
                    }
                    ByteBuffer byteBuffer = (ByteBuffer) dVar2.f46412l.poll();
                    if (byteBuffer == null) {
                        byteBuffer = ByteBuffer.allocateDirect(1920).order(ByteOrder.nativeOrder());
                    }
                    byteBuffer.clear();
                    try {
                        int read = dVar2.f46416p.read(byteBuffer, byteBuffer.capacity());
                        if (read > 0) {
                            byteBuffer.limit(read);
                            int i10 = read / 2;
                            long j10 = 0;
                            for (int i11 = 0; i11 + 1 < read; i11 += 2) {
                                long j11 = byteBuffer.getShort(i11);
                                j10 += j11 * j11;
                            }
                            dVar2.f46417q += i10;
                            dVar2.f46413m.incrementAndGet();
                            dVar2.f46411k.post(new org.telegram.utils.recorder.audio.c(0, dVar2, byteBuffer));
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (elapsedRealtime - dVar2.f46418r >= 32) {
                                if (i10 == 0) {
                                    sqrt = 0.0d;
                                } else {
                                    sqrt = Math.sqrt(j10 / i10);
                                }
                                final double d = sqrt;
                                final dc.e eVar2 = dVar2.f46408g;
                                final long j12 = dVar2.f46417q;
                                Handler handler = ((o) eVar2.f8321c).f49951i;
                                final long j13 = eVar2.f8319a;
                                handler.post(new Runnable() {
                                    @Override
                                    public final void run() {
                                        o oVar = (o) dc.e.this.f8321c;
                                        if (j13 == oVar.f49958p && oVar.f49956n == m.f49940c) {
                                            oVar.f49960r = j12;
                                            long j14 = oVar.j();
                                            double d10 = d;
                                            if (d10 >= 0.0d) {
                                                oVar.f49949f.onRecordingProgress(j14, d10);
                                            }
                                        }
                                    }
                                });
                                dVar2.f46418r = elapsedRealtime;
                            }
                            dVar2.f46409i.post(new a(dVar2, 2));
                            return;
                        }
                        throw new IllegalStateException("AudioRecord read failed: " + read);
                    } catch (Throwable th3) {
                        if (0 == 0) {
                            dVar2.c(byteBuffer);
                        }
                        if (!dVar2.f46414n) {
                            exc = org.telegram.utils.recorder.audio.d.a(th3);
                        }
                        dVar2.e(exc);
                        return;
                    }
                }
                return;
        }
    }
}
