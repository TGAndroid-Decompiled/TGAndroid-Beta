package org.telegram.utils.recorder.audio;

import android.os.SystemClock;
import java.nio.ByteBuffer;
import org.telegram.ui.Components.s31;
import vi.g;
import vi.h;
public final class c implements Runnable {
    public final int f52730a;
    public final Object f52731b;
    public final Object f52732c;

    public c(int i7, Object obj, Object obj2) {
        this.f52730a = i7;
        this.f52731b = obj;
        this.f52732c = obj2;
    }

    @Override
    public final void run() {
        byte[] bArr;
        switch (this.f52730a) {
            case 0:
                d dVar = (d) this.f52731b;
                ByteBuffer byteBuffer = (ByteBuffer) this.f52732c;
                int andDecrement = dVar.f52743m.getAndDecrement();
                try {
                    if (dVar.v == null && !dVar.f52752w) {
                        dVar.f52754y = Math.max(dVar.f52754y, andDecrement);
                        ByteBuffer byteBuffer2 = dVar.f52749s;
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
                        if (elapsedRealtime - dVar.f52753x >= 100) {
                            long d = dVar.f52750t.d();
                            dVar.f52753x = elapsedRealtime;
                            if (d >= 0) {
                                ac.e eVar = dVar.f52738g;
                                ((h) eVar.f1025c).a((g) eVar.f1024b, d);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        if (dVar.v == null) {
                            dVar.f52737f.a("encoding failed", th2);
                            dVar.v = d.a(th2);
                            dVar.f52744n = true;
                        }
                    } finally {
                        dVar.c(byteBuffer);
                    }
                }
                return;
            default:
                h hVar = (h) this.f52731b;
                g gVar = (g) this.f52732c;
                try {
                    bArr = AudioRecorderNative.e(gVar.f57550b.getAbsolutePath());
                } catch (Throwable th3) {
                    hVar.h.a("waveform extraction failed", th3);
                    bArr = null;
                }
                hVar.f57559i.post(new s31(hVar, gVar, bArr, 18));
                return;
        }
    }
}
