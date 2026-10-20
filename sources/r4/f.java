package r4;

import android.graphics.Rect;
import android.view.Choreographer;
import java.util.ArrayList;
import w7.r;
import zf.x;
public final class f implements Choreographer.FrameCallback {
    public final int f45008a;
    public final Object f45009b;

    public f(Object obj, int i10) {
        this.f45008a = i10;
        this.f45009b = obj;
    }

    @Override
    public final void doFrame(long j10) {
        switch (this.f45008a) {
            case 0:
                ((Runnable) this.f45009b).run();
                return;
            case 1:
                rf.b bVar = (rf.b) this.f45009b;
                uf.a aVar = bVar.f45256k;
                uf.a aVar2 = bVar.f45255j;
                if (bVar.f45259n) {
                    ArrayList arrayList = bVar.f45250b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        rf.e eVar = ((tf.e) ((sf.b) obj)).f47017f;
                        if (eVar != null) {
                            eVar.invalidate();
                        }
                    }
                    if (aVar2.f47641c != 0) {
                        bVar.d(r.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.f47641c != 0) {
                        bVar.d(r.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
                    }
                    bVar.f45257l.postFrameCallback(bVar.f45258m);
                    return;
                }
                return;
            case 2:
                wh.i iVar = (wh.i) this.f45009b;
                Rect rect = iVar.f49087m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - iVar.h > 32 && !iVar.f49084j && !rect.isEmpty()) {
                    iVar.h = currentTimeMillis;
                    iVar.f49084j = true;
                    iVar.f49089o.set(rect);
                    iVar.f49078a.postRunnable(new wh.h(iVar, (iVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                iVar.f49086l = false;
                return;
            default:
                x xVar = (x) this.f45009b;
                if (xVar.F.get()) {
                    long j11 = xVar.f51606b;
                    if (j11 == 0) {
                        xVar.f51606b = j10;
                    } else if (j10 - j11 >= 1000000000) {
                        xVar.f51607c = xVar.f51605a;
                        xVar.f51608f = xVar.e.getAndSet(0);
                        xVar.f51605a = 0;
                        xVar.f51606b = j10;
                    } else {
                        xVar.f51605a++;
                    }
                    Choreographer.getInstance().postFrameCallback(xVar.d);
                    return;
                }
                return;
        }
    }
}
