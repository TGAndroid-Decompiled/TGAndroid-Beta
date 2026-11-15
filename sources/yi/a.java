package yi;

import android.media.AudioRecord;
import android.os.Handler;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import ji.m;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.le;
import org.telegram.messenger.ns;
import org.telegram.messenger.xr;
import org.telegram.ui.n31;
public final class a implements Runnable {
    public final int f60729a;
    public final org.telegram.utils.recorder.audio.d f60730b;

    public a(org.telegram.utils.recorder.audio.d dVar, int i7) {
        this.f60729a = i7;
        this.f60730b = dVar;
    }

    @Override
    public final void run() {
        double sqrt;
        switch (this.f60729a) {
            case 0:
                org.telegram.utils.recorder.audio.d dVar = this.f60730b;
                try {
                    if (dVar.f54136n) {
                        dVar.e(null);
                        return;
                    }
                    int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
                    if (minBufferSize <= 0) {
                        minBufferSize = 7680;
                    }
                    int max = Math.max(minBufferSize * 2, 7680);
                    AudioRecord audioRecord = new AudioRecord(0, 48000, 16, 2, max);
                    dVar.f54138p = audioRecord;
                    if (audioRecord.getState() == 1) {
                        dVar.f54138p.startRecording();
                        if (dVar.f54138p.getRecordingState() == 3) {
                            dVar.f54129f.b("AudioRecord started: minBufferBytes=" + minBufferSize + ", bufferBytes=" + max + ", sessionId=" + dVar.f54138p.getAudioSessionId());
                            dVar.f54140r = SystemClock.elapsedRealtime();
                            ac.e eVar = dVar.f54130g;
                            ((j) eVar.f1023c).f60758i.post(new n31(eVar, eVar.f1021a, 4));
                            dVar.f54131i.post(new a(dVar, 2));
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
                this.f60730b.e(null);
                return;
            default:
                org.telegram.utils.recorder.audio.d dVar2 = this.f60730b;
                if (!dVar2.f54137o) {
                    Exception exc = null;
                    if (dVar2.f54136n) {
                        dVar2.e(null);
                        return;
                    }
                    ByteBuffer byteBuffer = (ByteBuffer) dVar2.f54134l.poll();
                    if (byteBuffer == null) {
                        byteBuffer = ByteBuffer.allocateDirect(1920).order(ByteOrder.nativeOrder());
                    }
                    byteBuffer.clear();
                    boolean z10 = false;
                    try {
                        int read = dVar2.f54138p.read(byteBuffer, byteBuffer.capacity());
                        if (read > 0) {
                            byteBuffer.limit(read);
                            m mVar = xr.f27577k;
                            if (mVar != null && read > 0) {
                                mVar.m(byteBuffer, read, 48000, 2);
                            }
                            int i7 = read / 2;
                            long j3 = 0;
                            for (int i10 = 0; i10 + 1 < read; i10 += 2) {
                                long j10 = byteBuffer.getShort(i10);
                                j3 += j10 * j10;
                            }
                            dVar2.f54139q += i7;
                            dVar2.f54135m.incrementAndGet();
                            dVar2.f54133k.post(new org.telegram.utils.recorder.audio.c(0, dVar2, byteBuffer));
                            try {
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                if (elapsedRealtime - dVar2.f54140r >= 32) {
                                    if (i7 == 0) {
                                        sqrt = 0.0d;
                                    } else {
                                        sqrt = Math.sqrt(j3 / i7);
                                    }
                                    final double d = sqrt;
                                    final ac.e eVar2 = dVar2.f54130g;
                                    final long j11 = dVar2.f54139q;
                                    Handler handler = ((j) eVar2.f1023c).f60758i;
                                    final long j12 = eVar2.f1021a;
                                    handler.post(new Runnable() {
                                        @Override
                                        public final void run() {
                                            j jVar = (j) ac.e.this.f1023c;
                                            if (j12 == jVar.f60764o && jVar.G == 3) {
                                                jVar.f60766q = j11;
                                                long j13 = jVar.j();
                                                double d2 = d;
                                                if (d2 >= 0.0d) {
                                                    MediaController mediaController = ((le) jVar.f60756f.f17555b).f24829a;
                                                    mediaController.l1 = j13;
                                                    ns.f(mediaController.f22352i1).k(ns.f25524k2, Integer.valueOf(mediaController.f22350h1), Double.valueOf(d2 / 2.0d));
                                                }
                                            }
                                        }
                                    });
                                    dVar2.f54140r = elapsedRealtime;
                                }
                                dVar2.f54131i.post(new a(dVar2, 2));
                                return;
                            } catch (Throwable th3) {
                                th = th3;
                                z10 = true;
                                if (!z10) {
                                    dVar2.c(byteBuffer);
                                }
                                if (!dVar2.f54136n) {
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
