package org.telegram.utils.recorder.audio;

import a3.l0;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import ki.g;
import ki.j;
import ki.k;
public final class c implements Runnable {
    public final int f44277a;
    public final Object f44278b;
    public final Object f44279c;

    public c(int i10, Object obj, Object obj2) {
        this.f44277a = i10;
        this.f44278b = obj;
        this.f44279c = obj2;
    }

    @Override
    public final void run() {
        byte[] bArr;
        switch (this.f44277a) {
            case 0:
                d dVar = (d) this.f44278b;
                ByteBuffer byteBuffer = (ByteBuffer) this.f44279c;
                int andDecrement = dVar.f44289m.getAndDecrement();
                try {
                    if (dVar.v == null && !dVar.f44298w) {
                        dVar.f44300y = Math.max(dVar.f44300y, andDecrement);
                        ByteBuffer byteBuffer2 = dVar.f44295s;
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
                        if (elapsedRealtime - dVar.f44299x >= 100) {
                            long d = dVar.f44296t.d();
                            dVar.f44299x = elapsedRealtime;
                            if (d >= 0) {
                                g gVar = dVar.f44284g;
                                ((k) gVar.f11406c).a((j) gVar.f11405b, d);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        if (dVar.v == null) {
                            dVar.f44283f.a("encoding failed", th2);
                            dVar.v = d.a(th2);
                            dVar.f44290n = true;
                        }
                    } finally {
                        dVar.c(byteBuffer);
                    }
                }
                return;
            default:
                k kVar = (k) this.f44278b;
                j jVar = (j) this.f44279c;
                try {
                    bArr = AudioRecorderNative.e(jVar.f11411b.getAbsolutePath());
                } catch (Throwable th3) {
                    kVar.h.a("waveform extraction failed", th3);
                    bArr = null;
                }
                kVar.f11418i.post(new l0(kVar, jVar, bArr, 28));
                return;
        }
    }
}
