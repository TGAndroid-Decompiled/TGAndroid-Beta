package pf;

import android.graphics.Rect;
import android.view.Choreographer;
import java.util.ArrayList;
import vh.h;
import vh.i;
import w7.q;
import yf.x;
public final class b implements Choreographer.FrameCallback {
    public final int f41036a;
    public final Object f41037b;

    public b(Object obj, int i10) {
        this.f41036a = i10;
        this.f41037b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        switch (this.f41036a) {
            case 0:
                c cVar = (c) this.f41037b;
                sf.a aVar = cVar.f41045k;
                sf.a aVar2 = cVar.f41044j;
                if (cVar.f41048n) {
                    ArrayList arrayList = cVar.f41039b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        f fVar = ((rf.e) ((qf.b) obj)).f42516f;
                        if (fVar != null) {
                            fVar.invalidate();
                        }
                    }
                    if (aVar2.f43191c != 0) {
                        cVar.d(q.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.f43191c != 0) {
                        cVar.d(q.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
                    }
                    cVar.f41046l.postFrameCallback(cVar.f41047m);
                    return;
                }
                return;
            case 1:
                ((Runnable) this.f41037b).run();
                return;
            case 2:
                i iVar = (i) this.f41037b;
                Rect rect = iVar.f44719m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - iVar.h > 32 && !iVar.f44716j && !rect.isEmpty()) {
                    iVar.h = currentTimeMillis;
                    iVar.f44716j = true;
                    iVar.f44721o.set(rect);
                    iVar.f44710a.postRunnable(new h(iVar, (iVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                iVar.f44718l = false;
                return;
            default:
                x xVar = (x) this.f41037b;
                if (xVar.F.get()) {
                    long j10 = xVar.f47139b;
                    if (j10 == 0) {
                        xVar.f47139b = j3;
                    } else if (j3 - j10 >= 1000000000) {
                        xVar.f47140c = xVar.f47138a;
                        xVar.f47141f = xVar.e.getAndSet(0);
                        xVar.f47138a = 0;
                        xVar.f47139b = j3;
                    } else {
                        xVar.f47138a++;
                    }
                    Choreographer.getInstance().postFrameCallback(xVar.d);
                    return;
                }
                return;
        }
    }
}
