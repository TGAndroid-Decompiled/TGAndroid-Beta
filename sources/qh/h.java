package qh;

import android.view.View;
import android.view.ViewTreeObserver;
public final class h implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public final int f46407a;
    public final Object f46408b;

    public h(Object obj, int i9) {
        this.f46407a = i9;
        this.f46408b = obj;
    }

    @Override
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z10;
        switch (this.f46407a) {
            case 0:
                ((p) this.f46408b).Y();
                return;
            case 1:
                ((x1) this.f46408b).v0();
                return;
            case 2:
                o3 o3Var = (o3) this.f46408b;
                if (view2 != null && o3Var.F(view2) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                o3Var.W2 = z10;
                if (view2 instanceof d1) {
                    o3Var.H3 = (d1) view2;
                    return;
                }
                return;
            default:
                f5 f5Var = (f5) this.f46408b;
                f5Var.x();
                h5 h5Var = f5Var.v;
                if (h5Var != null) {
                    h5Var.invalidate();
                    return;
                }
                return;
        }
    }
}
