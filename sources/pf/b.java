package pf;

import android.graphics.Rect;
import android.view.Choreographer;
import java.util.ArrayList;
import vh.i;
import vh.j;
import w7.p;
import yf.x;
public final class b implements Choreographer.FrameCallback {
    public final int f40765a;
    public final Object f40766b;

    public b(Object obj, int i10) {
        this.f40765a = i10;
        this.f40766b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        switch (this.f40765a) {
            case 0:
                c cVar = (c) this.f40766b;
                sf.a aVar = cVar.f40774k;
                sf.a aVar2 = cVar.f40773j;
                if (cVar.f40777n) {
                    ArrayList arrayList = cVar.f40768b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        f fVar = ((rf.e) ((qf.b) obj)).f42228f;
                        if (fVar != null) {
                            fVar.invalidate();
                        }
                    }
                    if (aVar2.f42899c != 0) {
                        cVar.d(p.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.f42899c != 0) {
                        cVar.d(p.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
                    }
                    cVar.f40775l.postFrameCallback(cVar.f40776m);
                    return;
                }
                return;
            case 1:
                ((Runnable) this.f40766b).run();
                return;
            case 2:
                j jVar = (j) this.f40766b;
                Rect rect = jVar.f44435m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - jVar.h > 32 && !jVar.f44432j && !rect.isEmpty()) {
                    jVar.h = currentTimeMillis;
                    jVar.f44432j = true;
                    jVar.f44437o.set(rect);
                    jVar.f44426a.postRunnable(new i(jVar, (jVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                jVar.f44434l = false;
                return;
            default:
                x xVar = (x) this.f40766b;
                if (xVar.F.get()) {
                    long j10 = xVar.f46856b;
                    if (j10 == 0) {
                        xVar.f46856b = j3;
                    } else if (j3 - j10 >= 1000000000) {
                        xVar.f46857c = xVar.f46855a;
                        xVar.f46858f = xVar.e.getAndSet(0);
                        xVar.f46855a = 0;
                        xVar.f46856b = j3;
                    } else {
                        xVar.f46855a++;
                    }
                    Choreographer.getInstance().postFrameCallback(xVar.d);
                    return;
                }
                return;
        }
    }
}
