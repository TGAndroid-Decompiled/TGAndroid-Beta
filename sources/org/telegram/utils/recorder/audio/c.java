package org.telegram.utils.recorder.audio;

import android.os.SystemClock;
import java.nio.ByteBuffer;
import org.telegram.ui.Components.r31;
import vi.g;
import vi.h;
public final class c implements Runnable {
    public final int f52729a;
    public final Object f52730b;
    public final Object f52731c;

    public c(int i7, Object obj, Object obj2) {
        this.f52729a = i7;
        this.f52730b = obj;
        this.f52731c = obj2;
    }

    @Override
    public final void run() {
        byte[] bArr;
        switch (this.f52729a) {
            case 0:
                d dVar = (d) this.f52730b;
                ByteBuffer byteBuffer = (ByteBuffer) this.f52731c;
                int andDecrement = dVar.f52742m.getAndDecrement();
                try {
                    if (dVar.v == null && !dVar.f52751w) {
                        dVar.f52753y = Math.max(dVar.f52753y, andDecrement);
                        ByteBuffer byteBuffer2 = dVar.f52748s;
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
                        if (elapsedRealtime - dVar.f52752x >= 100) {
                            long d = dVar.f52749t.d();
                            dVar.f52752x = elapsedRealtime;
                            if (d >= 0) {
                                ac.e eVar = dVar.f52737g;
                                ((h) eVar.f1025c).a((g) eVar.f1024b, d);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        if (dVar.v == null) {
                            dVar.f52736f.a("encoding failed", th2);
                            dVar.v = d.a(th2);
                            dVar.f52743n = true;
                        }
                    } finally {
                        dVar.c(byteBuffer);
                    }
                }
                return;
            default:
                h hVar = (h) this.f52730b;
                g gVar = (g) this.f52731c;
                try {
                    bArr = AudioRecorderNative.e(gVar.f57549b.getAbsolutePath());
                } catch (Throwable th3) {
                    hVar.h.a("waveform extraction failed", th3);
                    bArr = null;
                }
                hVar.f57558i.post(new r31(hVar, gVar, bArr, 18));
                return;
        }
    }
}
