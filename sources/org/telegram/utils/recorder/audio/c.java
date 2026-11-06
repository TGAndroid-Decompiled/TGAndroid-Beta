package org.telegram.utils.recorder.audio;

import android.os.SystemClock;
import java.nio.ByteBuffer;
import org.telegram.ui.Components.r31;
import vi.g;
import vi.h;
public final class c implements Runnable {
    public final int f52712a;
    public final Object f52713b;
    public final Object f52714c;

    public c(int i7, Object obj, Object obj2) {
        this.f52712a = i7;
        this.f52713b = obj;
        this.f52714c = obj2;
    }

    @Override
    public final void run() {
        byte[] bArr;
        switch (this.f52712a) {
            case 0:
                d dVar = (d) this.f52713b;
                ByteBuffer byteBuffer = (ByteBuffer) this.f52714c;
                int andDecrement = dVar.f52725m.getAndDecrement();
                try {
                    if (dVar.v == null && !dVar.f52734w) {
                        dVar.f52736y = Math.max(dVar.f52736y, andDecrement);
                        ByteBuffer byteBuffer2 = dVar.f52731s;
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
                        if (elapsedRealtime - dVar.f52735x >= 100) {
                            long d = dVar.f52732t.d();
                            dVar.f52735x = elapsedRealtime;
                            if (d >= 0) {
                                ac.e eVar = dVar.f52720g;
                                ((h) eVar.f1025c).a((g) eVar.f1024b, d);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        if (dVar.v == null) {
                            dVar.f52719f.a("encoding failed", th2);
                            dVar.v = d.a(th2);
                            dVar.f52726n = true;
                        }
                    } finally {
                        dVar.c(byteBuffer);
                    }
                }
                return;
            default:
                h hVar = (h) this.f52713b;
                g gVar = (g) this.f52714c;
                try {
                    bArr = AudioRecorderNative.e(gVar.f57445b.getAbsolutePath());
                } catch (Throwable th3) {
                    hVar.h.a("waveform extraction failed", th3);
                    bArr = null;
                }
                hVar.f57454i.post(new r31(hVar, gVar, bArr, 18));
                return;
        }
    }
}
