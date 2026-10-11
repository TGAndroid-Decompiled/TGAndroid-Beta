package qf;

import android.graphics.Rect;
import android.view.Choreographer;
import java.util.ArrayList;
import vh.h;
import vh.i;
import w7.o;
import yf.x;
public final class b implements Choreographer.FrameCallback {
    public final int f46248a;
    public final Object f46249b;

    public b(Object obj, int i10) {
        this.f46248a = i10;
        this.f46249b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        switch (this.f46248a) {
            case 0:
                c cVar = (c) this.f46249b;
                tf.a aVar = cVar.f46258k;
                tf.a aVar2 = cVar.f46257j;
                if (cVar.f46261n) {
                    ArrayList arrayList = cVar.f46251b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        f fVar = ((sf.e) ((rf.b) obj)).f48108f;
                        if (fVar != null) {
                            fVar.invalidate();
                        }
                    }
                    if (aVar2.f48381c != 0) {
                        cVar.d(o.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.f48381c != 0) {
                        cVar.d(o.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
                    }
                    cVar.f46259l.postFrameCallback(cVar.f46260m);
                    return;
                }
                return;
            case 1:
                ((Runnable) this.f46249b).run();
                return;
            case 2:
                i iVar = (i) this.f46249b;
                Rect rect = iVar.f49838m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - iVar.h > 32 && !iVar.f49835j && !rect.isEmpty()) {
                    iVar.h = currentTimeMillis;
                    iVar.f49835j = true;
                    iVar.f49840o.set(rect);
                    iVar.f49828a.postRunnable(new h(iVar, (iVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                iVar.f49837l = false;
                return;
            default:
                x xVar = (x) this.f46249b;
                if (xVar.F.get()) {
                    long j10 = xVar.f52323b;
                    if (j10 == 0) {
                        xVar.f52323b = j3;
                    } else if (j3 - j10 >= 1000000000) {
                        xVar.f52324c = xVar.f52322a;
                        xVar.f52326f = xVar.f52325e.getAndSet(0);
                        xVar.f52322a = 0;
                        xVar.f52323b = j3;
                    } else {
                        xVar.f52322a++;
                    }
                    Choreographer.getInstance().postFrameCallback(xVar.d);
                    return;
                }
                return;
        }
    }
}
