package org.telegram.utils.recorder.audio;

import android.os.SystemClock;
import java.nio.ByteBuffer;
import org.telegram.ui.Components.iv0;
import vi.f;
import vi.i;
import vi.j;
public final class c implements Runnable {
    public final int f52780a;
    public final Object f52781b;
    public final Object f52782c;

    public c(int i3, Object obj, Object obj2) {
        this.f52780a = i3;
        this.f52781b = obj;
        this.f52782c = obj2;
    }

    @Override
    public final void run() {
        byte[] bArr;
        switch (this.f52780a) {
            case 0:
                d dVar = (d) this.f52781b;
                ByteBuffer byteBuffer = (ByteBuffer) this.f52782c;
                int andDecrement = dVar.f52793m.getAndDecrement();
                try {
                    if (dVar.v == null && !dVar.f52802w) {
                        dVar.f52804y = Math.max(dVar.f52804y, andDecrement);
                        ByteBuffer byteBuffer2 = dVar.f52799s;
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
                        if (elapsedRealtime - dVar.f52803x >= 100) {
                            long d = dVar.f52800t.d();
                            dVar.f52803x = elapsedRealtime;
                            if (d >= 0) {
                                f fVar = dVar.f52788g;
                                ((j) fVar.f56973c).a((i) fVar.f56972b, d);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        if (dVar.v == null) {
                            dVar.f52787f.a("encoding failed", th2);
                            dVar.v = d.a(th2);
                            dVar.f52794n = true;
                        }
                    } finally {
                        dVar.c(byteBuffer);
                    }
                }
                return;
            default:
                j jVar = (j) this.f52781b;
                i iVar = (i) this.f52782c;
                try {
                    bArr = AudioRecorderNative.e(iVar.f56978b.getAbsolutePath());
                } catch (Throwable th3) {
                    jVar.h.a("waveform extraction failed", th3);
                    bArr = null;
                }
                jVar.f56987i.post(new iv0(jVar, iVar, bArr, 20));
                return;
        }
    }
}
