package pf;

import android.graphics.Rect;
import android.view.Choreographer;
import java.util.ArrayList;
import vh.h;
import vh.i;
import w7.q;
import yf.x;
public final class b implements Choreographer.FrameCallback {
    public final int f44384a;
    public final Object f44385b;

    public b(Object obj, int i10) {
        this.f44384a = i10;
        this.f44385b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        switch (this.f44384a) {
            case 0:
                c cVar = (c) this.f44385b;
                sf.a aVar = cVar.f44394k;
                sf.a aVar2 = cVar.f44393j;
                if (cVar.f44397n) {
                    ArrayList arrayList = cVar.f44387b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        f fVar = ((rf.e) ((qf.b) obj)).f46023f;
                        if (fVar != null) {
                            fVar.invalidate();
                        }
                    }
                    if (aVar2.f46778c != 0) {
                        cVar.d(q.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.f46778c != 0) {
                        cVar.d(q.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
                    }
                    cVar.f44395l.postFrameCallback(cVar.f44396m);
                    return;
                }
                return;
            case 1:
                ((Runnable) this.f44385b).run();
                return;
            case 2:
                i iVar = (i) this.f44385b;
                Rect rect = iVar.f48420m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - iVar.h > 32 && !iVar.f48417j && !rect.isEmpty()) {
                    iVar.h = currentTimeMillis;
                    iVar.f48417j = true;
                    iVar.f48422o.set(rect);
                    iVar.f48410a.postRunnable(new h(iVar, (iVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                iVar.f48419l = false;
                return;
            default:
                x xVar = (x) this.f44385b;
                if (xVar.F.get()) {
                    long j10 = xVar.f51019b;
                    if (j10 == 0) {
                        xVar.f51019b = j3;
                    } else if (j3 - j10 >= 1000000000) {
                        xVar.f51020c = xVar.f51018a;
                        xVar.f51022f = xVar.f51021e.getAndSet(0);
                        xVar.f51018a = 0;
                        xVar.f51019b = j3;
                    } else {
                        xVar.f51018a++;
                    }
                    Choreographer.getInstance().postFrameCallback(xVar.d);
                    return;
                }
                return;
        }
    }
}
