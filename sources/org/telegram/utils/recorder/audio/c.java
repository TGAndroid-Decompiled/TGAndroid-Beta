package org.telegram.utils.recorder.audio;

import android.os.SystemClock;
import java.nio.ByteBuffer;
import org.telegram.ui.Components.l31;
import vi.g;
import vi.h;
public final class c implements Runnable {
    public final int f52688a;
    public final Object f52689b;
    public final Object f52690c;

    public c(int i7, Object obj, Object obj2) {
        this.f52688a = i7;
        this.f52689b = obj;
        this.f52690c = obj2;
    }

    @Override
    public final void run() {
        byte[] bArr;
        switch (this.f52688a) {
            case 0:
                d dVar = (d) this.f52689b;
                ByteBuffer byteBuffer = (ByteBuffer) this.f52690c;
                int andDecrement = dVar.f52701m.getAndDecrement();
                try {
                    if (dVar.v == null && !dVar.f52710w) {
                        dVar.f52712y = Math.max(dVar.f52712y, andDecrement);
                        ByteBuffer byteBuffer2 = dVar.f52707s;
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
                        if (elapsedRealtime - dVar.f52711x >= 100) {
                            long d = dVar.f52708t.d();
                            dVar.f52711x = elapsedRealtime;
                            if (d >= 0) {
                                ac.e eVar = dVar.f52696g;
                                ((h) eVar.f1025c).a((g) eVar.f1024b, d);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        if (dVar.v == null) {
                            dVar.f52695f.a("encoding failed", th2);
                            dVar.v = d.a(th2);
                            dVar.f52702n = true;
                        }
                    } finally {
                        dVar.c(byteBuffer);
                    }
                }
                return;
            default:
                h hVar = (h) this.f52689b;
                g gVar = (g) this.f52690c;
                try {
                    bArr = AudioRecorderNative.e(gVar.f57421b.getAbsolutePath());
                } catch (Throwable th3) {
                    hVar.h.a("waveform extraction failed", th3);
                    bArr = null;
                }
                hVar.f57430i.post(new l31(hVar, gVar, bArr, 18));
                return;
        }
    }
}
