package org.telegram.utils.recorder.audio;

import android.os.SystemClock;
import java.nio.ByteBuffer;
public final class c implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;

    public c(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final void run() {
        byte[] bArr;
        switch (this.a) {
            case 0:
                d dVar = (d) this.b;
                ByteBuffer byteBuffer = (ByteBuffer) this.c;
                int andDecrement = dVar.m.getAndDecrement();
                try {
                    if (dVar.v == null && !dVar.w) {
                        dVar.y = Math.max(dVar.y, andDecrement);
                        ByteBuffer byteBuffer2 = dVar.s;
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
                        if (elapsedRealtime - dVar.x >= 100) {
                            long d = dVar.t.d();
                            dVar.x = elapsedRealtime;
                            if (d >= 0) {
                                n20 n20Var = dVar.g;
                                ((i30) n20Var.c).a((g30) n20Var.b, d);
                            }
                        }
                    }
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                return;
            default:
                i30 i30Var = (i30) this.b;
                g30 g30Var = (g30) this.c;
                try {
                    bArr = AudioRecorderNative.e(g30Var.b.getAbsolutePath());
                } catch (Throwable th) {
                    i30Var.h.a("waveform extraction failed", th);
                    bArr = null;
                }
                i30Var.i.post(new es6(i30Var, g30Var, bArr, (byte) 11));
                return;
        }
    }
}
