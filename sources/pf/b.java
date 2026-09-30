package pf;

import android.graphics.Rect;
import android.view.Choreographer;
import java.util.ArrayList;
import vh.h;
import vh.i;
import w7.q;
import yf.x;
public final class b implements Choreographer.FrameCallback {
    public final int f41135a;
    public final Object f41136b;

    public b(Object obj, int i10) {
        this.f41135a = i10;
        this.f41136b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        switch (this.f41135a) {
            case 0:
                c cVar = (c) this.f41136b;
                sf.a aVar = cVar.f41144k;
                sf.a aVar2 = cVar.f41143j;
                if (cVar.f41147n) {
                    ArrayList arrayList = cVar.f41138b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        f fVar = ((rf.e) ((qf.b) obj)).f42621f;
                        if (fVar != null) {
                            fVar.invalidate();
                        }
                    }
                    if (aVar2.f43299c != 0) {
                        cVar.d(q.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.f43299c != 0) {
                        cVar.d(q.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
                    }
                    cVar.f41145l.postFrameCallback(cVar.f41146m);
                    return;
                }
                return;
            case 1:
                ((Runnable) this.f41136b).run();
                return;
            case 2:
                i iVar = (i) this.f41136b;
                Rect rect = iVar.f44827m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - iVar.h > 32 && !iVar.f44824j && !rect.isEmpty()) {
                    iVar.h = currentTimeMillis;
                    iVar.f44824j = true;
                    iVar.f44829o.set(rect);
                    iVar.f44818a.postRunnable(new h(iVar, (iVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                iVar.f44826l = false;
                return;
            default:
                x xVar = (x) this.f41136b;
                if (xVar.F.get()) {
                    long j10 = xVar.f47247b;
                    if (j10 == 0) {
                        xVar.f47247b = j3;
                    } else if (j3 - j10 >= 1000000000) {
                        xVar.f47248c = xVar.f47246a;
                        xVar.f47249f = xVar.e.getAndSet(0);
                        xVar.f47246a = 0;
                        xVar.f47247b = j3;
                    } else {
                        xVar.f47246a++;
                    }
                    Choreographer.getInstance().postFrameCallback(xVar.d);
                    return;
                }
                return;
        }
    }
}
