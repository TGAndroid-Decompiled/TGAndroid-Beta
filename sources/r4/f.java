package r4;

import android.graphics.Rect;
import android.view.Choreographer;
import java.util.ArrayList;
import w7.r;
import zf.x;
public final class f implements Choreographer.FrameCallback {
    public final int f44998a;
    public final Object f44999b;

    public f(Object obj, int i10) {
        this.f44998a = i10;
        this.f44999b = obj;
    }

    @Override
    public final void doFrame(long j10) {
        switch (this.f44998a) {
            case 0:
                ((Runnable) this.f44999b).run();
                return;
            case 1:
                rf.b bVar = (rf.b) this.f44999b;
                uf.a aVar = bVar.f45246k;
                uf.a aVar2 = bVar.f45245j;
                if (bVar.f45249n) {
                    ArrayList arrayList = bVar.f45240b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        rf.e eVar = ((tf.e) ((sf.b) obj)).f47010f;
                        if (eVar != null) {
                            eVar.invalidate();
                        }
                    }
                    if (aVar2.f47631c != 0) {
                        bVar.d(r.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.f47631c != 0) {
                        bVar.d(r.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
                    }
                    bVar.f45247l.postFrameCallback(bVar.f45248m);
                    return;
                }
                return;
            case 2:
                wh.i iVar = (wh.i) this.f44999b;
                Rect rect = iVar.f49080m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - iVar.h > 32 && !iVar.f49077j && !rect.isEmpty()) {
                    iVar.h = currentTimeMillis;
                    iVar.f49077j = true;
                    iVar.f49082o.set(rect);
                    iVar.f49071a.postRunnable(new wh.h(iVar, (iVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                iVar.f49079l = false;
                return;
            default:
                x xVar = (x) this.f44999b;
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
