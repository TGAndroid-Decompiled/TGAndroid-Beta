package qf;

import android.graphics.Rect;
import android.view.Choreographer;
import java.util.ArrayList;
import vh.h;
import vh.i;
import w7.n;
import yf.x;
public final class b implements Choreographer.FrameCallback {
    public final int f46081a;
    public final Object f46082b;

    public b(Object obj, int i10) {
        this.f46081a = i10;
        this.f46082b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        switch (this.f46081a) {
            case 0:
                c cVar = (c) this.f46082b;
                tf.a aVar = cVar.f46091k;
                tf.a aVar2 = cVar.f46090j;
                if (cVar.f46094n) {
                    ArrayList arrayList = cVar.f46084b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        f fVar = ((sf.e) ((rf.b) obj)).f48223f;
                        if (fVar != null) {
                            fVar.invalidate();
                        }
                    }
                    if (aVar2.f48496c != 0) {
                        cVar.d(n.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.f48496c != 0) {
                        cVar.d(n.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
                    }
                    cVar.f46092l.postFrameCallback(cVar.f46093m);
                    return;
                }
                return;
            case 1:
                ((Runnable) this.f46082b).run();
                return;
            case 2:
                i iVar = (i) this.f46082b;
                Rect rect = iVar.f49953m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - iVar.h > 32 && !iVar.f49950j && !rect.isEmpty()) {
                    iVar.h = currentTimeMillis;
                    iVar.f49950j = true;
                    iVar.f49955o.set(rect);
                    iVar.f49943a.postRunnable(new h(iVar, (iVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                iVar.f49952l = false;
                return;
            default:
                x xVar = (x) this.f46082b;
                if (xVar.F.get()) {
                    long j10 = xVar.f52434b;
                    if (j10 == 0) {
                        xVar.f52434b = j3;
                    } else if (j3 - j10 >= 1000000000) {
                        xVar.f52435c = xVar.f52433a;
                        xVar.f52437f = xVar.f52436e.getAndSet(0);
                        xVar.f52433a = 0;
                        xVar.f52434b = j3;
                    } else {
                        xVar.f52433a++;
                    }
                    Choreographer.getInstance().postFrameCallback(xVar.d);
                    return;
                }
                return;
        }
    }
}
