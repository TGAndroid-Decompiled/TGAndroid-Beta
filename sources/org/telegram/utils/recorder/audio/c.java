package org.telegram.utils.recorder.audio;

import android.os.SystemClock;
import java.nio.ByteBuffer;
import org.telegram.ui.Components.r31;
import vi.g;
import vi.h;
public final class c implements Runnable {
    public final int f52716a;
    public final Object f52717b;
    public final Object f52718c;

    public c(int i7, Object obj, Object obj2) {
        this.f52716a = i7;
        this.f52717b = obj;
        this.f52718c = obj2;
    }

    @Override
    public final void run() {
        byte[] bArr;
        switch (this.f52716a) {
            case 0:
                d dVar = (d) this.f52717b;
                ByteBuffer byteBuffer = (ByteBuffer) this.f52718c;
                int andDecrement = dVar.f52729m.getAndDecrement();
                try {
                    if (dVar.v == null && !dVar.f52738w) {
                        dVar.f52740y = Math.max(dVar.f52740y, andDecrement);
                        ByteBuffer byteBuffer2 = dVar.f52735s;
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
                        if (elapsedRealtime - dVar.f52739x >= 100) {
                            long d = dVar.f52736t.d();
                            dVar.f52739x = elapsedRealtime;
                            if (d >= 0) {
                                ac.e eVar = dVar.f52724g;
                                ((h) eVar.f1025c).a((g) eVar.f1024b, d);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        if (dVar.v == null) {
                            dVar.f52723f.a("encoding failed", th2);
                            dVar.v = d.a(th2);
                            dVar.f52730n = true;
                        }
                    } finally {
                        dVar.c(byteBuffer);
                    }
                }
                return;
            default:
                h hVar = (h) this.f52717b;
                g gVar = (g) this.f52718c;
                try {
                    bArr = AudioRecorderNative.e(gVar.f57538b.getAbsolutePath());
                } catch (Throwable th3) {
                    hVar.h.a("waveform extraction failed", th3);
                    bArr = null;
                }
                hVar.f57547i.post(new r31(hVar, gVar, bArr, 18));
                return;
        }
    }
}
