package pf;

import android.graphics.Rect;
import android.view.Choreographer;
import java.util.ArrayList;
import vh.h;
import vh.i;
import w7.q;
import yf.x;
public final class b implements Choreographer.FrameCallback {
    public final int f41038a;
    public final Object f41039b;

    public b(Object obj, int i10) {
        this.f41038a = i10;
        this.f41039b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        switch (this.f41038a) {
            case 0:
                c cVar = (c) this.f41039b;
                sf.a aVar = cVar.f41047k;
                sf.a aVar2 = cVar.f41046j;
                if (cVar.f41050n) {
                    ArrayList arrayList = cVar.f41041b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        f fVar = ((rf.e) ((qf.b) obj)).f42518f;
                        if (fVar != null) {
                            fVar.invalidate();
                        }
                    }
                    if (aVar2.f43193c != 0) {
                        cVar.d(q.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.f43193c != 0) {
                        cVar.d(q.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
                    }
                    cVar.f41048l.postFrameCallback(cVar.f41049m);
                    return;
                }
                return;
            case 1:
                ((Runnable) this.f41039b).run();
                return;
            case 2:
                i iVar = (i) this.f41039b;
                Rect rect = iVar.f44721m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - iVar.h > 32 && !iVar.f44718j && !rect.isEmpty()) {
                    iVar.h = currentTimeMillis;
                    iVar.f44718j = true;
                    iVar.f44723o.set(rect);
                    iVar.f44712a.postRunnable(new h(iVar, (iVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                iVar.f44720l = false;
                return;
            default:
                x xVar = (x) this.f41039b;
                if (xVar.F.get()) {
                    long j10 = xVar.f47141b;
                    if (j10 == 0) {
                        xVar.f47141b = j3;
                    } else if (j3 - j10 >= 1000000000) {
                        xVar.f47142c = xVar.f47140a;
                        xVar.f47143f = xVar.e.getAndSet(0);
                        xVar.f47140a = 0;
                        xVar.f47141b = j3;
                    } else {
                        xVar.f47140a++;
                    }
                    Choreographer.getInstance().postFrameCallback(xVar.d);
                    return;
                }
                return;
        }
    }
}
