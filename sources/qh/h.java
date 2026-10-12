package qh;

import android.graphics.RectF;
import android.view.View;
import java.util.WeakHashMap;
import r0.c0;
import r0.j0;
public final class h implements Runnable {
    public final int f43636a;
    public final i f43637b;

    public h(i iVar, int i10) {
        this.f43636a = i10;
        this.f43637b = iVar;
    }

    @Override
    public final void run() {
        int i10 = this.f43636a;
        i iVar = this.f43637b;
        switch (i10) {
            case 0:
                if (iVar.v != 0) {
                    iVar.i(false);
                    return;
                }
                return;
            default:
                int i11 = iVar.G - 1;
                iVar.G = i11;
                if (i11 == 0) {
                    View view = iVar.E;
                    RectF rectF = e.e;
                    WeakHashMap weakHashMap = j0.f43732a;
                    iVar.l(e.e1(c0.a(view), view, view.getRootView()), false);
                    return;
                }
                return;
        }
    }
}
