package pf;

import android.graphics.Rect;
import android.view.Choreographer;
import java.util.ArrayList;
import vh.i;
import vh.j;
import w7.p;
import yf.x;
public final class b implements Choreographer.FrameCallback {
    public final int f40796a;
    public final Object f40797b;

    public b(Object obj, int i10) {
        this.f40796a = i10;
        this.f40797b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        switch (this.f40796a) {
            case 0:
                c cVar = (c) this.f40797b;
                sf.a aVar = cVar.f40805k;
                sf.a aVar2 = cVar.f40804j;
                if (cVar.f40808n) {
                    ArrayList arrayList = cVar.f40799b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        f fVar = ((rf.e) ((qf.b) obj)).f42259f;
                        if (fVar != null) {
                            fVar.invalidate();
                        }
                    }
                    if (aVar2.f42930c != 0) {
                        cVar.d(p.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.f42930c != 0) {
                        cVar.d(p.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
                    }
                    cVar.f40806l.postFrameCallback(cVar.f40807m);
                    return;
                }
                return;
            case 1:
                ((Runnable) this.f40797b).run();
                return;
            case 2:
                j jVar = (j) this.f40797b;
                Rect rect = jVar.f44467m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - jVar.h > 32 && !jVar.f44464j && !rect.isEmpty()) {
                    jVar.h = currentTimeMillis;
                    jVar.f44464j = true;
                    jVar.f44469o.set(rect);
                    jVar.f44458a.postRunnable(new i(jVar, (jVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                jVar.f44466l = false;
                return;
            default:
                x xVar = (x) this.f40797b;
                if (xVar.F.get()) {
                    long j10 = xVar.f46891b;
                    if (j10 == 0) {
                        xVar.f46891b = j3;
                    } else if (j3 - j10 >= 1000000000) {
                        xVar.f46892c = xVar.f46890a;
                        xVar.f46893f = xVar.e.getAndSet(0);
                        xVar.f46890a = 0;
                        xVar.f46891b = j3;
                    } else {
                        xVar.f46890a++;
                    }
                    Choreographer.getInstance().postFrameCallback(xVar.d);
                    return;
                }
                return;
        }
    }
}
