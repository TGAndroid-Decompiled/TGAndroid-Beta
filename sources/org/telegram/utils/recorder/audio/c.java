package org.telegram.utils.recorder.audio;

import a3.l0;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import ki.g;
import ki.j;
import ki.k;
public final class c implements Runnable {
    public final int f44273a;
    public final Object f44274b;
    public final Object f44275c;

    public c(int i10, Object obj, Object obj2) {
        this.f44273a = i10;
        this.f44274b = obj;
        this.f44275c = obj2;
    }

    @Override
    public final void run() {
        byte[] bArr;
        switch (this.f44273a) {
            case 0:
                d dVar = (d) this.f44274b;
                ByteBuffer byteBuffer = (ByteBuffer) this.f44275c;
                int andDecrement = dVar.f44285m.getAndDecrement();
                try {
                    if (dVar.v == null && !dVar.f44294w) {
                        dVar.f44296y = Math.max(dVar.f44296y, andDecrement);
                        ByteBuffer byteBuffer2 = dVar.f44291s;
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
                        if (elapsedRealtime - dVar.f44295x >= 100) {
                            long d = dVar.f44292t.d();
                            dVar.f44295x = elapsedRealtime;
                            if (d >= 0) {
                                g gVar = dVar.f44280g;
                                ((k) gVar.f11405c).a((j) gVar.f11404b, d);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        if (dVar.v == null) {
                            dVar.f44279f.a("encoding failed", th2);
                            dVar.v = d.a(th2);
                            dVar.f44286n = true;
                        }
                    } finally {
                        dVar.c(byteBuffer);
                    }
                }
                return;
            default:
                k kVar = (k) this.f44274b;
                j jVar = (j) this.f44275c;
                try {
                    bArr = AudioRecorderNative.e(jVar.f11410b.getAbsolutePath());
                } catch (Throwable th3) {
                    kVar.h.a("waveform extraction failed", th3);
                    bArr = null;
                }
                kVar.f11417i.post(new l0(kVar, jVar, bArr, 28));
                return;
        }
    }
}
