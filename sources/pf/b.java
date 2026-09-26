package pf;

import android.graphics.Rect;
import android.view.Choreographer;
import java.util.ArrayList;
import vh.h;
import vh.i;
import w7.q;
import yf.x;
public final class b implements Choreographer.FrameCallback {
    public final int f41035a;
    public final Object f41036b;

    public b(Object obj, int i10) {
        this.f41035a = i10;
        this.f41036b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        switch (this.f41035a) {
            case 0:
                c cVar = (c) this.f41036b;
                sf.a aVar = cVar.f41044k;
                sf.a aVar2 = cVar.f41043j;
                if (cVar.f41047n) {
                    ArrayList arrayList = cVar.f41038b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        f fVar = ((rf.e) ((qf.b) obj)).f42515f;
                        if (fVar != null) {
                            fVar.invalidate();
                        }
                    }
                    if (aVar2.f43190c != 0) {
                        cVar.d(q.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.f43190c != 0) {
                        cVar.d(q.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
                    }
                    cVar.f41045l.postFrameCallback(cVar.f41046m);
                    return;
                }
                return;
            case 1:
                ((Runnable) this.f41036b).run();
                return;
            case 2:
                i iVar = (i) this.f41036b;
                Rect rect = iVar.f44718m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - iVar.h > 32 && !iVar.f44715j && !rect.isEmpty()) {
                    iVar.h = currentTimeMillis;
                    iVar.f44715j = true;
                    iVar.f44720o.set(rect);
                    iVar.f44709a.postRunnable(new h(iVar, (iVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                iVar.f44717l = false;
                return;
            default:
                x xVar = (x) this.f41036b;
                if (xVar.F.get()) {
                    long j10 = xVar.f47138b;
                    if (j10 == 0) {
                        xVar.f47138b = j3;
                    } else if (j3 - j10 >= 1000000000) {
                        xVar.f47139c = xVar.f47137a;
                        xVar.f47140f = xVar.e.getAndSet(0);
                        xVar.f47137a = 0;
                        xVar.f47138b = j3;
                    } else {
                        xVar.f47137a++;
                    }
                    Choreographer.getInstance().postFrameCallback(xVar.d);
                    return;
                }
                return;
        }
    }
}
