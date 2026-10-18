package r4;

import android.graphics.Rect;
import android.view.Choreographer;
import java.util.ArrayList;
import w7.r;
import zf.x;
public final class f implements Choreographer.FrameCallback {
    public final int f45000a;
    public final Object f45001b;

    public f(Object obj, int i10) {
        this.f45000a = i10;
        this.f45001b = obj;
    }

    @Override
    public final void doFrame(long j10) {
        switch (this.f45000a) {
            case 0:
                ((Runnable) this.f45001b).run();
                return;
            case 1:
                rf.b bVar = (rf.b) this.f45001b;
                uf.a aVar = bVar.f45248k;
                uf.a aVar2 = bVar.f45247j;
                if (bVar.f45251n) {
                    ArrayList arrayList = bVar.f45242b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        rf.e eVar = ((tf.e) ((sf.b) obj)).f47008f;
                        if (eVar != null) {
                            eVar.invalidate();
                        }
                    }
                    if (aVar2.f47634c != 0) {
                        bVar.d(r.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.f47634c != 0) {
                        bVar.d(r.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
                    }
                    bVar.f45249l.postFrameCallback(bVar.f45250m);
                    return;
                }
                return;
            case 2:
                wh.i iVar = (wh.i) this.f45001b;
                Rect rect = iVar.f49081m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - iVar.h > 32 && !iVar.f49078j && !rect.isEmpty()) {
                    iVar.h = currentTimeMillis;
                    iVar.f49078j = true;
                    iVar.f49083o.set(rect);
                    iVar.f49072a.postRunnable(new wh.h(iVar, (iVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                iVar.f49080l = false;
                return;
            default:
                x xVar = (x) this.f45001b;
                if (xVar.F.get()) {
                    long j11 = xVar.f51599b;
                    if (j11 == 0) {
                        xVar.f51599b = j10;
                    } else if (j10 - j11 >= 1000000000) {
                        xVar.f51600c = xVar.f51598a;
                        xVar.f51601f = xVar.e.getAndSet(0);
                        xVar.f51598a = 0;
                        xVar.f51599b = j10;
                    } else {
                        xVar.f51598a++;
                    }
                    Choreographer.getInstance().postFrameCallback(xVar.d);
                    return;
                }
                return;
        }
    }
}
