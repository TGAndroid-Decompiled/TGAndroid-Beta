package pf;

import android.graphics.Rect;
import android.view.Choreographer;
import java.util.ArrayList;
import vh.i;
import vh.j;
import w7.p;
import yf.x;
public final class b implements Choreographer.FrameCallback {
    public final int f40720a;
    public final Object f40721b;

    public b(Object obj, int i10) {
        this.f40720a = i10;
        this.f40721b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        switch (this.f40720a) {
            case 0:
                c cVar = (c) this.f40721b;
                sf.a aVar = cVar.f40729k;
                sf.a aVar2 = cVar.f40728j;
                if (cVar.f40732n) {
                    ArrayList arrayList = cVar.f40723b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        f fVar = ((rf.e) ((qf.b) obj)).f42183f;
                        if (fVar != null) {
                            fVar.invalidate();
                        }
                    }
                    if (aVar2.f42855c != 0) {
                        cVar.d(p.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.f42855c != 0) {
                        cVar.d(p.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
                    }
                    cVar.f40730l.postFrameCallback(cVar.f40731m);
                    return;
                }
                return;
            case 1:
                ((Runnable) this.f40721b).run();
                return;
            case 2:
                j jVar = (j) this.f40721b;
                Rect rect = jVar.f44389m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - jVar.h > 32 && !jVar.f44386j && !rect.isEmpty()) {
                    jVar.h = currentTimeMillis;
                    jVar.f44386j = true;
                    jVar.f44391o.set(rect);
                    jVar.f44380a.postRunnable(new i(jVar, (jVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                jVar.f44388l = false;
                return;
            default:
                x xVar = (x) this.f40721b;
                if (xVar.F.get()) {
                    long j10 = xVar.f46814b;
                    if (j10 == 0) {
                        xVar.f46814b = j3;
                    } else if (j3 - j10 >= 1000000000) {
                        xVar.f46815c = xVar.f46813a;
                        xVar.f46816f = xVar.e.getAndSet(0);
                        xVar.f46813a = 0;
                        xVar.f46814b = j3;
                    } else {
                        xVar.f46813a++;
                    }
                    Choreographer.getInstance().postFrameCallback(xVar.d);
                    return;
                }
                return;
        }
    }
}
