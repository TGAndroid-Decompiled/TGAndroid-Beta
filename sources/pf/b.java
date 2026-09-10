package pf;

import android.graphics.Rect;
import android.view.Choreographer;
import java.util.ArrayList;
import uh.i;
import uh.j;
import w7.q;
import xf.y;
public final class b implements Choreographer.FrameCallback {
    public final int f39895a;
    public final Object f39896b;

    public b(Object obj, int i10) {
        this.f39895a = i10;
        this.f39896b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        switch (this.f39895a) {
            case 0:
                c cVar = (c) this.f39896b;
                sf.a aVar = cVar.f39904k;
                sf.a aVar2 = cVar.f39903j;
                if (cVar.f39907n) {
                    ArrayList arrayList = cVar.f39898b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        f fVar = ((rf.e) ((qf.b) obj)).f41442f;
                        if (fVar != null) {
                            fVar.invalidate();
                        }
                    }
                    if (aVar2.f41838c != 0) {
                        cVar.d(q.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.f41838c != 0) {
                        cVar.d(q.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
                    }
                    cVar.f39905l.postFrameCallback(cVar.f39906m);
                    return;
                }
                return;
            case 1:
                ((Runnable) this.f39896b).run();
                return;
            case 2:
                j jVar = (j) this.f39896b;
                Rect rect = jVar.f42807m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - jVar.h > 32 && !jVar.f42804j && !rect.isEmpty()) {
                    jVar.h = currentTimeMillis;
                    jVar.f42804j = true;
                    jVar.f42809o.set(rect);
                    jVar.f42798a.postRunnable(new i(jVar, (jVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                jVar.f42806l = false;
                return;
            default:
                y yVar = (y) this.f39896b;
                if (yVar.F.get()) {
                    long j10 = yVar.f45180b;
                    if (j10 == 0) {
                        yVar.f45180b = j3;
                    } else if (j3 - j10 >= 1000000000) {
                        yVar.f45181c = yVar.f45179a;
                        yVar.f45182f = yVar.e.getAndSet(0);
                        yVar.f45179a = 0;
                        yVar.f45180b = j3;
                    } else {
                        yVar.f45179a++;
                    }
                    Choreographer.getInstance().postFrameCallback(yVar.d);
                    return;
                }
                return;
        }
    }
}
