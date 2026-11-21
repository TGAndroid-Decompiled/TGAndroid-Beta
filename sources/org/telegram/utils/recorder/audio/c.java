package org.telegram.utils.recorder.audio;

import android.os.SystemClock;
import java.nio.ByteBuffer;
import wg.p;
import yi.h;
import yi.j;
public final class c implements Runnable {
    public final int f54682a;
    public final Object f54683b;
    public final Object f54684c;

    public c(int i7, Object obj, Object obj2) {
        this.f54682a = i7;
        this.f54683b = obj;
        this.f54684c = obj2;
    }

    @Override
    public final void run() {
        byte[] bArr;
        switch (this.f54682a) {
            case 0:
                d dVar = (d) this.f54683b;
                ByteBuffer byteBuffer = (ByteBuffer) this.f54684c;
                int andDecrement = dVar.f54695m.getAndDecrement();
                try {
                    if (dVar.v == null && !dVar.f54704w) {
                        dVar.f54706y = Math.max(dVar.f54706y, andDecrement);
                        ByteBuffer byteBuffer2 = dVar.f54701s;
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
                        if (elapsedRealtime - dVar.f54705x >= 100) {
                            long d = dVar.f54702t.d();
                            dVar.f54705x = elapsedRealtime;
                            if (d >= 0) {
                                ac.e eVar = dVar.f54690g;
                                ((j) eVar.f1022c).a((h) eVar.f1021b, d);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        if (dVar.v == null) {
                            dVar.f54689f.a("encoding failed", th2);
                            dVar.v = d.a(th2);
                            dVar.f54696n = true;
                        }
                    } finally {
                        dVar.c(byteBuffer);
                    }
                }
                return;
            default:
                j jVar = (j) this.f54683b;
                h hVar = (h) this.f54684c;
                try {
                    bArr = AudioRecorderNative.e(hVar.f61355b.getAbsolutePath());
                } catch (Throwable th3) {
                    jVar.h.a("waveform extraction failed", th3);
                    bArr = null;
                }
                jVar.f61364i.post(new p(jVar, hVar, bArr, 5));
                return;
        }
    }
}
