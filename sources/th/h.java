package th;

import android.view.View;
import android.view.ViewTreeObserver;
public final class h implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public final int f48469a;
    public final Object f48470b;

    public h(Object obj, int i10) {
        this.f48469a = i10;
        this.f48470b = obj;
    }

    @Override
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z10;
        switch (this.f48469a) {
            case 0:
                ((p) this.f48470b).Z();
                return;
            case 1:
                ((x1) this.f48470b).w0();
                return;
            case 2:
                p3 p3Var = (p3) this.f48470b;
                if (view2 != null && p3Var.F(view2) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                p3Var.W2 = z10;
                if (view2 instanceof d1) {
                    p3Var.H3 = (d1) view2;
                    return;
                }
                return;
            default:
                g5 g5Var = (g5) this.f48470b;
                g5Var.x();
                i5 i5Var = g5Var.v;
                if (i5Var != null) {
                    i5Var.invalidate();
                    return;
                }
                return;
        }
    }
}
