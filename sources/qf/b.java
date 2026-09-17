package qf;

import android.graphics.Rect;
import android.view.Choreographer;
import java.util.ArrayList;
import w7.p;
import wh.i;
import wh.j;
import yf.y;
public final class b implements Choreographer.FrameCallback {
    public final int f44328a;
    public final Object f44329b;

    public b(Object obj, int i10) {
        this.f44328a = i10;
        this.f44329b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        switch (this.f44328a) {
            case 0:
                c cVar = (c) this.f44329b;
                tf.a aVar = cVar.f44338k;
                tf.a aVar2 = cVar.f44337j;
                if (cVar.f44341n) {
                    ArrayList arrayList = cVar.f44331b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        f fVar = ((sf.e) ((rf.b) obj)).f46001f;
                        if (fVar != null) {
                            fVar.invalidate();
                        }
                    }
                    if (aVar2.f46485c != 0) {
                        cVar.d(p.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.f46485c != 0) {
                        cVar.d(p.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
                    }
                    cVar.f44339l.postFrameCallback(cVar.f44340m);
                    return;
                }
                return;
            case 1:
                ((Runnable) this.f44329b).run();
                return;
            case 2:
                j jVar = (j) this.f44329b;
                Rect rect = jVar.f48651m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - jVar.h > 32 && !jVar.f48648j && !rect.isEmpty()) {
                    jVar.h = currentTimeMillis;
                    jVar.f48648j = true;
                    jVar.f48653o.set(rect);
                    jVar.f48641a.postRunnable(new i(jVar, (jVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                jVar.f48650l = false;
                return;
            default:
                y yVar = (y) this.f44329b;
                if (yVar.F.get()) {
                    long j10 = yVar.f50142b;
                    if (j10 == 0) {
                        yVar.f50142b = j3;
                    } else if (j3 - j10 >= 1000000000) {
                        yVar.f50143c = yVar.f50141a;
                        yVar.f50145f = yVar.f50144e.getAndSet(0);
                        yVar.f50141a = 0;
                        yVar.f50142b = j3;
                    } else {
                        yVar.f50141a++;
                    }
                    Choreographer.getInstance().postFrameCallback(yVar.d);
                    return;
                }
                return;
        }
    }
}
