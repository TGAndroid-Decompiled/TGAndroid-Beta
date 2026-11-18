package org.telegram.utils.recorder.audio;

import android.os.SystemClock;
import java.nio.ByteBuffer;
import wg.q;
import yi.h;
import yi.j;
public final class c implements Runnable {
    public final int f54640a;
    public final Object f54641b;
    public final Object f54642c;

    public c(int i7, Object obj, Object obj2) {
        this.f54640a = i7;
        this.f54641b = obj;
        this.f54642c = obj2;
    }

    @Override
    public final void run() {
        byte[] bArr;
        switch (this.f54640a) {
            case 0:
                d dVar = (d) this.f54641b;
                ByteBuffer byteBuffer = (ByteBuffer) this.f54642c;
                int andDecrement = dVar.f54653m.getAndDecrement();
                try {
                    if (dVar.v == null && !dVar.f54662w) {
                        dVar.f54664y = Math.max(dVar.f54664y, andDecrement);
                        ByteBuffer byteBuffer2 = dVar.f54659s;
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
                        if (elapsedRealtime - dVar.f54663x >= 100) {
                            long d = dVar.f54660t.d();
                            dVar.f54663x = elapsedRealtime;
                            if (d >= 0) {
                                ac.e eVar = dVar.f54648g;
                                ((j) eVar.f1022c).a((h) eVar.f1021b, d);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        if (dVar.v == null) {
                            dVar.f54647f.a("encoding failed", th2);
                            dVar.v = d.a(th2);
                            dVar.f54654n = true;
                        }
                    } finally {
                        dVar.c(byteBuffer);
                    }
                }
                return;
            default:
                j jVar = (j) this.f54641b;
                h hVar = (h) this.f54642c;
                try {
                    bArr = AudioRecorderNative.e(hVar.f61313b.getAbsolutePath());
                } catch (Throwable th3) {
                    jVar.h.a("waveform extraction failed", th3);
                    bArr = null;
                }
                jVar.f61322i.post(new q(jVar, hVar, bArr, 4));
                return;
        }
    }
}
