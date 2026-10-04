package pf;

import android.graphics.Rect;
import android.view.Choreographer;
import java.util.ArrayList;
import vh.h;
import vh.i;
import w7.q;
import yf.x;
public final class b implements Choreographer.FrameCallback {
    public final int f44383a;
    public final Object f44384b;

    public b(Object obj, int i10) {
        this.f44383a = i10;
        this.f44384b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        switch (this.f44383a) {
            case 0:
                c cVar = (c) this.f44384b;
                sf.a aVar = cVar.f44393k;
                sf.a aVar2 = cVar.f44392j;
                if (cVar.f44396n) {
                    ArrayList arrayList = cVar.f44386b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        f fVar = ((rf.e) ((qf.b) obj)).f46022f;
                        if (fVar != null) {
                            fVar.invalidate();
                        }
                    }
                    if (aVar2.f46777c != 0) {
                        cVar.d(q.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.f46777c != 0) {
                        cVar.d(q.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
                    }
                    cVar.f44394l.postFrameCallback(cVar.f44395m);
                    return;
                }
                return;
            case 1:
                ((Runnable) this.f44384b).run();
                return;
            case 2:
                i iVar = (i) this.f44384b;
                Rect rect = iVar.f48419m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - iVar.h > 32 && !iVar.f48416j && !rect.isEmpty()) {
                    iVar.h = currentTimeMillis;
                    iVar.f48416j = true;
                    iVar.f48421o.set(rect);
                    iVar.f48409a.postRunnable(new h(iVar, (iVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                iVar.f48418l = false;
                return;
            default:
                x xVar = (x) this.f44384b;
                if (xVar.F.get()) {
                    long j10 = xVar.f51018b;
                    if (j10 == 0) {
                        xVar.f51018b = j3;
                    } else if (j3 - j10 >= 1000000000) {
                        xVar.f51019c = xVar.f51017a;
                        xVar.f51021f = xVar.f51020e.getAndSet(0);
                        xVar.f51017a = 0;
                        xVar.f51018b = j3;
                    } else {
                        xVar.f51017a++;
                    }
                    Choreographer.getInstance().postFrameCallback(xVar.d);
                    return;
                }
                return;
        }
    }
}
