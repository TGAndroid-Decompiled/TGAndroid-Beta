package pf;

import android.graphics.Rect;
import android.view.Choreographer;
import java.util.ArrayList;
import vh.i;
import vh.j;
import w7.p;
import yf.x;
public final class b implements Choreographer.FrameCallback {
    public final int f40769a;
    public final Object f40770b;

    public b(Object obj, int i10) {
        this.f40769a = i10;
        this.f40770b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        switch (this.f40769a) {
            case 0:
                c cVar = (c) this.f40770b;
                sf.a aVar = cVar.f40778k;
                sf.a aVar2 = cVar.f40777j;
                if (cVar.f40781n) {
                    ArrayList arrayList = cVar.f40772b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        f fVar = ((rf.e) ((qf.b) obj)).f42232f;
                        if (fVar != null) {
                            fVar.invalidate();
                        }
                    }
                    if (aVar2.f42903c != 0) {
                        cVar.d(p.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.f42903c != 0) {
                        cVar.d(p.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
                    }
                    cVar.f40779l.postFrameCallback(cVar.f40780m);
                    return;
                }
                return;
            case 1:
                ((Runnable) this.f40770b).run();
                return;
            case 2:
                j jVar = (j) this.f40770b;
                Rect rect = jVar.f44439m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - jVar.h > 32 && !jVar.f44436j && !rect.isEmpty()) {
                    jVar.h = currentTimeMillis;
                    jVar.f44436j = true;
                    jVar.f44441o.set(rect);
                    jVar.f44430a.postRunnable(new i(jVar, (jVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                jVar.f44438l = false;
                return;
            default:
                x xVar = (x) this.f40770b;
                if (xVar.F.get()) {
                    long j10 = xVar.f46863b;
                    if (j10 == 0) {
                        xVar.f46863b = j3;
                    } else if (j3 - j10 >= 1000000000) {
                        xVar.f46864c = xVar.f46862a;
                        xVar.f46865f = xVar.e.getAndSet(0);
                        xVar.f46862a = 0;
                        xVar.f46863b = j3;
                    } else {
                        xVar.f46862a++;
                    }
                    Choreographer.getInstance().postFrameCallback(xVar.d);
                    return;
                }
                return;
        }
    }
}
