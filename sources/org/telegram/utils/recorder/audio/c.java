package org.telegram.utils.recorder.audio;

import android.os.SystemClock;
import java.nio.ByteBuffer;
import org.telegram.ui.Components.ny0;
import ui.i;
import ui.o;
public final class c implements Runnable {
    public final int f46401a;
    public final Object f46402b;
    public final Object f46403c;

    public c(int i10, Object obj, Object obj2) {
        this.f46401a = i10;
        this.f46402b = obj;
        this.f46403c = obj2;
    }

    @Override
    public final void run() {
        byte[] bArr;
        switch (this.f46401a) {
            case 0:
                d dVar = (d) this.f46402b;
                ByteBuffer byteBuffer = (ByteBuffer) this.f46403c;
                int andDecrement = dVar.f46413m.getAndDecrement();
                try {
                    if (dVar.v == null && !dVar.f46422w) {
                        dVar.f46424y = Math.max(dVar.f46424y, andDecrement);
                        ByteBuffer byteBuffer2 = dVar.f46419s;
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
                        if (elapsedRealtime - dVar.f46423x >= 100) {
                            long d = dVar.f46420t.d();
                            dVar.f46423x = elapsedRealtime;
                            if (d >= 0) {
                                dc.e eVar = dVar.f46408g;
                                ((o) eVar.f8321c).a((i) eVar.f8320b, d);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        if (dVar.v == null) {
                            dVar.f46407f.a("encoding failed", th2);
                            dVar.v = d.a(th2);
                            dVar.f46414n = true;
                        }
                    } finally {
                        dVar.c(byteBuffer);
                    }
                }
                return;
            default:
                o oVar = (o) this.f46402b;
                i iVar = (i) this.f46403c;
                try {
                    bArr = AudioRecorderNative.e(iVar.f49930b.getAbsolutePath());
                } catch (Throwable th3) {
                    oVar.h.a("waveform extraction failed", th3);
                    bArr = null;
                }
                oVar.f49951i.post(new ny0(oVar, iVar, bArr, 16));
                return;
        }
    }
}
