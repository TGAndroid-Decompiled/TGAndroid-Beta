package qf;

import android.graphics.Rect;
import android.view.Choreographer;
import java.util.ArrayList;
import vh.h;
import vh.i;
import w7.o;
import yf.x;
public final class b implements Choreographer.FrameCallback {
    public final int f46214a;
    public final Object f46215b;

    public b(Object obj, int i10) {
        this.f46214a = i10;
        this.f46215b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        switch (this.f46214a) {
            case 0:
                c cVar = (c) this.f46215b;
                tf.a aVar = cVar.f46224k;
                tf.a aVar2 = cVar.f46223j;
                if (cVar.f46227n) {
                    ArrayList arrayList = cVar.f46217b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        f fVar = ((sf.e) ((rf.b) obj)).f48074f;
                        if (fVar != null) {
                            fVar.invalidate();
                        }
                    }
                    if (aVar2.f48347c != 0) {
                        cVar.d(o.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.f48347c != 0) {
                        cVar.d(o.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
                    }
                    cVar.f46225l.postFrameCallback(cVar.f46226m);
                    return;
                }
                return;
            case 1:
                ((Runnable) this.f46215b).run();
                return;
            case 2:
                i iVar = (i) this.f46215b;
                Rect rect = iVar.f49804m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - iVar.h > 32 && !iVar.f49801j && !rect.isEmpty()) {
                    iVar.h = currentTimeMillis;
                    iVar.f49801j = true;
                    iVar.f49806o.set(rect);
                    iVar.f49794a.postRunnable(new h(iVar, (iVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                iVar.f49803l = false;
                return;
            default:
                x xVar = (x) this.f46215b;
                if (xVar.F.get()) {
                    long j10 = xVar.f52289b;
                    if (j10 == 0) {
                        xVar.f52289b = j3;
                    } else if (j3 - j10 >= 1000000000) {
                        xVar.f52290c = xVar.f52288a;
                        xVar.f52292f = xVar.f52291e.getAndSet(0);
                        xVar.f52288a = 0;
                        xVar.f52289b = j3;
                    } else {
                        xVar.f52288a++;
                    }
                    Choreographer.getInstance().postFrameCallback(xVar.d);
                    return;
                }
                return;
        }
    }
}
