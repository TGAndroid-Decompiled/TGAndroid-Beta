package yi;

import android.media.AudioRecord;
import android.os.Handler;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import ji.n;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.le;
import org.telegram.messenger.ls;
import org.telegram.messenger.wr;
import org.telegram.ui.qx0;
public final class a implements Runnable {
    public final int f61307a;
    public final org.telegram.utils.recorder.audio.d f61308b;

    public a(org.telegram.utils.recorder.audio.d dVar, int i7) {
        this.f61307a = i7;
        this.f61308b = dVar;
    }

    @Override
    public final void run() {
        double sqrt;
        switch (this.f61307a) {
            case 0:
                org.telegram.utils.recorder.audio.d dVar = this.f61308b;
                try {
                    if (dVar.f54665n) {
                        dVar.e(null);
                        return;
                    }
                    int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
                    if (minBufferSize <= 0) {
                        minBufferSize = 7680;
                    }
                    int max = Math.max(minBufferSize * 2, 7680);
                    AudioRecord audioRecord = new AudioRecord(0, 48000, 16, 2, max);
                    dVar.f54667p = audioRecord;
                    if (audioRecord.getState() == 1) {
                        dVar.f54667p.startRecording();
                        if (dVar.f54667p.getRecordingState() == 3) {
                            dVar.f54658f.b("AudioRecord started: minBufferBytes=" + minBufferSize + ", bufferBytes=" + max + ", sessionId=" + dVar.f54667p.getAudioSessionId());
                            dVar.f54669r = SystemClock.elapsedRealtime();
                            ac.e eVar = dVar.f54659g;
                            ((j) eVar.f1022c).f61333i.post(new qx0(eVar, eVar.f1020a, 5));
                            dVar.f54660i.post(new a(dVar, 2));
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
                this.f61308b.e(null);
                return;
            default:
                org.telegram.utils.recorder.audio.d dVar2 = this.f61308b;
                if (!dVar2.f54666o) {
                    Exception exc = null;
                    if (dVar2.f54665n) {
                        dVar2.e(null);
                        return;
                    }
                    ByteBuffer byteBuffer = (ByteBuffer) dVar2.f54663l.poll();
                    if (byteBuffer == null) {
                        byteBuffer = ByteBuffer.allocateDirect(1920).order(ByteOrder.nativeOrder());
                    }
                    byteBuffer.clear();
                    boolean z10 = false;
                    try {
                        int read = dVar2.f54667p.read(byteBuffer, byteBuffer.capacity());
                        if (read > 0) {
                            byteBuffer.limit(read);
                            n nVar = wr.f27759k;
                            if (nVar != null && read > 0) {
                                nVar.n(byteBuffer, read, 48000, 2);
                            }
                            int i7 = read / 2;
                            long j3 = 0;
                            for (int i10 = 0; i10 + 1 < read; i10 += 2) {
                                long j10 = byteBuffer.getShort(i10);
                                j3 += j10 * j10;
                            }
                            dVar2.f54668q += i7;
                            dVar2.f54664m.incrementAndGet();
                            dVar2.f54662k.post(new org.telegram.utils.recorder.audio.c(0, dVar2, byteBuffer));
                            try {
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                if (elapsedRealtime - dVar2.f54669r >= 32) {
                                    if (i7 == 0) {
                                        sqrt = 0.0d;
                                    } else {
                                        sqrt = Math.sqrt(j3 / i7);
                                    }
                                    final double d = sqrt;
                                    final ac.e eVar2 = dVar2.f54659g;
                                    final long j11 = dVar2.f54668q;
                                    Handler handler = ((j) eVar2.f1022c).f61333i;
                                    final long j12 = eVar2.f1020a;
                                    handler.post(new Runnable() {
                                        @Override
                                        public final void run() {
                                            j jVar = (j) ac.e.this.f1022c;
                                            if (j12 == jVar.f61339o && jVar.G == 3) {
                                                jVar.f61341q = j11;
                                                long j13 = jVar.j();
                                                double d2 = d;
                                                if (d2 >= 0.0d) {
                                                    MediaController mediaController = ((le) jVar.f61331f.f17942b).f25181a;
                                                    mediaController.l1 = j13;
                                                    ls.f(mediaController.f22710i1).k(ls.f25299k2, Integer.valueOf(mediaController.f22708h1), Double.valueOf(d2 / 2.0d));
                                                }
                                            }
                                        }
                                    });
                                    dVar2.f54669r = elapsedRealtime;
                                }
                                dVar2.f54660i.post(new a(dVar2, 2));
                                return;
                            } catch (Throwable th3) {
                                th = th3;
                                z10 = true;
                                if (!z10) {
                                    dVar2.c(byteBuffer);
                                }
                                if (!dVar2.f54665n) {
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
