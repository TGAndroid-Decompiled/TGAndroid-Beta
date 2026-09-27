package pf;

import android.graphics.Rect;
import android.view.Choreographer;
import java.util.ArrayList;
import vh.h;
import vh.i;
import w7.q;
import yf.x;
public final class b implements Choreographer.FrameCallback {
    public final int f41034a;
    public final Object f41035b;

    public b(Object obj, int i10) {
        this.f41034a = i10;
        this.f41035b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        switch (this.f41034a) {
            case 0:
                c cVar = (c) this.f41035b;
                sf.a aVar = cVar.f41043k;
                sf.a aVar2 = cVar.f41042j;
                if (cVar.f41046n) {
                    ArrayList arrayList = cVar.f41037b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        f fVar = ((rf.e) ((qf.b) obj)).f42561f;
                        if (fVar != null) {
                            fVar.invalidate();
                        }
                    }
                    if (aVar2.f43236c != 0) {
                        cVar.d(q.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.f43236c != 0) {
                        cVar.d(q.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
                    }
                    cVar.f41044l.postFrameCallback(cVar.f41045m);
                    return;
                }
                return;
            case 1:
                ((Runnable) this.f41035b).run();
                return;
            case 2:
                i iVar = (i) this.f41035b;
                Rect rect = iVar.f44765m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - iVar.h > 32 && !iVar.f44762j && !rect.isEmpty()) {
                    iVar.h = currentTimeMillis;
                    iVar.f44762j = true;
                    iVar.f44767o.set(rect);
                    iVar.f44756a.postRunnable(new h(iVar, (iVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                iVar.f44764l = false;
                return;
            default:
                x xVar = (x) this.f41035b;
                if (xVar.F.get()) {
                    long j10 = xVar.f47187b;
                    if (j10 == 0) {
                        xVar.f47187b = j3;
                    } else if (j3 - j10 >= 1000000000) {
                        xVar.f47188c = xVar.f47186a;
                        xVar.f47189f = xVar.e.getAndSet(0);
                        xVar.f47186a = 0;
                        xVar.f47187b = j3;
                    } else {
                        xVar.f47186a++;
                    }
                    Choreographer.getInstance().postFrameCallback(xVar.d);
                    return;
                }
                return;
        }
    }
}
