package pf;

import android.graphics.Rect;
import android.view.Choreographer;
import java.util.ArrayList;
import vh.i;
import vh.j;
import w7.q;
import yf.y;
public final class b implements Choreographer.FrameCallback {
    public final int f41024a;
    public final Object f41025b;

    public b(Object obj, int i10) {
        this.f41024a = i10;
        this.f41025b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        switch (this.f41024a) {
            case 0:
                c cVar = (c) this.f41025b;
                sf.a aVar = cVar.f41033k;
                sf.a aVar2 = cVar.f41032j;
                if (cVar.f41036n) {
                    ArrayList arrayList = cVar.f41027b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        f fVar = ((rf.e) ((qf.b) obj)).f42486f;
                        if (fVar != null) {
                            fVar.invalidate();
                        }
                    }
                    if (aVar2.f43161c != 0) {
                        cVar.d(q.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.f43161c != 0) {
                        cVar.d(q.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
                    }
                    cVar.f41034l.postFrameCallback(cVar.f41035m);
                    return;
                }
                return;
            case 1:
                ((Runnable) this.f41025b).run();
                return;
            case 2:
                j jVar = (j) this.f41025b;
                Rect rect = jVar.f44692m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - jVar.h > 32 && !jVar.f44689j && !rect.isEmpty()) {
                    jVar.h = currentTimeMillis;
                    jVar.f44689j = true;
                    jVar.f44694o.set(rect);
                    jVar.f44683a.postRunnable(new i(jVar, (jVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                jVar.f44691l = false;
                return;
            default:
                y yVar = (y) this.f41025b;
                if (yVar.F.get()) {
                    long j10 = yVar.f47121b;
                    if (j10 == 0) {
                        yVar.f47121b = j3;
                    } else if (j3 - j10 >= 1000000000) {
                        yVar.f47122c = yVar.f47120a;
                        yVar.f47123f = yVar.e.getAndSet(0);
                        yVar.f47120a = 0;
                        yVar.f47121b = j3;
                    } else {
                        yVar.f47120a++;
                    }
                    Choreographer.getInstance().postFrameCallback(yVar.d);
                    return;
                }
                return;
        }
    }
}
