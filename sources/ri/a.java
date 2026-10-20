package ri;

import android.media.AudioRecord;
import android.os.Handler;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.telegram.ui.kh0;
public final class a implements Runnable {
    public final int f45799a;
    public final org.telegram.utils.recorder.audio.d f45800b;

    public a(org.telegram.utils.recorder.audio.d dVar, int i10) {
        this.f45799a = i10;
        this.f45800b = dVar;
    }

    @Override
    public final void run() {
        double sqrt;
        switch (this.f45799a) {
            case 0:
                org.telegram.utils.recorder.audio.d dVar = this.f45800b;
                try {
                    if (dVar.f43853n) {
                        dVar.e(null);
                        return;
                    }
                    int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
                    if (minBufferSize <= 0) {
                        minBufferSize = 7680;
                    }
                    int max = Math.max(minBufferSize * 2, 7680);
                    AudioRecord audioRecord = new AudioRecord(0, 48000, 16, 2, max);
                    dVar.f43855p = audioRecord;
                    if (audioRecord.getState() == 1) {
                        dVar.f43855p.startRecording();
                        if (dVar.f43855p.getRecordingState() == 3) {
                            dVar.f43846f.b("AudioRecord started: minBufferBytes=" + minBufferSize + ", bufferBytes=" + max + ", sessionId=" + dVar.f43855p.getAudioSessionId());
                            dVar.f43857r = SystemClock.elapsedRealtime();
                            cc.e eVar = dVar.f43847g;
                            ((o) eVar.f5093c).f45837i.post(new kh0(eVar, eVar.f5091a, 3));
                            dVar.f43848i.post(new a(dVar, 2));
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
                this.f45800b.e(null);
                return;
            default:
                org.telegram.utils.recorder.audio.d dVar2 = this.f45800b;
                if (!dVar2.f43854o) {
                    Exception exc = null;
                    if (dVar2.f43853n) {
                        dVar2.e(null);
                        return;
                    }
                    ByteBuffer byteBuffer = (ByteBuffer) dVar2.f43851l.poll();
                    if (byteBuffer == null) {
                        byteBuffer = ByteBuffer.allocateDirect(1920).order(ByteOrder.nativeOrder());
                    }
                    byteBuffer.clear();
                    try {
                        int read = dVar2.f43855p.read(byteBuffer, byteBuffer.capacity());
                        if (read > 0) {
                            byteBuffer.limit(read);
                            int i10 = read / 2;
                            long j10 = 0;
                            for (int i11 = 0; i11 + 1 < read; i11 += 2) {
                                long j11 = byteBuffer.getShort(i11);
                                j10 += j11 * j11;
                            }
                            dVar2.f43856q += i10;
                            dVar2.f43852m.incrementAndGet();
                            dVar2.f43850k.post(new org.telegram.utils.recorder.audio.c(0, dVar2, byteBuffer));
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (elapsedRealtime - dVar2.f43857r >= 32) {
                                if (i10 == 0) {
                                    sqrt = 0.0d;
                                } else {
                                    sqrt = Math.sqrt(j10 / i10);
                                }
                                final double d = sqrt;
                                final cc.e eVar2 = dVar2.f43847g;
                                final long j12 = dVar2.f43856q;
                                Handler handler = ((o) eVar2.f5093c).f45837i;
                                final long j13 = eVar2.f5091a;
                                handler.post(new Runnable() {
                                    @Override
                                    public final void run() {
                                        o oVar = (o) cc.e.this.f5093c;
                                        if (j13 == oVar.f45844p && oVar.f45842n == m.f45826c) {
                                            oVar.f45846r = j12;
                                            long j14 = oVar.j();
                                            double d10 = d;
                                            if (d10 >= 0.0d) {
                                                oVar.f45835f.onRecordingProgress(j14, d10);
                                            }
                                        }
                                    }
                                });
                                dVar2.f43857r = elapsedRealtime;
                            }
                            dVar2.f43848i.post(new a(dVar2, 2));
                            return;
                        }
                        throw new IllegalStateException("AudioRecord read failed: " + read);
                    } catch (Throwable th3) {
                        if (0 == 0) {
                            dVar2.c(byteBuffer);
                        }
                        if (!dVar2.f43853n) {
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
