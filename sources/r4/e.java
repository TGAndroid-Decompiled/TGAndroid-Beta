package r4;

import android.graphics.Rect;
import android.view.Choreographer;
import java.util.ArrayList;
import w7.r;
import zf.x;
public final class e implements Choreographer.FrameCallback {
    public final int f45423a;
    public final Object f45424b;

    public e(Object obj, int i10) {
        this.f45423a = i10;
        this.f45424b = obj;
    }

    @Override
    public final void doFrame(long j10) {
        switch (this.f45423a) {
            case 0:
                ((Runnable) this.f45424b).run();
                return;
            case 1:
                rf.b bVar = (rf.b) this.f45424b;
                uf.a aVar = bVar.f45671k;
                uf.a aVar2 = bVar.f45670j;
                if (bVar.f45674n) {
                    ArrayList arrayList = bVar.f45665b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        rf.e eVar = ((tf.e) ((sf.b) obj)).f47455f;
                        if (eVar != null) {
                            eVar.invalidate();
                        }
                    }
                    if (aVar2.f48084c != 0) {
                        bVar.d(r.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.f48084c != 0) {
                        bVar.d(r.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
                    }
                    bVar.f45672l.postFrameCallback(bVar.f45673m);
                    return;
                }
                return;
            case 2:
                wh.i iVar = (wh.i) this.f45424b;
                Rect rect = iVar.f49532m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - iVar.h > 32 && !iVar.f49529j && !rect.isEmpty()) {
                    iVar.h = currentTimeMillis;
                    iVar.f49529j = true;
                    iVar.f49534o.set(rect);
                    iVar.f49523a.postRunnable(new wh.h(iVar, (iVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                iVar.f49531l = false;
                return;
            default:
                x xVar = (x) this.f45424b;
                if (xVar.F.get()) {
                    long j11 = xVar.f52071b;
                    if (j11 == 0) {
                        xVar.f52071b = j10;
                    } else if (j10 - j11 >= 1000000000) {
                        xVar.f52072c = xVar.f52070a;
                        xVar.f52073f = xVar.e.getAndSet(0);
                        xVar.f52070a = 0;
                        xVar.f52071b = j10;
                    } else {
                        xVar.f52070a++;
                    }
                    Choreographer.getInstance().postFrameCallback(xVar.d);
                    return;
                }
                return;
        }
    }
}
