package r4;

import android.graphics.Rect;
import android.view.Choreographer;
import java.util.ArrayList;
import w7.r;
import zf.x;
public final class f implements Choreographer.FrameCallback {
    public final int f45046a;
    public final Object f45047b;

    public f(Object obj, int i10) {
        this.f45046a = i10;
        this.f45047b = obj;
    }

    @Override
    public final void doFrame(long j10) {
        switch (this.f45046a) {
            case 0:
                ((Runnable) this.f45047b).run();
                return;
            case 1:
                rf.b bVar = (rf.b) this.f45047b;
                uf.a aVar = bVar.f45294k;
                uf.a aVar2 = bVar.f45293j;
                if (bVar.f45297n) {
                    ArrayList arrayList = bVar.f45288b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        rf.e eVar = ((tf.e) ((sf.b) obj)).f47058f;
                        if (eVar != null) {
                            eVar.invalidate();
                        }
                    }
                    if (aVar2.f47678c != 0) {
                        bVar.d(r.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.f47678c != 0) {
                        bVar.d(r.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
                    }
                    bVar.f45295l.postFrameCallback(bVar.f45296m);
                    return;
                }
                return;
            case 2:
                wh.i iVar = (wh.i) this.f45047b;
                Rect rect = iVar.f49128m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - iVar.h > 32 && !iVar.f49125j && !rect.isEmpty()) {
                    iVar.h = currentTimeMillis;
                    iVar.f49125j = true;
                    iVar.f49130o.set(rect);
                    iVar.f49119a.postRunnable(new wh.h(iVar, (iVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                iVar.f49127l = false;
                return;
            default:
                x xVar = (x) this.f45047b;
                if (xVar.F.get()) {
                    long j11 = xVar.f51646b;
                    if (j11 == 0) {
                        xVar.f51646b = j10;
                    } else if (j10 - j11 >= 1000000000) {
                        xVar.f51647c = xVar.f51645a;
                        xVar.f51648f = xVar.e.getAndSet(0);
                        xVar.f51645a = 0;
                        xVar.f51646b = j10;
                    } else {
                        xVar.f51645a++;
                    }
                    Choreographer.getInstance().postFrameCallback(xVar.d);
                    return;
                }
                return;
        }
    }
}
