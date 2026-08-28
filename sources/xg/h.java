package xg;

import android.graphics.RectF;
import android.view.View;
import r0.j0;
public final class h implements Runnable {
    public final int f49439a;
    public final i f49440b;

    public h(i iVar, int i9) {
        this.f49439a = i9;
        this.f49440b = iVar;
    }

    @Override
    public final void run() {
        int i9 = this.f49439a;
        i iVar = this.f49440b;
        switch (i9) {
            case 0:
                if (iVar.v != 0) {
                    iVar.h(false);
                    return;
                }
                return;
            default:
                int i10 = iVar.C - 1;
                iVar.C = i10;
                if (i10 == 0) {
                    View view = iVar.A;
                    RectF rectF = e.f49435e;
                    iVar.j(e.Q(j0.f(view), view, view.getRootView()), false);
                    return;
                }
                return;
        }
    }
}
