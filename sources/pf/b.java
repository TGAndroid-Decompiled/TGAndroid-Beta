package pf;

import android.graphics.Rect;
import android.view.Choreographer;
import java.util.ArrayList;
import vh.i;
import vh.j;
import w7.p;
import yf.x;
public final class b implements Choreographer.FrameCallback {
    public final int f40791a;
    public final Object f40792b;

    public b(Object obj, int i10) {
        this.f40791a = i10;
        this.f40792b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        switch (this.f40791a) {
            case 0:
                c cVar = (c) this.f40792b;
                sf.a aVar = cVar.f40800k;
                sf.a aVar2 = cVar.f40799j;
                if (cVar.f40803n) {
                    ArrayList arrayList = cVar.f40794b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        f fVar = ((rf.e) ((qf.b) obj)).f42254f;
                        if (fVar != null) {
                            fVar.invalidate();
                        }
                    }
                    if (aVar2.f42925c != 0) {
                        cVar.d(p.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.f42925c != 0) {
                        cVar.d(p.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
                    }
                    cVar.f40801l.postFrameCallback(cVar.f40802m);
                    return;
                }
                return;
            case 1:
                ((Runnable) this.f40792b).run();
                return;
            case 2:
                j jVar = (j) this.f40792b;
                Rect rect = jVar.f44462m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - jVar.h > 32 && !jVar.f44459j && !rect.isEmpty()) {
                    jVar.h = currentTimeMillis;
                    jVar.f44459j = true;
                    jVar.f44464o.set(rect);
                    jVar.f44453a.postRunnable(new i(jVar, (jVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                jVar.f44461l = false;
                return;
            default:
                x xVar = (x) this.f40792b;
                if (xVar.F.get()) {
                    long j10 = xVar.f46886b;
                    if (j10 == 0) {
                        xVar.f46886b = j3;
                    } else if (j3 - j10 >= 1000000000) {
                        xVar.f46887c = xVar.f46885a;
                        xVar.f46888f = xVar.e.getAndSet(0);
                        xVar.f46885a = 0;
                        xVar.f46886b = j3;
                    } else {
                        xVar.f46885a++;
                    }
                    Choreographer.getInstance().postFrameCallback(xVar.d);
                    return;
                }
                return;
        }
    }
}
