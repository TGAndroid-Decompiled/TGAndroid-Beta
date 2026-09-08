package qf;

import android.graphics.Rect;
import android.view.Choreographer;
import java.util.ArrayList;
import w7.p;
import wh.i;
import wh.j;
import yf.y;
public final class b implements Choreographer.FrameCallback {
    public final int f44355a;
    public final Object f44356b;

    public b(Object obj, int i10) {
        this.f44355a = i10;
        this.f44356b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        switch (this.f44355a) {
            case 0:
                c cVar = (c) this.f44356b;
                tf.a aVar = cVar.f44365k;
                tf.a aVar2 = cVar.f44364j;
                if (cVar.f44368n) {
                    ArrayList arrayList = cVar.f44358b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        f fVar = ((sf.e) ((rf.b) obj)).f46028f;
                        if (fVar != null) {
                            fVar.invalidate();
                        }
                    }
                    if (aVar2.f46512c != 0) {
                        cVar.d(p.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.f46512c != 0) {
                        cVar.d(p.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
                    }
                    cVar.f44366l.postFrameCallback(cVar.f44367m);
                    return;
                }
                return;
            case 1:
                ((Runnable) this.f44356b).run();
                return;
            case 2:
                j jVar = (j) this.f44356b;
                Rect rect = jVar.f48679m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - jVar.h > 32 && !jVar.f48676j && !rect.isEmpty()) {
                    jVar.h = currentTimeMillis;
                    jVar.f48676j = true;
                    jVar.f48681o.set(rect);
                    jVar.f48669a.postRunnable(new i(jVar, (jVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                jVar.f48678l = false;
                return;
            default:
                y yVar = (y) this.f44356b;
                if (yVar.F.get()) {
                    long j10 = yVar.f50170b;
                    if (j10 == 0) {
                        yVar.f50170b = j3;
                    } else if (j3 - j10 >= 1000000000) {
                        yVar.f50171c = yVar.f50169a;
                        yVar.f50173f = yVar.f50172e.getAndSet(0);
                        yVar.f50169a = 0;
                        yVar.f50170b = j3;
                    } else {
                        yVar.f50169a++;
                    }
                    Choreographer.getInstance().postFrameCallback(yVar.d);
                    return;
                }
                return;
        }
    }
}
