package r4;

import android.graphics.Rect;
import android.view.Choreographer;
import java.util.ArrayList;
import w7.r;
import zf.y;
public final class e implements Choreographer.FrameCallback {
    public final int f43670a;
    public final Object f43671b;

    public e(Object obj, int i10) {
        this.f43670a = i10;
        this.f43671b = obj;
    }

    @Override
    public final void doFrame(long j10) {
        switch (this.f43670a) {
            case 0:
                ((Runnable) this.f43671b).run();
                return;
            case 1:
                rf.b bVar = (rf.b) this.f43671b;
                uf.a aVar = bVar.f43918k;
                uf.a aVar2 = bVar.f43917j;
                if (bVar.f43921n) {
                    ArrayList arrayList = bVar.f43912b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        rf.e eVar = ((tf.e) ((sf.b) obj)).f45649f;
                        if (eVar != null) {
                            eVar.invalidate();
                        }
                    }
                    if (aVar2.f46247c != 0) {
                        bVar.d(r.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.f46247c != 0) {
                        bVar.d(r.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
                    }
                    bVar.f43919l.postFrameCallback(bVar.f43920m);
                    return;
                }
                return;
            case 2:
                wh.i iVar = (wh.i) this.f43671b;
                Rect rect = iVar.f47694m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - iVar.h > 32 && !iVar.f47691j && !rect.isEmpty()) {
                    iVar.h = currentTimeMillis;
                    iVar.f47691j = true;
                    iVar.f47696o.set(rect);
                    iVar.f47685a.postRunnable(new wh.h(iVar, (iVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                iVar.f47693l = false;
                return;
            default:
                y yVar = (y) this.f43671b;
                if (yVar.F.get()) {
                    long j11 = yVar.f50220b;
                    if (j11 == 0) {
                        yVar.f50220b = j10;
                    } else if (j10 - j11 >= 1000000000) {
                        yVar.f50221c = yVar.f50219a;
                        yVar.f50222f = yVar.e.getAndSet(0);
                        yVar.f50219a = 0;
                        yVar.f50220b = j10;
                    } else {
                        yVar.f50219a++;
                    }
                    Choreographer.getInstance().postFrameCallback(yVar.d);
                    return;
                }
                return;
        }
    }
}
