package qf;

import android.graphics.Rect;
import android.view.Choreographer;
import java.util.ArrayList;
import vh.h;
import vh.i;
import w7.o;
import yf.x;
public final class b implements Choreographer.FrameCallback {
    public final int f46136a;
    public final Object f46137b;

    public b(Object obj, int i10) {
        this.f46136a = i10;
        this.f46137b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        switch (this.f46136a) {
            case 0:
                c cVar = (c) this.f46137b;
                tf.a aVar = cVar.f46146k;
                tf.a aVar2 = cVar.f46145j;
                if (cVar.f46149n) {
                    ArrayList arrayList = cVar.f46139b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        f fVar = ((sf.e) ((rf.b) obj)).f47984f;
                        if (fVar != null) {
                            fVar.invalidate();
                        }
                    }
                    if (aVar2.f48257c != 0) {
                        cVar.d(o.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.f48257c != 0) {
                        cVar.d(o.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
                    }
                    cVar.f46147l.postFrameCallback(cVar.f46148m);
                    return;
                }
                return;
            case 1:
                ((Runnable) this.f46137b).run();
                return;
            case 2:
                i iVar = (i) this.f46137b;
                Rect rect = iVar.f49717m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - iVar.h > 32 && !iVar.f49714j && !rect.isEmpty()) {
                    iVar.h = currentTimeMillis;
                    iVar.f49714j = true;
                    iVar.f49719o.set(rect);
                    iVar.f49707a.postRunnable(new h(iVar, (iVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                iVar.f49716l = false;
                return;
            default:
                x xVar = (x) this.f46137b;
                if (xVar.F.get()) {
                    long j10 = xVar.f52202b;
                    if (j10 == 0) {
                        xVar.f52202b = j3;
                    } else if (j3 - j10 >= 1000000000) {
                        xVar.f52203c = xVar.f52201a;
                        xVar.f52205f = xVar.f52204e.getAndSet(0);
                        xVar.f52201a = 0;
                        xVar.f52202b = j3;
                    } else {
                        xVar.f52201a++;
                    }
                    Choreographer.getInstance().postFrameCallback(xVar.d);
                    return;
                }
                return;
        }
    }
}
