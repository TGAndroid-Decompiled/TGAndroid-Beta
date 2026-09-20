package pf;

import android.graphics.Rect;
import android.view.Choreographer;
import java.util.ArrayList;
import vh.i;
import vh.j;
import w7.q;
import yf.x;
public final class b implements Choreographer.FrameCallback {
    public final int f41065a;
    public final Object f41066b;

    public b(Object obj, int i10) {
        this.f41065a = i10;
        this.f41066b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        switch (this.f41065a) {
            case 0:
                c cVar = (c) this.f41066b;
                sf.a aVar = cVar.f41074k;
                sf.a aVar2 = cVar.f41073j;
                if (cVar.f41077n) {
                    ArrayList arrayList = cVar.f41068b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        f fVar = ((rf.e) ((qf.b) obj)).f42530f;
                        if (fVar != null) {
                            fVar.invalidate();
                        }
                    }
                    if (aVar2.f43205c != 0) {
                        cVar.d(q.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.f43205c != 0) {
                        cVar.d(q.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
                    }
                    cVar.f41075l.postFrameCallback(cVar.f41076m);
                    return;
                }
                return;
            case 1:
                ((Runnable) this.f41066b).run();
                return;
            case 2:
                j jVar = (j) this.f41066b;
                Rect rect = jVar.f44736m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - jVar.h > 32 && !jVar.f44733j && !rect.isEmpty()) {
                    jVar.h = currentTimeMillis;
                    jVar.f44733j = true;
                    jVar.f44738o.set(rect);
                    jVar.f44727a.postRunnable(new i(jVar, (jVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                jVar.f44735l = false;
                return;
            default:
                x xVar = (x) this.f41066b;
                if (xVar.F.get()) {
                    long j10 = xVar.f47165b;
                    if (j10 == 0) {
                        xVar.f47165b = j3;
                    } else if (j3 - j10 >= 1000000000) {
                        xVar.f47166c = xVar.f47164a;
                        xVar.f47167f = xVar.e.getAndSet(0);
                        xVar.f47164a = 0;
                        xVar.f47165b = j3;
                    } else {
                        xVar.f47164a++;
                    }
                    Choreographer.getInstance().postFrameCallback(xVar.d);
                    return;
                }
                return;
        }
    }
}
