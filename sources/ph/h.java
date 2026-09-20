package ph;

import android.graphics.RectF;
import android.view.View;
import r0.i0;
public final class h implements Runnable {
    public final int f41364a;
    public final i f41365b;

    public h(i iVar, int i10) {
        this.f41364a = i10;
        this.f41365b = iVar;
    }

    @Override
    public final void run() {
        int i10 = this.f41364a;
        i iVar = this.f41365b;
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
                    RectF rectF = e.e;
                    iVar.k(e.Z0(i0.f(view), view, view.getRootView()), false);
                    return;
                }
                return;
        }
    }
}
