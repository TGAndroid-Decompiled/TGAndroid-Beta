package org.telegram.utils.recorder.audio;

import android.os.SystemClock;
import java.nio.ByteBuffer;
import org.telegram.ui.Components.cy0;
import ri.i;
import ri.o;
public final class c implements Runnable {
    public final int f43843a;
    public final Object f43844b;
    public final Object f43845c;

    public c(int i10, Object obj, Object obj2) {
        this.f43843a = i10;
        this.f43844b = obj;
        this.f43845c = obj2;
    }

    @Override
    public final void run() {
        byte[] bArr;
        switch (this.f43843a) {
            case 0:
                d dVar = (d) this.f43844b;
                ByteBuffer byteBuffer = (ByteBuffer) this.f43845c;
                int andDecrement = dVar.f43855m.getAndDecrement();
                try {
                    if (dVar.v == null && !dVar.f43864w) {
                        dVar.f43866y = Math.max(dVar.f43866y, andDecrement);
                        ByteBuffer byteBuffer2 = dVar.f43861s;
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
                        if (elapsedRealtime - dVar.f43865x >= 100) {
                            long d = dVar.f43862t.d();
                            dVar.f43865x = elapsedRealtime;
                            if (d >= 0) {
                                cc.e eVar = dVar.f43850g;
                                ((o) eVar.f5093c).a((i) eVar.f5092b, d);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        if (dVar.v == null) {
                            dVar.f43849f.a("encoding failed", th2);
                            dVar.v = d.a(th2);
                            dVar.f43856n = true;
                        }
                    } finally {
                        dVar.c(byteBuffer);
                    }
                }
                return;
            default:
                o oVar = (o) this.f43844b;
                i iVar = (i) this.f43845c;
                try {
                    bArr = AudioRecorderNative.e(iVar.f45819b.getAbsolutePath());
                } catch (Throwable th3) {
                    oVar.h.a("waveform extraction failed", th3);
                    bArr = null;
                }
                oVar.f45840i.post(new cy0(oVar, iVar, bArr, 16));
                return;
        }
    }
}
