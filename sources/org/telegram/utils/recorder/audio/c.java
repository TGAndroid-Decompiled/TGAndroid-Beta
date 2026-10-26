package org.telegram.utils.recorder.audio;

import android.os.SystemClock;
import java.nio.ByteBuffer;
import org.telegram.ui.Components.ny0;
import ui.i;
import ui.o;
public final class c implements Runnable {
    public final int f46404a;
    public final Object f46405b;
    public final Object f46406c;

    public c(int i10, Object obj, Object obj2) {
        this.f46404a = i10;
        this.f46405b = obj;
        this.f46406c = obj2;
    }

    @Override
    public final void run() {
        byte[] bArr;
        switch (this.f46404a) {
            case 0:
                d dVar = (d) this.f46405b;
                ByteBuffer byteBuffer = (ByteBuffer) this.f46406c;
                int andDecrement = dVar.f46416m.getAndDecrement();
                try {
                    if (dVar.v == null && !dVar.f46425w) {
                        dVar.f46427y = Math.max(dVar.f46427y, andDecrement);
                        ByteBuffer byteBuffer2 = dVar.f46422s;
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
                        if (elapsedRealtime - dVar.f46426x >= 100) {
                            long d = dVar.f46423t.d();
                            dVar.f46426x = elapsedRealtime;
                            if (d >= 0) {
                                dc.e eVar = dVar.f46411g;
                                ((o) eVar.f8321c).a((i) eVar.f8320b, d);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        if (dVar.v == null) {
                            dVar.f46410f.a("encoding failed", th2);
                            dVar.v = d.a(th2);
                            dVar.f46417n = true;
                        }
                    } finally {
                        dVar.c(byteBuffer);
                    }
                }
                return;
            default:
                o oVar = (o) this.f46405b;
                i iVar = (i) this.f46406c;
                try {
                    bArr = AudioRecorderNative.e(iVar.f49933b.getAbsolutePath());
                } catch (Throwable th3) {
                    oVar.h.a("waveform extraction failed", th3);
                    bArr = null;
                }
                oVar.f49954i.post(new ny0(oVar, iVar, bArr, 16));
                return;
        }
    }
}
