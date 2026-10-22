package r4;

import android.graphics.Rect;
import android.view.Choreographer;
import java.util.ArrayList;
import w7.r;
import zf.x;
public final class f implements Choreographer.FrameCallback {
    public final int f45011a;
    public final Object f45012b;

    public f(Object obj, int i10) {
        this.f45011a = i10;
        this.f45012b = obj;
    }

    @Override
    public final void doFrame(long j10) {
        switch (this.f45011a) {
            case 0:
                ((Runnable) this.f45012b).run();
                return;
            case 1:
                rf.b bVar = (rf.b) this.f45012b;
                uf.a aVar = bVar.f45259k;
                uf.a aVar2 = bVar.f45258j;
                if (bVar.f45262n) {
                    ArrayList arrayList = bVar.f45253b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        rf.e eVar = ((tf.e) ((sf.b) obj)).f47020f;
                        if (eVar != null) {
                            eVar.invalidate();
                        }
                    }
                    if (aVar2.f47644c != 0) {
                        bVar.d(r.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.f47644c != 0) {
                        bVar.d(r.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
                    }
                    bVar.f45260l.postFrameCallback(bVar.f45261m);
                    return;
                }
                return;
            case 2:
                wh.i iVar = (wh.i) this.f45012b;
                Rect rect = iVar.f49090m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - iVar.h > 32 && !iVar.f49087j && !rect.isEmpty()) {
                    iVar.h = currentTimeMillis;
                    iVar.f49087j = true;
                    iVar.f49092o.set(rect);
                    iVar.f49081a.postRunnable(new wh.h(iVar, (iVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                iVar.f49089l = false;
                return;
            default:
                x xVar = (x) this.f45012b;
                if (xVar.F.get()) {
                    long j11 = xVar.f51609b;
                    if (j11 == 0) {
                        xVar.f51609b = j10;
                    } else if (j10 - j11 >= 1000000000) {
                        xVar.f51610c = xVar.f51608a;
                        xVar.f51611f = xVar.e.getAndSet(0);
                        xVar.f51608a = 0;
                        xVar.f51609b = j10;
                    } else {
                        xVar.f51608a++;
                    }
                    Choreographer.getInstance().postFrameCallback(xVar.d);
                    return;
                }
                return;
        }
    }
}
