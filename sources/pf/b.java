package pf;

import android.graphics.Rect;
import android.view.Choreographer;
import java.util.ArrayList;
import vh.h;
import vh.i;
import w7.q;
import yf.x;
public final class b implements Choreographer.FrameCallback {
    public final int f41085a;
    public final Object f41086b;

    public b(Object obj, int i10) {
        this.f41085a = i10;
        this.f41086b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        switch (this.f41085a) {
            case 0:
                c cVar = (c) this.f41086b;
                sf.a aVar = cVar.f41094k;
                sf.a aVar2 = cVar.f41093j;
                if (cVar.f41097n) {
                    ArrayList arrayList = cVar.f41088b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        f fVar = ((rf.e) ((qf.b) obj)).f42551f;
                        if (fVar != null) {
                            fVar.invalidate();
                        }
                    }
                    if (aVar2.f43226c != 0) {
                        cVar.d(q.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.f43226c != 0) {
                        cVar.d(q.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
                    }
                    cVar.f41095l.postFrameCallback(cVar.f41096m);
                    return;
                }
                return;
            case 1:
                ((Runnable) this.f41086b).run();
                return;
            case 2:
                i iVar = (i) this.f41086b;
                Rect rect = iVar.f44757m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - iVar.h > 32 && !iVar.f44754j && !rect.isEmpty()) {
                    iVar.h = currentTimeMillis;
                    iVar.f44754j = true;
                    iVar.f44759o.set(rect);
                    iVar.f44748a.postRunnable(new h(iVar, (iVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                iVar.f44756l = false;
                return;
            default:
                x xVar = (x) this.f41086b;
                if (xVar.F.get()) {
                    long j10 = xVar.f47186b;
                    if (j10 == 0) {
                        xVar.f47186b = j3;
                    } else if (j3 - j10 >= 1000000000) {
                        xVar.f47187c = xVar.f47185a;
                        xVar.f47188f = xVar.e.getAndSet(0);
                        xVar.f47185a = 0;
                        xVar.f47186b = j3;
                    } else {
                        xVar.f47185a++;
                    }
                    Choreographer.getInstance().postFrameCallback(xVar.d);
                    return;
                }
                return;
        }
    }
}
