package org.telegram.utils.recorder.audio;

import android.os.SystemClock;
import java.nio.ByteBuffer;
import org.telegram.ui.Components.cy0;
import ri.i;
import ri.o;
public final class c implements Runnable {
    public final int f43840a;
    public final Object f43841b;
    public final Object f43842c;

    public c(int i10, Object obj, Object obj2) {
        this.f43840a = i10;
        this.f43841b = obj;
        this.f43842c = obj2;
    }

    @Override
    public final void run() {
        byte[] bArr;
        switch (this.f43840a) {
            case 0:
                d dVar = (d) this.f43841b;
                ByteBuffer byteBuffer = (ByteBuffer) this.f43842c;
                int andDecrement = dVar.f43852m.getAndDecrement();
                try {
                    if (dVar.v == null && !dVar.f43861w) {
                        dVar.f43863y = Math.max(dVar.f43863y, andDecrement);
                        ByteBuffer byteBuffer2 = dVar.f43858s;
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
                        if (elapsedRealtime - dVar.f43862x >= 100) {
                            long d = dVar.f43859t.d();
                            dVar.f43862x = elapsedRealtime;
                            if (d >= 0) {
                                cc.e eVar = dVar.f43847g;
                                ((o) eVar.f5093c).a((i) eVar.f5092b, d);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        if (dVar.v == null) {
                            dVar.f43846f.a("encoding failed", th2);
                            dVar.v = d.a(th2);
                            dVar.f43853n = true;
                        }
                    } finally {
                        dVar.c(byteBuffer);
                    }
                }
                return;
            default:
                o oVar = (o) this.f43841b;
                i iVar = (i) this.f43842c;
                try {
                    bArr = AudioRecorderNative.e(iVar.f45816b.getAbsolutePath());
                } catch (Throwable th3) {
                    oVar.h.a("waveform extraction failed", th3);
                    bArr = null;
                }
                oVar.f45837i.post(new cy0(oVar, iVar, bArr, 16));
                return;
        }
    }
}
