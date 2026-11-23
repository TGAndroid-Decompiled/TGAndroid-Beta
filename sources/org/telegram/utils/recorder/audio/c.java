package org.telegram.utils.recorder.audio;

import android.os.SystemClock;
import java.nio.ByteBuffer;
import wg.p;
import yi.h;
import yi.j;
public final class c implements Runnable {
    public final int f54767a;
    public final Object f54768b;
    public final Object f54769c;

    public c(int i7, Object obj, Object obj2) {
        this.f54767a = i7;
        this.f54768b = obj;
        this.f54769c = obj2;
    }

    @Override
    public final void run() {
        byte[] bArr;
        switch (this.f54767a) {
            case 0:
                d dVar = (d) this.f54768b;
                ByteBuffer byteBuffer = (ByteBuffer) this.f54769c;
                int andDecrement = dVar.f54780m.getAndDecrement();
                try {
                    if (dVar.v == null && !dVar.f54789w) {
                        dVar.f54791y = Math.max(dVar.f54791y, andDecrement);
                        ByteBuffer byteBuffer2 = dVar.f54786s;
                        byteBuffer.position(0);
                        while (byteBuffer.hasRemaining()) {
                            int min = Math.min(byteBuffer.remaining(), byteBuffer2.remaining());
                            int limit = byteBuffer.limit();
                            byteBuffer.limit(byteBuffer.position() + min);
                            byteBuffer2.put(byteBuffer);
                            byteBuffer.limit(limit);
                            if (!byteBuffer2.hasRemaining()) {
                                dVar.b(1920);
                                byteBuffer2.clear();
                            }
                        }
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (elapsedRealtime - dVar.f54790x >= 100) {
                            long d = dVar.f54787t.d();
                            dVar.f54790x = elapsedRealtime;
                            if (d >= 0) {
                                ac.e eVar = dVar.f54775g;
                                ((j) eVar.f1022c).a((h) eVar.f1021b, d);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        if (dVar.v == null) {
                            dVar.f54774f.a("encoding failed", th2);
                            dVar.v = d.a(th2);
                            dVar.f54781n = true;
                        }
                    } finally {
                        dVar.c(byteBuffer);
                    }
                }
                return;
            default:
                j jVar = (j) this.f54768b;
                h hVar = (h) this.f54769c;
                try {
                    bArr = AudioRecorderNative.e(hVar.f61443b.getAbsolutePath());
                } catch (Throwable th3) {
                    jVar.h.a("waveform extraction failed", th3);
                    bArr = null;
                }
                jVar.f61452i.post(new p(jVar, hVar, bArr, 6));
                return;
        }
    }
}
