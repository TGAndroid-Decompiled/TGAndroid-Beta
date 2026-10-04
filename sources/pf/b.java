package pf;

import android.graphics.Rect;
import android.view.Choreographer;
import java.util.ArrayList;
import vh.h;
import vh.i;
import w7.q;
import yf.x;
public final class b implements Choreographer.FrameCallback {
    public final int f44391a;
    public final Object f44392b;

    public b(Object obj, int i10) {
        this.f44391a = i10;
        this.f44392b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        switch (this.f44391a) {
            case 0:
                c cVar = (c) this.f44392b;
                sf.a aVar = cVar.f44401k;
                sf.a aVar2 = cVar.f44400j;
                if (cVar.f44404n) {
                    ArrayList arrayList = cVar.f44394b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        f fVar = ((rf.e) ((qf.b) obj)).f46030f;
                        if (fVar != null) {
                            fVar.invalidate();
                        }
                    }
                    if (aVar2.f46785c != 0) {
                        cVar.d(q.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.f46785c != 0) {
                        cVar.d(q.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
                    }
                    cVar.f44402l.postFrameCallback(cVar.f44403m);
                    return;
                }
                return;
            case 1:
                ((Runnable) this.f44392b).run();
                return;
            case 2:
                i iVar = (i) this.f44392b;
                Rect rect = iVar.f48428m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - iVar.h > 32 && !iVar.f48425j && !rect.isEmpty()) {
                    iVar.h = currentTimeMillis;
                    iVar.f48425j = true;
                    iVar.f48430o.set(rect);
                    iVar.f48418a.postRunnable(new h(iVar, (iVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                iVar.f48427l = false;
                return;
            default:
                x xVar = (x) this.f44392b;
                if (xVar.F.get()) {
                    long j10 = xVar.f51025b;
                    if (j10 == 0) {
                        xVar.f51025b = j3;
                    } else if (j3 - j10 >= 1000000000) {
                        xVar.f51026c = xVar.f51024a;
                        xVar.f51028f = xVar.f51027e.getAndSet(0);
                        xVar.f51024a = 0;
                        xVar.f51025b = j3;
                    } else {
                        xVar.f51024a++;
                    }
                    Choreographer.getInstance().postFrameCallback(xVar.d);
                    return;
                }
                return;
        }
    }
}
