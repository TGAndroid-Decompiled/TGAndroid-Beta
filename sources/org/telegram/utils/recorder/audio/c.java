package org.telegram.utils.recorder.audio;

import android.os.SystemClock;
import java.nio.ByteBuffer;
import org.telegram.ui.Components.oy0;
import ui.i;
import ui.o;
public final class c implements Runnable {
    public final int f46439a;
    public final Object f46440b;
    public final Object f46441c;

    public c(int i10, Object obj, Object obj2) {
        this.f46439a = i10;
        this.f46440b = obj;
        this.f46441c = obj2;
    }

    @Override
    public final void run() {
        byte[] bArr;
        switch (this.f46439a) {
            case 0:
                d dVar = (d) this.f46440b;
                ByteBuffer byteBuffer = (ByteBuffer) this.f46441c;
                int andDecrement = dVar.f46451m.getAndDecrement();
                try {
                    if (dVar.v == null && !dVar.f46460w) {
                        dVar.f46462y = Math.max(dVar.f46462y, andDecrement);
                        ByteBuffer byteBuffer2 = dVar.f46457s;
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
                        if (elapsedRealtime - dVar.f46461x >= 100) {
                            long d = dVar.f46458t.d();
                            dVar.f46461x = elapsedRealtime;
                            if (d >= 0) {
                                dc.e eVar = dVar.f46446g;
                                ((o) eVar.f8321c).a((i) eVar.f8320b, d);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        if (dVar.v == null) {
                            dVar.f46445f.a("encoding failed", th2);
                            dVar.v = d.a(th2);
                            dVar.f46452n = true;
                        }
                    } finally {
                        dVar.c(byteBuffer);
                    }
                }
                return;
            default:
                o oVar = (o) this.f46440b;
                i iVar = (i) this.f46441c;
                try {
                    bArr = AudioRecorderNative.e(iVar.f49968b.getAbsolutePath());
                } catch (Throwable th3) {
                    oVar.h.a("waveform extraction failed", th3);
                    bArr = null;
                }
                oVar.f49989i.post(new oy0(oVar, iVar, bArr, 16));
                return;
        }
    }
}
