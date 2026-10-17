package r4;

import android.graphics.Rect;
import android.view.Choreographer;
import java.util.ArrayList;
import w7.r;
import zf.x;
public final class e implements Choreographer.FrameCallback {
    public final int f45026a;
    public final Object f45027b;

    public e(Object obj, int i10) {
        this.f45026a = i10;
        this.f45027b = obj;
    }

    @Override
    public final void doFrame(long j10) {
        switch (this.f45026a) {
            case 0:
                ((Runnable) this.f45027b).run();
                return;
            case 1:
                rf.b bVar = (rf.b) this.f45027b;
                uf.a aVar = bVar.f45274k;
                uf.a aVar2 = bVar.f45273j;
                if (bVar.f45277n) {
                    ArrayList arrayList = bVar.f45268b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        rf.e eVar = ((tf.e) ((sf.b) obj)).f47036f;
                        if (eVar != null) {
                            eVar.invalidate();
                        }
                    }
                    if (aVar2.f47656c != 0) {
                        bVar.d(r.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.f47656c != 0) {
                        bVar.d(r.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
                    }
                    bVar.f45275l.postFrameCallback(bVar.f45276m);
                    return;
                }
                return;
            case 2:
                wh.i iVar = (wh.i) this.f45027b;
                Rect rect = iVar.f49103m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - iVar.h > 32 && !iVar.f49100j && !rect.isEmpty()) {
                    iVar.h = currentTimeMillis;
                    iVar.f49100j = true;
                    iVar.f49105o.set(rect);
                    iVar.f49094a.postRunnable(new wh.h(iVar, (iVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                iVar.f49102l = false;
                return;
            default:
                x xVar = (x) this.f45027b;
                if (xVar.F.get()) {
                    long j11 = xVar.f51621b;
                    if (j11 == 0) {
                        xVar.f51621b = j10;
                    } else if (j10 - j11 >= 1000000000) {
                        xVar.f51622c = xVar.f51620a;
                        xVar.f51623f = xVar.e.getAndSet(0);
                        xVar.f51620a = 0;
                        xVar.f51621b = j10;
                    } else {
                        xVar.f51620a++;
                    }
                    Choreographer.getInstance().postFrameCallback(xVar.d);
                    return;
                }
                return;
        }
    }
}
