package pf;

import android.graphics.Rect;
import android.view.Choreographer;
import java.util.ArrayList;
import vh.h;
import vh.i;
import w7.q;
import yf.x;
public final class b implements Choreographer.FrameCallback {
    public final int f41037a;
    public final Object f41038b;

    public b(Object obj, int i10) {
        this.f41037a = i10;
        this.f41038b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        switch (this.f41037a) {
            case 0:
                c cVar = (c) this.f41038b;
                sf.a aVar = cVar.f41046k;
                sf.a aVar2 = cVar.f41045j;
                if (cVar.f41049n) {
                    ArrayList arrayList = cVar.f41040b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        f fVar = ((rf.e) ((qf.b) obj)).f42517f;
                        if (fVar != null) {
                            fVar.invalidate();
                        }
                    }
                    if (aVar2.f43192c != 0) {
                        cVar.d(q.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.f43192c != 0) {
                        cVar.d(q.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
                    }
                    cVar.f41047l.postFrameCallback(cVar.f41048m);
                    return;
                }
                return;
            case 1:
                ((Runnable) this.f41038b).run();
                return;
            case 2:
                i iVar = (i) this.f41038b;
                Rect rect = iVar.f44720m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - iVar.h > 32 && !iVar.f44717j && !rect.isEmpty()) {
                    iVar.h = currentTimeMillis;
                    iVar.f44717j = true;
                    iVar.f44722o.set(rect);
                    iVar.f44711a.postRunnable(new h(iVar, (iVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                iVar.f44719l = false;
                return;
            default:
                x xVar = (x) this.f41038b;
                if (xVar.F.get()) {
                    long j10 = xVar.f47140b;
                    if (j10 == 0) {
                        xVar.f47140b = j3;
                    } else if (j3 - j10 >= 1000000000) {
                        xVar.f47141c = xVar.f47139a;
                        xVar.f47142f = xVar.e.getAndSet(0);
                        xVar.f47139a = 0;
                        xVar.f47140b = j3;
                    } else {
                        xVar.f47139a++;
                    }
                    Choreographer.getInstance().postFrameCallback(xVar.d);
                    return;
                }
                return;
        }
    }
}
