package qh;

import android.graphics.RectF;
import android.view.View;
import r0.i0;
public final class h implements Runnable {
    public final int f44647a;
    public final i f44648b;

    public h(i iVar, int i10) {
        this.f44647a = i10;
        this.f44648b = iVar;
    }

    @Override
    public final void run() {
        int i10 = this.f44647a;
        i iVar = this.f44648b;
        switch (i10) {
            case 0:
                if (iVar.v != 0) {
                    iVar.h(false);
                    return;
                }
                return;
            default:
                int i11 = iVar.G - 1;
                iVar.G = i11;
                if (i11 == 0) {
                    View view = iVar.E;
                    RectF rectF = e.f44643e;
                    iVar.k(e.Z0(i0.f(view), view, view.getRootView()), false);
                    return;
                }
                return;
        }
    }
}
