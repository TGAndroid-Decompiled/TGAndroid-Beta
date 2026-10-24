package ri;

import android.media.AudioRecord;
import android.os.Handler;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.telegram.ui.nh0;
public final class a implements Runnable {
    public final int f46223a;
    public final org.telegram.utils.recorder.audio.d f46224b;

    public a(org.telegram.utils.recorder.audio.d dVar, int i10) {
        this.f46223a = i10;
        this.f46224b = dVar;
    }

    @Override
    public final void run() {
        double sqrt;
        switch (this.f46223a) {
            case 0:
                org.telegram.utils.recorder.audio.d dVar = this.f46224b;
                try {
                    if (dVar.f44271n) {
                        dVar.e(null);
                        return;
                    }
                    int minBufferSize = AudioRecord.getMinBufferSize(48000, 16, 2);
                    if (minBufferSize <= 0) {
                        minBufferSize = 7680;
                    }
                    int max = Math.max(minBufferSize * 2, 7680);
                    AudioRecord audioRecord = new AudioRecord(0, 48000, 16, 2, max);
                    dVar.f44273p = audioRecord;
                    if (audioRecord.getState() == 1) {
                        dVar.f44273p.startRecording();
                        if (dVar.f44273p.getRecordingState() == 3) {
                            dVar.f44264f.b("AudioRecord started: minBufferBytes=" + minBufferSize + ", bufferBytes=" + max + ", sessionId=" + dVar.f44273p.getAudioSessionId());
                            dVar.f44275r = SystemClock.elapsedRealtime();
                            cc.e eVar = dVar.f44265g;
                            ((o) eVar.f5098c).f46261i.post(new nh0(eVar, eVar.f5096a, 3));
                            dVar.f44266i.post(new a(dVar, 2));
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
                this.f46224b.e(null);
                return;
            default:
                org.telegram.utils.recorder.audio.d dVar2 = this.f46224b;
                if (!dVar2.f44272o) {
                    Exception exc = null;
                    if (dVar2.f44271n) {
                        dVar2.e(null);
                        return;
                    }
                    ByteBuffer byteBuffer = (ByteBuffer) dVar2.f44269l.poll();
                    if (byteBuffer == null) {
                        byteBuffer = ByteBuffer.allocateDirect(1920).order(ByteOrder.nativeOrder());
                    }
                    byteBuffer.clear();
                    try {
                        int read = dVar2.f44273p.read(byteBuffer, byteBuffer.capacity());
                        if (read > 0) {
                            byteBuffer.limit(read);
                            int i10 = read / 2;
                            long j10 = 0;
                            for (int i11 = 0; i11 + 1 < read; i11 += 2) {
                                long j11 = byteBuffer.getShort(i11);
                                j10 += j11 * j11;
                            }
                            dVar2.f44274q += i10;
                            dVar2.f44270m.incrementAndGet();
                            dVar2.f44268k.post(new org.telegram.utils.recorder.audio.c(0, dVar2, byteBuffer));
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (elapsedRealtime - dVar2.f44275r >= 32) {
                                if (i10 == 0) {
                                    sqrt = 0.0d;
                                } else {
                                    sqrt = Math.sqrt(j10 / i10);
                                }
                                final double d = sqrt;
                                final cc.e eVar2 = dVar2.f44265g;
                                final long j12 = dVar2.f44274q;
                                Handler handler = ((o) eVar2.f5098c).f46261i;
                                final long j13 = eVar2.f5096a;
                                handler.post(new Runnable() {
                                    @Override
                                    public final void run() {
                                        o oVar = (o) cc.e.this.f5098c;
                                        if (j13 == oVar.f46268p && oVar.f46266n == m.f46250c) {
                                            oVar.f46270r = j12;
                                            long j14 = oVar.j();
                                            double d10 = d;
                                            if (d10 >= 0.0d) {
                                                oVar.f46259f.onRecordingProgress(j14, d10);
                                            }
                                        }
                                    }
                                });
                                dVar2.f44275r = elapsedRealtime;
                            }
                            dVar2.f44266i.post(new a(dVar2, 2));
                            return;
                        }
                        throw new IllegalStateException("AudioRecord read failed: " + read);
                    } catch (Throwable th3) {
                        if (0 == 0) {
                            dVar2.c(byteBuffer);
                        }
                        if (!dVar2.f44271n) {
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
