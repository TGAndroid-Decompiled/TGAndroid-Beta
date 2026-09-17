package qf;

import android.graphics.Rect;
import android.view.Choreographer;
import java.util.ArrayList;
import w7.p;
import wh.i;
import wh.j;
import yf.y;
public final class b implements Choreographer.FrameCallback {
    public final int f44356a;
    public final Object f44357b;

    public b(Object obj, int i10) {
        this.f44356a = i10;
        this.f44357b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        switch (this.f44356a) {
            case 0:
                c cVar = (c) this.f44357b;
                tf.a aVar = cVar.f44366k;
                tf.a aVar2 = cVar.f44365j;
                if (cVar.f44369n) {
                    ArrayList arrayList = cVar.f44359b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        f fVar = ((sf.e) ((rf.b) obj)).f46029f;
                        if (fVar != null) {
                            fVar.invalidate();
                        }
                    }
                    if (aVar2.f46513c != 0) {
                        cVar.d(p.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.f46513c != 0) {
                        cVar.d(p.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
                    }
                    cVar.f44367l.postFrameCallback(cVar.f44368m);
                    return;
                }
                return;
            case 1:
                ((Runnable) this.f44357b).run();
                return;
            case 2:
                j jVar = (j) this.f44357b;
                Rect rect = jVar.f48680m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - jVar.h > 32 && !jVar.f48677j && !rect.isEmpty()) {
                    jVar.h = currentTimeMillis;
                    jVar.f48677j = true;
                    jVar.f48682o.set(rect);
                    jVar.f48670a.postRunnable(new i(jVar, (jVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                jVar.f48679l = false;
                return;
            default:
                y yVar = (y) this.f44357b;
                if (yVar.F.get()) {
                    long j10 = yVar.f50171b;
                    if (j10 == 0) {
                        yVar.f50171b = j3;
                    } else if (j3 - j10 >= 1000000000) {
                        yVar.f50172c = yVar.f50170a;
                        yVar.f50174f = yVar.f50173e.getAndSet(0);
                        yVar.f50170a = 0;
                        yVar.f50171b = j3;
                    } else {
                        yVar.f50170a++;
                    }
                    Choreographer.getInstance().postFrameCallback(yVar.d);
                    return;
                }
                return;
        }
    }
}
