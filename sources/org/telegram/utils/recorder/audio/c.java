package org.telegram.utils.recorder.audio;

import android.os.SystemClock;
import java.nio.ByteBuffer;
import yi.i;
import yi.j;
public final class c implements Runnable {
    public final int f54122a;
    public final Object f54123b;
    public final Object f54124c;

    public c(int i7, Object obj, Object obj2) {
        this.f54122a = i7;
        this.f54123b = obj;
        this.f54124c = obj2;
    }

    @Override
    public final void run() {
        byte[] bArr;
        switch (this.f54122a) {
            case 0:
                d dVar = (d) this.f54123b;
                ByteBuffer byteBuffer = (ByteBuffer) this.f54124c;
                int andDecrement = dVar.f54135m.getAndDecrement();
                try {
                    if (dVar.v == null && !dVar.f54144w) {
                        dVar.f54146y = Math.max(dVar.f54146y, andDecrement);
                        ByteBuffer byteBuffer2 = dVar.f54141s;
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
                        if (elapsedRealtime - dVar.f54145x >= 100) {
                            long d = dVar.f54142t.d();
                            dVar.f54145x = elapsedRealtime;
                            if (d >= 0) {
                                ac.e eVar = dVar.f54130g;
                                ((j) eVar.f1023c).a((i) eVar.f1022b, d);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        if (dVar.v == null) {
                            dVar.f54129f.a("encoding failed", th2);
                            dVar.v = d.a(th2);
                            dVar.f54136n = true;
                        }
                    } finally {
                        dVar.c(byteBuffer);
                    }
                }
                return;
            default:
                j jVar = (j) this.f54123b;
                i iVar = (i) this.f54124c;
                try {
                    bArr = AudioRecorderNative.e(iVar.f60749b.getAbsolutePath());
                } catch (Throwable th3) {
                    jVar.h.a("waveform extraction failed", th3);
                    bArr = null;
                }
                jVar.f60758i.post(new yi.d(jVar, iVar, bArr, 0));
                return;
        }
    }
}
