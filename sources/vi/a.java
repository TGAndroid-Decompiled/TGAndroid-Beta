package vi;

import android.media.AudioRecord;
import android.os.Handler;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.ge;
import org.telegram.messenger.hs;
import org.telegram.ui.f31;
public final class a implements Runnable {
    public final int f56958a;
    public final org.telegram.utils.recorder.audio.d f56959b;

    public a(org.telegram.utils.recorder.audio.d dVar, int i3) {
        this.f56958a = i3;
        this.f56959b = dVar;
    }

    @Override
    public final void run() {
        double sqrt;
        switch (this.f56958a) {
            case 0:
                org.telegram.utils.recorder.audio.d dVar = this.f56959b;
                try {
                    if (dVar.f52794n) {
                        dVar.e(null);
                        return;
                    }
                    int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
                    if (minBufferSize <= 0) {
                        minBufferSize = 7680;
                    }
                    int max = Math.max(minBufferSize * 2, 7680);
                    AudioRecord audioRecord = new AudioRecord(0, 48000, 16, 2, max);
                    dVar.f52796p = audioRecord;
                    if (audioRecord.getState() == 1) {
                        dVar.f52796p.startRecording();
                        if (dVar.f52796p.getRecordingState() == 3) {
                            dVar.f52787f.b("AudioRecord started: minBufferBytes=" + minBufferSize + ", bufferBytes=" + max + ", sessionId=" + dVar.f52796p.getAudioSessionId());
                            dVar.f52798r = SystemClock.elapsedRealtime();
                            f fVar = dVar.f52788g;
                            ((j) fVar.f56973c).f56987i.post(new f31(fVar, fVar.f56971a, 2));
                            dVar.f52789i.post(new a(dVar, 2));
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
                this.f56959b.e(null);
                return;
            default:
                org.telegram.utils.recorder.audio.d dVar2 = this.f56959b;
                if (!dVar2.f52795o) {
                    Exception exc = null;
                    if (dVar2.f52794n) {
                        dVar2.e(null);
                        return;
                    }
                    ByteBuffer byteBuffer = (ByteBuffer) dVar2.f52792l.poll();
                    if (byteBuffer == null) {
                        byteBuffer = ByteBuffer.allocateDirect(1920).order(ByteOrder.nativeOrder());
                    }
                    byteBuffer.clear();
                    try {
                        int read = dVar2.f52796p.read(byteBuffer, byteBuffer.capacity());
                        if (read > 0) {
                            byteBuffer.limit(read);
                            int i3 = read / 2;
                            long j10 = 0;
                            for (int i10 = 0; i10 + 1 < read; i10 += 2) {
                                long j11 = byteBuffer.getShort(i10);
                                j10 += j11 * j11;
                            }
                            dVar2.f52797q += i3;
                            dVar2.f52793m.incrementAndGet();
                            dVar2.f52791k.post(new org.telegram.utils.recorder.audio.c(0, dVar2, byteBuffer));
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (elapsedRealtime - dVar2.f52798r >= 32) {
                                if (i3 == 0) {
                                    sqrt = 0.0d;
                                } else {
                                    sqrt = Math.sqrt(j10 / i3);
                                }
                                final double d = sqrt;
                                final f fVar2 = dVar2.f52788g;
                                final long j12 = dVar2.f52797q;
                                Handler handler = ((j) fVar2.f56973c).f56987i;
                                final long j13 = fVar2.f56971a;
                                handler.post(new Runnable() {
                                    @Override
                                    public final void run() {
                                        j jVar = (j) f.this.f56973c;
                                        if (j13 == jVar.f56993o && jVar.G == 3) {
                                            jVar.f56995q = j12;
                                            long j14 = jVar.j();
                                            double d10 = d;
                                            if (d10 >= 0.0d) {
                                                MediaController mediaController = ((ge) jVar.f56985f.f19644b).f22707a;
                                                mediaController.f21328l1 = j14;
                                                hs.f(mediaController.f21323i1).k(hs.f23255k2, Integer.valueOf(mediaController.f21321h1), Double.valueOf(d10 / 2.0d));
                                            }
                                        }
                                    }
                                });
                                dVar2.f52798r = elapsedRealtime;
                            }
                            dVar2.f52789i.post(new a(dVar2, 2));
                            return;
                        }
                        throw new IllegalStateException("AudioRecord read failed: " + read);
                    } catch (Throwable th3) {
                        if (0 == 0) {
                            dVar2.c(byteBuffer);
                        }
                        if (!dVar2.f52794n) {
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
