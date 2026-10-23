package org.telegram.utils.recorder.audio;

import android.os.SystemClock;
import java.nio.ByteBuffer;
import org.telegram.ui.Components.fy0;
import ri.i;
import ri.o;
public final class c implements Runnable {
    public final int f44259a;
    public final Object f44260b;
    public final Object f44261c;

    public c(int i10, Object obj, Object obj2) {
        this.f44259a = i10;
        this.f44260b = obj;
        this.f44261c = obj2;
    }

    @Override
    public final void run() {
        byte[] bArr;
        switch (this.f44259a) {
            case 0:
                d dVar = (d) this.f44260b;
                ByteBuffer byteBuffer = (ByteBuffer) this.f44261c;
                int andDecrement = dVar.f44271m.getAndDecrement();
                try {
                    if (dVar.v == null && !dVar.f44280w) {
                        dVar.f44282y = Math.max(dVar.f44282y, andDecrement);
                        ByteBuffer byteBuffer2 = dVar.f44277s;
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
                        if (elapsedRealtime - dVar.f44281x >= 100) {
                            long d = dVar.f44278t.d();
                            dVar.f44281x = elapsedRealtime;
                            if (d >= 0) {
                                cc.e eVar = dVar.f44266g;
                                ((o) eVar.f5098c).a((i) eVar.f5097b, d);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        if (dVar.v == null) {
                            dVar.f44265f.a("encoding failed", th2);
                            dVar.v = d.a(th2);
                            dVar.f44272n = true;
                        }
                    } finally {
                        dVar.c(byteBuffer);
                    }
                }
                return;
            default:
                o oVar = (o) this.f44260b;
                i iVar = (i) this.f44261c;
                try {
                    bArr = AudioRecorderNative.e(iVar.f46241b.getAbsolutePath());
                } catch (Throwable th3) {
                    oVar.h.a("waveform extraction failed", th3);
                    bArr = null;
                }
                oVar.f46262i.post(new fy0(oVar, iVar, bArr, 16));
                return;
        }
    }
}
