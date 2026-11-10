package vi;

import android.media.AudioRecord;
import android.os.Handler;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.me;
import org.telegram.messenger.qs;
import org.telegram.ui.r31;
public final class a implements Runnable {
    public final int f57532a;
    public final org.telegram.utils.recorder.audio.d f57533b;

    public a(org.telegram.utils.recorder.audio.d dVar, int i7) {
        this.f57532a = i7;
        this.f57533b = dVar;
    }

    @Override
    public final void run() {
        double sqrt;
        switch (this.f57532a) {
            case 0:
                org.telegram.utils.recorder.audio.d dVar = this.f57533b;
                try {
                    if (dVar.f52743n) {
                        dVar.e(null);
                        return;
                    }
                    int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
                    if (minBufferSize <= 0) {
                        minBufferSize = 7680;
                    }
                    int max = Math.max(minBufferSize * 2, 7680);
                    AudioRecord audioRecord = new AudioRecord(0, 48000, 16, 2, max);
                    dVar.f52745p = audioRecord;
                    if (audioRecord.getState() == 1) {
                        dVar.f52745p.startRecording();
                        if (dVar.f52745p.getRecordingState() == 3) {
                            dVar.f52736f.b("AudioRecord started: minBufferBytes=" + minBufferSize + ", bufferBytes=" + max + ", sessionId=" + dVar.f52745p.getAudioSessionId());
                            dVar.f52747r = SystemClock.elapsedRealtime();
                            ac.e eVar = dVar.f52737g;
                            ((h) eVar.f1025c).f57558i.post(new r31(eVar, eVar.f1023a, 3));
                            dVar.f52738i.post(new a(dVar, 2));
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
                this.f57533b.e(null);
                return;
            default:
                org.telegram.utils.recorder.audio.d dVar2 = this.f57533b;
                if (!dVar2.f52744o) {
                    Exception exc = null;
                    if (dVar2.f52743n) {
                        dVar2.e(null);
                        return;
                    }
                    ByteBuffer byteBuffer = (ByteBuffer) dVar2.f52741l.poll();
                    if (byteBuffer == null) {
                        byteBuffer = ByteBuffer.allocateDirect(1920).order(ByteOrder.nativeOrder());
                    }
                    byteBuffer.clear();
                    try {
                        int read = dVar2.f52745p.read(byteBuffer, byteBuffer.capacity());
                        if (read > 0) {
                            byteBuffer.limit(read);
                            int i7 = read / 2;
                            long j3 = 0;
                            for (int i10 = 0; i10 + 1 < read; i10 += 2) {
                                long j10 = byteBuffer.getShort(i10);
                                j3 += j10 * j10;
                            }
                            dVar2.f52746q += i7;
                            dVar2.f52742m.incrementAndGet();
                            dVar2.f52740k.post(new org.telegram.utils.recorder.audio.c(0, dVar2, byteBuffer));
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (elapsedRealtime - dVar2.f52747r >= 32) {
                                if (i7 == 0) {
                                    sqrt = 0.0d;
                                } else {
                                    sqrt = Math.sqrt(j3 / i7);
                                }
                                final double d = sqrt;
                                final ac.e eVar2 = dVar2.f52737g;
                                final long j11 = dVar2.f52746q;
                                Handler handler = ((h) eVar2.f1025c).f57558i;
                                final long j12 = eVar2.f1023a;
                                handler.post(new Runnable() {
                                    @Override
                                    public final void run() {
                                        h hVar = (h) ac.e.this.f1025c;
                                        if (j12 == hVar.f57564o && hVar.G == 3) {
                                            hVar.f57566q = j11;
                                            long j13 = hVar.j();
                                            double d2 = d;
                                            if (d2 >= 0.0d) {
                                                MediaController mediaController = ((me) hVar.f57556f.f16456b).f24015a;
                                                mediaController.f21281k1 = j13;
                                                qs.f(mediaController.f21275h1).k(qs.f25031k2, Integer.valueOf(mediaController.f21273g1), Double.valueOf(d2 / 2.0d));
                                            }
                                        }
                                    }
                                });
                                dVar2.f52747r = elapsedRealtime;
                            }
                            dVar2.f52738i.post(new a(dVar2, 2));
                            return;
                        }
                        throw new IllegalStateException("AudioRecord read failed: " + read);
                    } catch (Throwable th3) {
                        if (0 == 0) {
                            dVar2.c(byteBuffer);
                        }
                        if (!dVar2.f52743n) {
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
