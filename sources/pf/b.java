package pf;

import android.graphics.Rect;
import android.view.Choreographer;
import java.util.ArrayList;
import vh.h;
import vh.i;
import w7.q;
import yf.x;
public final class b implements Choreographer.FrameCallback {
    public final int f44398a;
    public final Object f44399b;

    public b(Object obj, int i10) {
        this.f44398a = i10;
        this.f44399b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        switch (this.f44398a) {
            case 0:
                c cVar = (c) this.f44399b;
                sf.a aVar = cVar.f44408k;
                sf.a aVar2 = cVar.f44407j;
                if (cVar.f44411n) {
                    ArrayList arrayList = cVar.f44401b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        f fVar = ((rf.e) ((qf.b) obj)).f46037f;
                        if (fVar != null) {
                            fVar.invalidate();
                        }
                    }
                    if (aVar2.f46792c != 0) {
                        cVar.d(q.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.f46792c != 0) {
                        cVar.d(q.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
                    }
                    cVar.f44409l.postFrameCallback(cVar.f44410m);
                    return;
                }
                return;
            case 1:
                ((Runnable) this.f44399b).run();
                return;
            case 2:
                i iVar = (i) this.f44399b;
                Rect rect = iVar.f48435m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - iVar.h > 32 && !iVar.f48432j && !rect.isEmpty()) {
                    iVar.h = currentTimeMillis;
                    iVar.f48432j = true;
                    iVar.f48437o.set(rect);
                    iVar.f48425a.postRunnable(new h(iVar, (iVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                iVar.f48434l = false;
                return;
            default:
                x xVar = (x) this.f44399b;
                if (xVar.F.get()) {
                    long j10 = xVar.f51032b;
                    if (j10 == 0) {
                        xVar.f51032b = j3;
                    } else if (j3 - j10 >= 1000000000) {
                        xVar.f51033c = xVar.f51031a;
                        xVar.f51035f = xVar.f51034e.getAndSet(0);
                        xVar.f51031a = 0;
                        xVar.f51032b = j3;
                    } else {
                        xVar.f51031a++;
                    }
                    Choreographer.getInstance().postFrameCallback(xVar.d);
                    return;
                }
                return;
        }
    }
}
