package vi;

import android.media.AudioRecord;
import android.os.Handler;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.me;
import org.telegram.messenger.qs;
import org.telegram.ui.p31;
public final class a implements Runnable {
    public final int f57520a;
    public final org.telegram.utils.recorder.audio.d f57521b;

    public a(org.telegram.utils.recorder.audio.d dVar, int i7) {
        this.f57520a = i7;
        this.f57521b = dVar;
    }

    @Override
    public final void run() {
        double sqrt;
        switch (this.f57520a) {
            case 0:
                org.telegram.utils.recorder.audio.d dVar = this.f57521b;
                try {
                    if (dVar.f52730n) {
                        dVar.e(null);
                        return;
                    }
                    int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
                    if (minBufferSize <= 0) {
                        minBufferSize = 7680;
                    }
                    int max = Math.max(minBufferSize * 2, 7680);
                    AudioRecord audioRecord = new AudioRecord(0, 48000, 16, 2, max);
                    dVar.f52732p = audioRecord;
                    if (audioRecord.getState() == 1) {
                        dVar.f52732p.startRecording();
                        if (dVar.f52732p.getRecordingState() == 3) {
                            dVar.f52723f.b("AudioRecord started: minBufferBytes=" + minBufferSize + ", bufferBytes=" + max + ", sessionId=" + dVar.f52732p.getAudioSessionId());
                            dVar.f52734r = SystemClock.elapsedRealtime();
                            ac.e eVar = dVar.f52724g;
                            ((h) eVar.f1025c).f57546i.post(new p31(eVar, eVar.f1023a, 3));
                            dVar.f52725i.post(new a(dVar, 2));
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
                this.f57521b.e(null);
                return;
            default:
                org.telegram.utils.recorder.audio.d dVar2 = this.f57521b;
                if (!dVar2.f52731o) {
                    Exception exc = null;
                    if (dVar2.f52730n) {
                        dVar2.e(null);
                        return;
                    }
                    ByteBuffer byteBuffer = (ByteBuffer) dVar2.f52728l.poll();
                    if (byteBuffer == null) {
                        byteBuffer = ByteBuffer.allocateDirect(1920).order(ByteOrder.nativeOrder());
                    }
                    byteBuffer.clear();
                    try {
                        int read = dVar2.f52732p.read(byteBuffer, byteBuffer.capacity());
                        if (read > 0) {
                            byteBuffer.limit(read);
                            int i7 = read / 2;
                            long j3 = 0;
                            for (int i10 = 0; i10 + 1 < read; i10 += 2) {
                                long j10 = byteBuffer.getShort(i10);
                                j3 += j10 * j10;
                            }
                            dVar2.f52733q += i7;
                            dVar2.f52729m.incrementAndGet();
                            dVar2.f52727k.post(new org.telegram.utils.recorder.audio.c(0, dVar2, byteBuffer));
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (elapsedRealtime - dVar2.f52734r >= 32) {
                                if (i7 == 0) {
                                    sqrt = 0.0d;
                                } else {
                                    sqrt = Math.sqrt(j3 / i7);
                                }
                                final double d = sqrt;
                                final ac.e eVar2 = dVar2.f52724g;
                                final long j11 = dVar2.f52733q;
                                Handler handler = ((h) eVar2.f1025c).f57546i;
                                final long j12 = eVar2.f1023a;
                                handler.post(new Runnable() {
                                    @Override
                                    public final void run() {
                                        h hVar = (h) ac.e.this.f1025c;
                                        if (j12 == hVar.f57552o && hVar.G == 3) {
                                            hVar.f57554q = j11;
                                            long j13 = hVar.j();
                                            double d2 = d;
                                            if (d2 >= 0.0d) {
                                                MediaController mediaController = ((me) hVar.f57544f.f16456b).f24011a;
                                                mediaController.f21276k1 = j13;
                                                qs.f(mediaController.f21270h1).k(qs.f25027k2, Integer.valueOf(mediaController.f21268g1), Double.valueOf(d2 / 2.0d));
                                            }
                                        }
                                    }
                                });
                                dVar2.f52734r = elapsedRealtime;
                            }
                            dVar2.f52725i.post(new a(dVar2, 2));
                            return;
                        }
                        throw new IllegalStateException("AudioRecord read failed: " + read);
                    } catch (Throwable th3) {
                        if (0 == 0) {
                            dVar2.c(byteBuffer);
                        }
                        if (!dVar2.f52730n) {
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
