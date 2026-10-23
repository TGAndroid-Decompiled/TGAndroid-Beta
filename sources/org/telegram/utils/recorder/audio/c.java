package org.telegram.utils.recorder.audio;

import android.os.SystemClock;
import java.nio.ByteBuffer;
import org.telegram.ui.Components.cy0;
import ri.i;
import ri.o;
public final class c implements Runnable {
    public final int f43844a;
    public final Object f43845b;
    public final Object f43846c;

    public c(int i10, Object obj, Object obj2) {
        this.f43844a = i10;
        this.f43845b = obj;
        this.f43846c = obj2;
    }

    @Override
    public final void run() {
        byte[] bArr;
        switch (this.f43844a) {
            case 0:
                d dVar = (d) this.f43845b;
                ByteBuffer byteBuffer = (ByteBuffer) this.f43846c;
                int andDecrement = dVar.f43856m.getAndDecrement();
                try {
                    if (dVar.v == null && !dVar.f43865w) {
                        dVar.f43867y = Math.max(dVar.f43867y, andDecrement);
                        ByteBuffer byteBuffer2 = dVar.f43862s;
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
                        if (elapsedRealtime - dVar.f43866x >= 100) {
                            long d = dVar.f43863t.d();
                            dVar.f43866x = elapsedRealtime;
                            if (d >= 0) {
                                cc.e eVar = dVar.f43851g;
                                ((o) eVar.f5093c).a((i) eVar.f5092b, d);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        if (dVar.v == null) {
                            dVar.f43850f.a("encoding failed", th2);
                            dVar.v = d.a(th2);
                            dVar.f43857n = true;
                        }
                    } finally {
                        dVar.c(byteBuffer);
                    }
                }
                return;
            default:
                o oVar = (o) this.f43845b;
                i iVar = (i) this.f43846c;
                try {
                    bArr = AudioRecorderNative.e(iVar.f45820b.getAbsolutePath());
                } catch (Throwable th3) {
                    oVar.h.a("waveform extraction failed", th3);
                    bArr = null;
                }
                oVar.f45841i.post(new cy0(oVar, iVar, bArr, 16));
                return;
        }
    }
}
