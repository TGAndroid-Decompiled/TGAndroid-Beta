package org.telegram.utils.recorder.audio;

import android.os.SystemClock;
import java.nio.ByteBuffer;
import wg.p;
import yi.h;
import yi.j;
public final class c implements Runnable {
    public final int f54651a;
    public final Object f54652b;
    public final Object f54653c;

    public c(int i7, Object obj, Object obj2) {
        this.f54651a = i7;
        this.f54652b = obj;
        this.f54653c = obj2;
    }

    @Override
    public final void run() {
        byte[] bArr;
        switch (this.f54651a) {
            case 0:
                d dVar = (d) this.f54652b;
                ByteBuffer byteBuffer = (ByteBuffer) this.f54653c;
                int andDecrement = dVar.f54664m.getAndDecrement();
                try {
                    if (dVar.v == null && !dVar.f54673w) {
                        dVar.f54675y = Math.max(dVar.f54675y, andDecrement);
                        ByteBuffer byteBuffer2 = dVar.f54670s;
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
                        if (elapsedRealtime - dVar.f54674x >= 100) {
                            long d = dVar.f54671t.d();
                            dVar.f54674x = elapsedRealtime;
                            if (d >= 0) {
                                ac.e eVar = dVar.f54659g;
                                ((j) eVar.f1022c).a((h) eVar.f1021b, d);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        if (dVar.v == null) {
                            dVar.f54658f.a("encoding failed", th2);
                            dVar.v = d.a(th2);
                            dVar.f54665n = true;
                        }
                    } finally {
                        dVar.c(byteBuffer);
                    }
                }
                return;
            default:
                j jVar = (j) this.f54652b;
                h hVar = (h) this.f54653c;
                try {
                    bArr = AudioRecorderNative.e(hVar.f61324b.getAbsolutePath());
                } catch (Throwable th3) {
                    jVar.h.a("waveform extraction failed", th3);
                    bArr = null;
                }
                jVar.f61333i.post(new p(jVar, hVar, bArr, 5));
                return;
        }
    }
}
