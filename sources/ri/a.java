package ri;

import android.media.AudioRecord;
import android.os.Handler;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.telegram.ui.kh0;
public final class a implements Runnable {
    public final int f45802a;
    public final org.telegram.utils.recorder.audio.d f45803b;

    public a(org.telegram.utils.recorder.audio.d dVar, int i10) {
        this.f45802a = i10;
        this.f45803b = dVar;
    }

    @Override
    public final void run() {
        double sqrt;
        switch (this.f45802a) {
            case 0:
                org.telegram.utils.recorder.audio.d dVar = this.f45803b;
                try {
                    if (dVar.f43856n) {
                        dVar.e(null);
                        return;
                    }
                    int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
                    if (minBufferSize <= 0) {
                        minBufferSize = 7680;
                    }
                    int max = Math.max(minBufferSize * 2, 7680);
                    AudioRecord audioRecord = new AudioRecord(0, 48000, 16, 2, max);
                    dVar.f43858p = audioRecord;
                    if (audioRecord.getState() == 1) {
                        dVar.f43858p.startRecording();
                        if (dVar.f43858p.getRecordingState() == 3) {
                            dVar.f43849f.b("AudioRecord started: minBufferBytes=" + minBufferSize + ", bufferBytes=" + max + ", sessionId=" + dVar.f43858p.getAudioSessionId());
                            dVar.f43860r = SystemClock.elapsedRealtime();
                            cc.e eVar = dVar.f43850g;
                            ((o) eVar.f5093c).f45840i.post(new kh0(eVar, eVar.f5091a, 3));
                            dVar.f43851i.post(new a(dVar, 2));
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
                this.f45803b.e(null);
                return;
            default:
                org.telegram.utils.recorder.audio.d dVar2 = this.f45803b;
                if (!dVar2.f43857o) {
                    Exception exc = null;
                    if (dVar2.f43856n) {
                        dVar2.e(null);
                        return;
                    }
                    ByteBuffer byteBuffer = (ByteBuffer) dVar2.f43854l.poll();
                    if (byteBuffer == null) {
                        byteBuffer = ByteBuffer.allocateDirect(1920).order(ByteOrder.nativeOrder());
                    }
                    byteBuffer.clear();
                    try {
                        int read = dVar2.f43858p.read(byteBuffer, byteBuffer.capacity());
                        if (read > 0) {
                            byteBuffer.limit(read);
                            int i10 = read / 2;
                            long j10 = 0;
                            for (int i11 = 0; i11 + 1 < read; i11 += 2) {
                                long j11 = byteBuffer.getShort(i11);
                                j10 += j11 * j11;
                            }
                            dVar2.f43859q += i10;
                            dVar2.f43855m.incrementAndGet();
                            dVar2.f43853k.post(new org.telegram.utils.recorder.audio.c(0, dVar2, byteBuffer));
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (elapsedRealtime - dVar2.f43860r >= 32) {
                                if (i10 == 0) {
                                    sqrt = 0.0d;
                                } else {
                                    sqrt = Math.sqrt(j10 / i10);
                                }
                                final double d = sqrt;
                                final cc.e eVar2 = dVar2.f43850g;
                                final long j12 = dVar2.f43859q;
                                Handler handler = ((o) eVar2.f5093c).f45840i;
                                final long j13 = eVar2.f5091a;
                                handler.post(new Runnable() {
                                    @Override
                                    public final void run() {
                                        o oVar = (o) cc.e.this.f5093c;
                                        if (j13 == oVar.f45847p && oVar.f45845n == m.f45829c) {
                                            oVar.f45849r = j12;
                                            long j14 = oVar.j();
                                            double d10 = d;
                                            if (d10 >= 0.0d) {
                                                oVar.f45838f.onRecordingProgress(j14, d10);
                                            }
                                        }
                                    }
                                });
                                dVar2.f43860r = elapsedRealtime;
                            }
                            dVar2.f43851i.post(new a(dVar2, 2));
                            return;
                        }
                        throw new IllegalStateException("AudioRecord read failed: " + read);
                    } catch (Throwable th3) {
                        if (0 == 0) {
                            dVar2.c(byteBuffer);
                        }
                        if (!dVar2.f43856n) {
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
