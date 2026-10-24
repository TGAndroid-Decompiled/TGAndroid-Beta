package org.telegram.utils.recorder.audio;

import android.os.SystemClock;
import java.nio.ByteBuffer;
import org.telegram.ui.Components.ey0;
import ri.i;
import ri.o;
public final class c implements Runnable {
    public final int f44258a;
    public final Object f44259b;
    public final Object f44260c;

    public c(int i10, Object obj, Object obj2) {
        this.f44258a = i10;
        this.f44259b = obj;
        this.f44260c = obj2;
    }

    @Override
    public final void run() {
        byte[] bArr;
        switch (this.f44258a) {
            case 0:
                d dVar = (d) this.f44259b;
                ByteBuffer byteBuffer = (ByteBuffer) this.f44260c;
                int andDecrement = dVar.f44270m.getAndDecrement();
                try {
                    if (dVar.v == null && !dVar.f44279w) {
                        dVar.f44281y = Math.max(dVar.f44281y, andDecrement);
                        ByteBuffer byteBuffer2 = dVar.f44276s;
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
                        if (elapsedRealtime - dVar.f44280x >= 100) {
                            long d = dVar.f44277t.d();
                            dVar.f44280x = elapsedRealtime;
                            if (d >= 0) {
                                cc.e eVar = dVar.f44265g;
                                ((o) eVar.f5098c).a((i) eVar.f5097b, d);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        if (dVar.v == null) {
                            dVar.f44264f.a("encoding failed", th2);
                            dVar.v = d.a(th2);
                            dVar.f44271n = true;
                        }
                    } finally {
                        dVar.c(byteBuffer);
                    }
                }
                return;
            default:
                o oVar = (o) this.f44259b;
                i iVar = (i) this.f44260c;
                try {
                    bArr = AudioRecorderNative.e(iVar.f46240b.getAbsolutePath());
                } catch (Throwable th3) {
                    oVar.h.a("waveform extraction failed", th3);
                    bArr = null;
                }
                oVar.f46261i.post(new ey0(oVar, iVar, bArr, 16));
                return;
        }
    }
}
