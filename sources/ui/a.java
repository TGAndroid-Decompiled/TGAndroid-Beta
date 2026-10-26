package ui;

import android.media.AudioRecord;
import android.os.Handler;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.telegram.ui.lh0;
public final class a implements Runnable {
    public final int f49916a;
    public final org.telegram.utils.recorder.audio.d f49917b;

    public a(org.telegram.utils.recorder.audio.d dVar, int i10) {
        this.f49916a = i10;
        this.f49917b = dVar;
    }

    @Override
    public final void run() {
        double sqrt;
        switch (this.f49916a) {
            case 0:
                org.telegram.utils.recorder.audio.d dVar = this.f49917b;
                try {
                    if (dVar.f46417n) {
                        dVar.e(null);
                        return;
                    }
                    int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
                    if (minBufferSize <= 0) {
                        minBufferSize = 7680;
                    }
                    int max = Math.max(minBufferSize * 2, 7680);
                    AudioRecord audioRecord = new AudioRecord(0, 48000, 16, 2, max);
                    dVar.f46419p = audioRecord;
                    if (audioRecord.getState() == 1) {
                        dVar.f46419p.startRecording();
                        if (dVar.f46419p.getRecordingState() == 3) {
                            dVar.f46410f.b("AudioRecord started: minBufferBytes=" + minBufferSize + ", bufferBytes=" + max + ", sessionId=" + dVar.f46419p.getAudioSessionId());
                            dVar.f46421r = SystemClock.elapsedRealtime();
                            dc.e eVar = dVar.f46411g;
                            ((o) eVar.f8321c).f49954i.post(new lh0(eVar, eVar.f8319a, 3));
                            dVar.f46412i.post(new a(dVar, 2));
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
                this.f49917b.e(null);
                return;
            default:
                org.telegram.utils.recorder.audio.d dVar2 = this.f49917b;
                if (!dVar2.f46418o) {
                    Exception exc = null;
                    if (dVar2.f46417n) {
                        dVar2.e(null);
                        return;
                    }
                    ByteBuffer byteBuffer = (ByteBuffer) dVar2.f46415l.poll();
                    if (byteBuffer == null) {
                        byteBuffer = ByteBuffer.allocateDirect(1920).order(ByteOrder.nativeOrder());
                    }
                    byteBuffer.clear();
                    try {
                        int read = dVar2.f46419p.read(byteBuffer, byteBuffer.capacity());
                        if (read > 0) {
                            byteBuffer.limit(read);
                            int i10 = read / 2;
                            long j10 = 0;
                            for (int i11 = 0; i11 + 1 < read; i11 += 2) {
                                long j11 = byteBuffer.getShort(i11);
                                j10 += j11 * j11;
                            }
                            dVar2.f46420q += i10;
                            dVar2.f46416m.incrementAndGet();
                            dVar2.f46414k.post(new org.telegram.utils.recorder.audio.c(0, dVar2, byteBuffer));
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (elapsedRealtime - dVar2.f46421r >= 32) {
                                if (i10 == 0) {
                                    sqrt = 0.0d;
                                } else {
                                    sqrt = Math.sqrt(j10 / i10);
                                }
                                final double d = sqrt;
                                final dc.e eVar2 = dVar2.f46411g;
                                final long j12 = dVar2.f46420q;
                                Handler handler = ((o) eVar2.f8321c).f49954i;
                                final long j13 = eVar2.f8319a;
                                handler.post(new Runnable() {
                                    @Override
                                    public final void run() {
                                        o oVar = (o) dc.e.this.f8321c;
                                        if (j13 == oVar.f49961p && oVar.f49959n == m.f49943c) {
                                            oVar.f49963r = j12;
                                            long j14 = oVar.j();
                                            double d10 = d;
                                            if (d10 >= 0.0d) {
                                                oVar.f49952f.onRecordingProgress(j14, d10);
                                            }
                                        }
                                    }
                                });
                                dVar2.f46421r = elapsedRealtime;
                            }
                            dVar2.f46412i.post(new a(dVar2, 2));
                            return;
                        }
                        throw new IllegalStateException("AudioRecord read failed: " + read);
                    } catch (Throwable th3) {
                        if (0 == 0) {
                            dVar2.c(byteBuffer);
                        }
                        if (!dVar2.f46417n) {
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
