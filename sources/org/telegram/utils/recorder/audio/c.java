package org.telegram.utils.recorder.audio;

import android.os.SystemClock;
import java.nio.ByteBuffer;
import org.telegram.ui.Components.q31;
import vi.g;
import vi.h;
public final class c implements Runnable {
    public final int f52714a;
    public final Object f52715b;
    public final Object f52716c;

    public c(int i7, Object obj, Object obj2) {
        this.f52714a = i7;
        this.f52715b = obj;
        this.f52716c = obj2;
    }

    @Override
    public final void run() {
        byte[] bArr;
        switch (this.f52714a) {
            case 0:
                d dVar = (d) this.f52715b;
                ByteBuffer byteBuffer = (ByteBuffer) this.f52716c;
                int andDecrement = dVar.f52727m.getAndDecrement();
                try {
                    if (dVar.v == null && !dVar.f52736w) {
                        dVar.f52738y = Math.max(dVar.f52738y, andDecrement);
                        ByteBuffer byteBuffer2 = dVar.f52733s;
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
                        if (elapsedRealtime - dVar.f52737x >= 100) {
                            long d = dVar.f52734t.d();
                            dVar.f52737x = elapsedRealtime;
                            if (d >= 0) {
                                ac.e eVar = dVar.f52722g;
                                ((h) eVar.f1025c).a((g) eVar.f1024b, d);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        if (dVar.v == null) {
                            dVar.f52721f.a("encoding failed", th2);
                            dVar.v = d.a(th2);
                            dVar.f52728n = true;
                        }
                    } finally {
                        dVar.c(byteBuffer);
                    }
                }
                return;
            default:
                h hVar = (h) this.f52715b;
                g gVar = (g) this.f52716c;
                try {
                    bArr = AudioRecorderNative.e(gVar.f57446b.getAbsolutePath());
                } catch (Throwable th3) {
                    hVar.h.a("waveform extraction failed", th3);
                    bArr = null;
                }
                hVar.f57455i.post(new q31(hVar, gVar, bArr, 18));
                return;
        }
    }
}
