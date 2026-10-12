package r4;

import android.graphics.Rect;
import android.view.Choreographer;
import java.util.ArrayList;
import w7.s;
import zf.y;
public final class e implements Choreographer.FrameCallback {
    public final int f43911a;
    public final Object f43912b;

    public e(Object obj, int i10) {
        this.f43911a = i10;
        this.f43912b = obj;
    }

    @Override
    public final void doFrame(long j10) {
        switch (this.f43911a) {
            case 0:
                ((Runnable) this.f43912b).run();
                return;
            case 1:
                rf.b bVar = (rf.b) this.f43912b;
                uf.a aVar = bVar.f44159k;
                uf.a aVar2 = bVar.f44158j;
                if (bVar.f44162n) {
                    ArrayList arrayList = bVar.f44153b;
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
                    if (aVar2.f46248c != 0) {
                        bVar.d(s.a(aVar2.b() / 0.95f, 0.0f, 1.0f));
                    } else if (aVar.f46248c != 0) {
                        bVar.d(s.a(1.0f - (aVar.b() / 0.95f), 0.0f, 1.0f));
                    }
                    bVar.f44160l.postFrameCallback(bVar.f44161m);
                    return;
                }
                return;
            case 2:
                wh.i iVar = (wh.i) this.f43912b;
                Rect rect = iVar.f47695m;
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - iVar.h > 32 && !iVar.f47692j && !rect.isEmpty()) {
                    iVar.h = currentTimeMillis;
                    iVar.f47692j = true;
                    iVar.f47697o.set(rect);
                    iVar.f47686a.postRunnable(new wh.h(iVar, (iVar.d + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                iVar.f47694l = false;
                return;
            default:
                y yVar = (y) this.f43912b;
                if (yVar.F.get()) {
                    long j11 = yVar.f50219b;
                    if (j11 == 0) {
                        yVar.f50219b = j10;
                    } else if (j10 - j11 >= 1000000000) {
                        yVar.f50220c = yVar.f50218a;
                        yVar.f50221f = yVar.e.getAndSet(0);
                        yVar.f50218a = 0;
                        yVar.f50219b = j10;
                    } else {
                        yVar.f50218a++;
                    }
                    Choreographer.getInstance().postFrameCallback(yVar.d);
                    return;
                }
                return;
        }
    }
}
