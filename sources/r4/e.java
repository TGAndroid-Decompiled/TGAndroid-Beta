package r4;

import android.graphics.Rect;
import android.view.Choreographer;
import java.util.ArrayList;
import w7.r;
import zf.x;
public final class e implements Choreographer.FrameCallback {
    public final int f45424a;
    public final Object f45425b;

    public e(Object obj, int i10) {
        this.f45424a = i10;
        this.f45425b = obj;
    }

    @Override
    public final void doFrame(long j10) {
        switch (this.f45424a) {
            case 0:
                ((Runnable) this.f45425b).run();
                return;
            case 1:
                rf.b bVar = (rf.b) this.f45425b;
                uf.a aVar = bVar.f45672k;
                uf.a aVar2 = bVar.f45671j;
                if (bVar.f45675n) {
                    ArrayList arrayList = bVar.f45666b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        rf.e eVar = ((tf.e) ((sf.b) obj)).f47456f;
                        if (eVar != null) {
                            eVar.invalidate();
                        }
                    }
                    if (aVar2.f48085c != 0) {
                        bVar.d(r.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.f48085c != 0) {
                        bVar.d(r.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
                    }
                    bVar.f45673l.postFrameCallback(bVar.f45674m);
                    return;
                }
                return;
            case 2:
                wh.i iVar = (wh.i) this.f45425b;
                Rect rect = iVar.f49533m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - iVar.h > 32 && !iVar.f49530j && !rect.isEmpty()) {
                    iVar.h = currentTimeMillis;
                    iVar.f49530j = true;
                    iVar.f49535o.set(rect);
                    iVar.f49524a.postRunnable(new wh.h(iVar, (iVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                iVar.f49532l = false;
                return;
            default:
                x xVar = (x) this.f45425b;
                if (xVar.F.get()) {
                    long j11 = xVar.f52072b;
                    if (j11 == 0) {
                        xVar.f52072b = j10;
                    } else if (j10 - j11 >= 1000000000) {
                        xVar.f52073c = xVar.f52071a;
                        xVar.f52074f = xVar.e.getAndSet(0);
                        xVar.f52071a = 0;
                        xVar.f52072b = j10;
                    } else {
                        xVar.f52071a++;
                    }
                    Choreographer.getInstance().postFrameCallback(xVar.d);
                    return;
                }
                return;
        }
    }
}
