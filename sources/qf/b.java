package qf;

import android.graphics.Rect;
import android.view.Choreographer;
import java.util.ArrayList;
import w7.p;
import wh.i;
import wh.j;
import yf.y;
public final class b implements Choreographer.FrameCallback {
    public final int f44327a;
    public final Object f44328b;

    public b(Object obj, int i10) {
        this.f44327a = i10;
        this.f44328b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        switch (this.f44327a) {
            case 0:
                c cVar = (c) this.f44328b;
                tf.a aVar = cVar.f44337k;
                tf.a aVar2 = cVar.f44336j;
                if (cVar.f44340n) {
                    ArrayList arrayList = cVar.f44330b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        f fVar = ((sf.e) ((rf.b) obj)).f46000f;
                        if (fVar != null) {
                            fVar.invalidate();
                        }
                    }
                    if (aVar2.f46484c != 0) {
                        cVar.d(p.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.f46484c != 0) {
                        cVar.d(p.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
                    }
                    cVar.f44338l.postFrameCallback(cVar.f44339m);
                    return;
                }
                return;
            case 1:
                ((Runnable) this.f44328b).run();
                return;
            case 2:
                j jVar = (j) this.f44328b;
                Rect rect = jVar.f48650m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - jVar.h > 32 && !jVar.f48647j && !rect.isEmpty()) {
                    jVar.h = currentTimeMillis;
                    jVar.f48647j = true;
                    jVar.f48652o.set(rect);
                    jVar.f48640a.postRunnable(new i(jVar, (jVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                jVar.f48649l = false;
                return;
            default:
                y yVar = (y) this.f44328b;
                if (yVar.F.get()) {
                    long j10 = yVar.f50141b;
                    if (j10 == 0) {
                        yVar.f50141b = j3;
                    } else if (j3 - j10 >= 1000000000) {
                        yVar.f50142c = yVar.f50140a;
                        yVar.f50144f = yVar.f50143e.getAndSet(0);
                        yVar.f50140a = 0;
                        yVar.f50141b = j3;
                    } else {
                        yVar.f50140a++;
                    }
                    Choreographer.getInstance().postFrameCallback(yVar.d);
                    return;
                }
                return;
        }
    }
}
