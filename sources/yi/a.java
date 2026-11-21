package yi;

import android.media.AudioRecord;
import android.os.Handler;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import ji.o;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.ke;
import org.telegram.messenger.ks;
import org.telegram.messenger.vr;
import org.telegram.ui.qx0;
public final class a implements Runnable {
    public final int f61338a;
    public final org.telegram.utils.recorder.audio.d f61339b;

    public a(org.telegram.utils.recorder.audio.d dVar, int i7) {
        this.f61338a = i7;
        this.f61339b = dVar;
    }

    @Override
    public final void run() {
        double sqrt;
        switch (this.f61338a) {
            case 0:
                org.telegram.utils.recorder.audio.d dVar = this.f61339b;
                try {
                    if (dVar.f54696n) {
                        dVar.e(null);
                        return;
                    }
                    int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
                    if (minBufferSize <= 0) {
                        minBufferSize = 7680;
                    }
                    int max = Math.max(minBufferSize * 2, 7680);
                    AudioRecord audioRecord = new AudioRecord(0, 48000, 16, 2, max);
                    dVar.f54698p = audioRecord;
                    if (audioRecord.getState() == 1) {
                        dVar.f54698p.startRecording();
                        if (dVar.f54698p.getRecordingState() == 3) {
                            dVar.f54689f.b("AudioRecord started: minBufferBytes=" + minBufferSize + ", bufferBytes=" + max + ", sessionId=" + dVar.f54698p.getAudioSessionId());
                            dVar.f54700r = SystemClock.elapsedRealtime();
                            ac.e eVar = dVar.f54690g;
                            ((j) eVar.f1022c).f61364i.post(new qx0(eVar, eVar.f1020a, 5));
                            dVar.f54691i.post(new a(dVar, 2));
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
                this.f61339b.e(null);
                return;
            default:
                org.telegram.utils.recorder.audio.d dVar2 = this.f61339b;
                if (!dVar2.f54697o) {
                    Exception exc = null;
                    if (dVar2.f54696n) {
                        dVar2.e(null);
                        return;
                    }
                    ByteBuffer byteBuffer = (ByteBuffer) dVar2.f54694l.poll();
                    if (byteBuffer == null) {
                        byteBuffer = ByteBuffer.allocateDirect(1920).order(ByteOrder.nativeOrder());
                    }
                    byteBuffer.clear();
                    boolean z10 = false;
                    try {
                        int read = dVar2.f54698p.read(byteBuffer, byteBuffer.capacity());
                        if (read > 0) {
                            byteBuffer.limit(read);
                            o oVar = vr.f27619k;
                            if (oVar != null && read > 0) {
                                oVar.n(byteBuffer, read, 48000, 2);
                            }
                            int i7 = read / 2;
                            long j3 = 0;
                            for (int i10 = 0; i10 + 1 < read; i10 += 2) {
                                long j10 = byteBuffer.getShort(i10);
                                j3 += j10 * j10;
                            }
                            dVar2.f54699q += i7;
                            dVar2.f54695m.incrementAndGet();
                            dVar2.f54693k.post(new org.telegram.utils.recorder.audio.c(0, dVar2, byteBuffer));
                            try {
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                if (elapsedRealtime - dVar2.f54700r >= 32) {
                                    if (i7 == 0) {
                                        sqrt = 0.0d;
                                    } else {
                                        sqrt = Math.sqrt(j3 / i7);
                                    }
                                    final double d = sqrt;
                                    final ac.e eVar2 = dVar2.f54690g;
                                    final long j11 = dVar2.f54699q;
                                    Handler handler = ((j) eVar2.f1022c).f61364i;
                                    final long j12 = eVar2.f1020a;
                                    handler.post(new Runnable() {
                                        @Override
                                        public final void run() {
                                            j jVar = (j) ac.e.this.f1022c;
                                            if (j12 == jVar.f61370o && jVar.G == 3) {
                                                jVar.f61372q = j11;
                                                long j13 = jVar.j();
                                                double d2 = d;
                                                if (d2 >= 0.0d) {
                                                    MediaController mediaController = ((ke) jVar.f61362f.f17976b).f25051a;
                                                    mediaController.l1 = j13;
                                                    ks.f(mediaController.f22743i1).k(ks.f25169k2, Integer.valueOf(mediaController.f22741h1), Double.valueOf(d2 / 2.0d));
                                                }
                                            }
                                        }
                                    });
                                    dVar2.f54700r = elapsedRealtime;
                                }
                                dVar2.f54691i.post(new a(dVar2, 2));
                                return;
                            } catch (Throwable th3) {
                                th = th3;
                                z10 = true;
                                if (!z10) {
                                    dVar2.c(byteBuffer);
                                }
                                if (!dVar2.f54696n) {
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
