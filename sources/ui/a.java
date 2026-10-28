package ui;

import android.media.AudioRecord;
import android.os.Handler;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.telegram.ui.nh0;
public final class a implements Runnable {
    public final int f49951a;
    public final org.telegram.utils.recorder.audio.d f49952b;

    public a(org.telegram.utils.recorder.audio.d dVar, int i10) {
        this.f49951a = i10;
        this.f49952b = dVar;
    }

    @Override
    public final void run() {
        double sqrt;
        switch (this.f49951a) {
            case 0:
                org.telegram.utils.recorder.audio.d dVar = this.f49952b;
                try {
                    if (dVar.f46452n) {
                        dVar.e(null);
                        return;
                    }
                    int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
                    if (minBufferSize <= 0) {
                        minBufferSize = 7680;
                    }
                    int max = Math.max(minBufferSize * 2, 7680);
                    AudioRecord audioRecord = new AudioRecord(0, 48000, 16, 2, max);
                    dVar.f46454p = audioRecord;
                    if (audioRecord.getState() == 1) {
                        dVar.f46454p.startRecording();
                        if (dVar.f46454p.getRecordingState() == 3) {
                            dVar.f46445f.b("AudioRecord started: minBufferBytes=" + minBufferSize + ", bufferBytes=" + max + ", sessionId=" + dVar.f46454p.getAudioSessionId());
                            dVar.f46456r = SystemClock.elapsedRealtime();
                            dc.e eVar = dVar.f46446g;
                            ((o) eVar.f8321c).f49989i.post(new nh0(eVar, eVar.f8319a, 3));
                            dVar.f46447i.post(new a(dVar, 2));
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
                this.f49952b.e(null);
                return;
            default:
                org.telegram.utils.recorder.audio.d dVar2 = this.f49952b;
                if (!dVar2.f46453o) {
                    Exception exc = null;
                    if (dVar2.f46452n) {
                        dVar2.e(null);
                        return;
                    }
                    ByteBuffer byteBuffer = (ByteBuffer) dVar2.f46450l.poll();
                    if (byteBuffer == null) {
                        byteBuffer = ByteBuffer.allocateDirect(1920).order(ByteOrder.nativeOrder());
                    }
                    byteBuffer.clear();
                    try {
                        int read = dVar2.f46454p.read(byteBuffer, byteBuffer.capacity());
                        if (read > 0) {
                            byteBuffer.limit(read);
                            int i10 = read / 2;
                            long j10 = 0;
                            for (int i11 = 0; i11 + 1 < read; i11 += 2) {
                                long j11 = byteBuffer.getShort(i11);
                                j10 += j11 * j11;
                            }
                            dVar2.f46455q += i10;
                            dVar2.f46451m.incrementAndGet();
                            dVar2.f46449k.post(new org.telegram.utils.recorder.audio.c(0, dVar2, byteBuffer));
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (elapsedRealtime - dVar2.f46456r >= 32) {
                                if (i10 == 0) {
                                    sqrt = 0.0d;
                                } else {
                                    sqrt = Math.sqrt(j10 / i10);
                                }
                                final double d = sqrt;
                                final dc.e eVar2 = dVar2.f46446g;
                                final long j12 = dVar2.f46455q;
                                Handler handler = ((o) eVar2.f8321c).f49989i;
                                final long j13 = eVar2.f8319a;
                                handler.post(new Runnable() {
                                    @Override
                                    public final void run() {
                                        o oVar = (o) dc.e.this.f8321c;
                                        if (j13 == oVar.f49996p && oVar.f49994n == m.f49978c) {
                                            oVar.f49998r = j12;
                                            long j14 = oVar.j();
                                            double d10 = d;
                                            if (d10 >= 0.0d) {
                                                oVar.f49987f.onRecordingProgress(j14, d10);
                                            }
                                        }
                                    }
                                });
                                dVar2.f46456r = elapsedRealtime;
                            }
                            dVar2.f46447i.post(new a(dVar2, 2));
                            return;
                        }
                        throw new IllegalStateException("AudioRecord read failed: " + read);
                    } catch (Throwable th3) {
                        if (0 == 0) {
                            dVar2.c(byteBuffer);
                        }
                        if (!dVar2.f46452n) {
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
