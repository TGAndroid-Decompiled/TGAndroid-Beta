package yi;

import android.media.AudioRecord;
import android.os.Handler;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import ji.n;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.ke;
import org.telegram.messenger.ks;
import org.telegram.messenger.vr;
import org.telegram.ui.ox0;
public final class a implements Runnable {
    public final int f61426a;
    public final org.telegram.utils.recorder.audio.d f61427b;

    public a(org.telegram.utils.recorder.audio.d dVar, int i7) {
        this.f61426a = i7;
        this.f61427b = dVar;
    }

    @Override
    public final void run() {
        double sqrt;
        switch (this.f61426a) {
            case 0:
                org.telegram.utils.recorder.audio.d dVar = this.f61427b;
                try {
                    if (dVar.f54781n) {
                        dVar.e(null);
                        return;
                    }
                    int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
                    if (minBufferSize <= 0) {
                        minBufferSize = 7680;
                    }
                    int max = Math.max(minBufferSize * 2, 7680);
                    AudioRecord audioRecord = new AudioRecord(0, 48000, 16, 2, max);
                    dVar.f54783p = audioRecord;
                    if (audioRecord.getState() == 1) {
                        dVar.f54783p.startRecording();
                        if (dVar.f54783p.getRecordingState() == 3) {
                            dVar.f54774f.b("AudioRecord started: minBufferBytes=" + minBufferSize + ", bufferBytes=" + max + ", sessionId=" + dVar.f54783p.getAudioSessionId());
                            dVar.f54785r = SystemClock.elapsedRealtime();
                            ac.e eVar = dVar.f54775g;
                            ((j) eVar.f1022c).f61452i.post(new ox0(eVar, eVar.f1020a, 5));
                            dVar.f54776i.post(new a(dVar, 2));
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
                this.f61427b.e(null);
                return;
            default:
                org.telegram.utils.recorder.audio.d dVar2 = this.f61427b;
                if (!dVar2.f54782o) {
                    Exception exc = null;
                    if (dVar2.f54781n) {
                        dVar2.e(null);
                        return;
                    }
                    ByteBuffer byteBuffer = (ByteBuffer) dVar2.f54779l.poll();
                    if (byteBuffer == null) {
                        byteBuffer = ByteBuffer.allocateDirect(1920).order(ByteOrder.nativeOrder());
                    }
                    byteBuffer.clear();
                    boolean z10 = false;
                    try {
                        int read = dVar2.f54783p.read(byteBuffer, byteBuffer.capacity());
                        if (read > 0) {
                            byteBuffer.limit(read);
                            n nVar = vr.f27687k;
                            if (nVar != null && read > 0) {
                                nVar.l(byteBuffer, read, 48000, 2);
                            }
                            int i7 = read / 2;
                            long j3 = 0;
                            for (int i10 = 0; i10 + 1 < read; i10 += 2) {
                                long j10 = byteBuffer.getShort(i10);
                                j3 += j10 * j10;
                            }
                            dVar2.f54784q += i7;
                            dVar2.f54780m.incrementAndGet();
                            dVar2.f54778k.post(new org.telegram.utils.recorder.audio.c(0, dVar2, byteBuffer));
                            try {
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                if (elapsedRealtime - dVar2.f54785r >= 32) {
                                    if (i7 == 0) {
                                        sqrt = 0.0d;
                                    } else {
                                        sqrt = Math.sqrt(j3 / i7);
                                    }
                                    final double d = sqrt;
                                    final ac.e eVar2 = dVar2.f54775g;
                                    final long j11 = dVar2.f54784q;
                                    Handler handler = ((j) eVar2.f1022c).f61452i;
                                    final long j12 = eVar2.f1020a;
                                    handler.post(new Runnable() {
                                        @Override
                                        public final void run() {
                                            j jVar = (j) ac.e.this.f1022c;
                                            if (j12 == jVar.f61458o && jVar.G == 3) {
                                                jVar.f61460q = j11;
                                                long j13 = jVar.j();
                                                double d2 = d;
                                                if (d2 >= 0.0d) {
                                                    MediaController mediaController = ((ke) jVar.f61450f.f17343b).f25122a;
                                                    mediaController.l1 = j13;
                                                    ks.f(mediaController.f22813i1).k(ks.f25240k2, Integer.valueOf(mediaController.f22811h1), Double.valueOf(d2 / 2.0d));
                                                }
                                            }
                                        }
                                    });
                                    dVar2.f54785r = elapsedRealtime;
                                }
                                dVar2.f54776i.post(new a(dVar2, 2));
                                return;
                            } catch (Throwable th3) {
                                th = th3;
                                z10 = true;
                                if (!z10) {
                                    dVar2.c(byteBuffer);
                                }
                                if (!dVar2.f54781n) {
                                    exc = org.telegram.utils.recorder.audio.d.a(th);
                                }
                                dVar2.e(exc);
                                return;
                            }
                        }
                        throw new IllegalStateException("AudioRecord read failed: " + read);
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } else {
                    return;
                }
        }
    }
}
