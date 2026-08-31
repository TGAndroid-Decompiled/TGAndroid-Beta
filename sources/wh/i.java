package wh;

import android.view.View;
import android.view.ViewTreeObserver;
public final class i implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public final int f49775a;
    public final Object f49776b;

    public i(Object obj, int i10) {
        this.f49775a = i10;
        this.f49776b = obj;
    }

    @Override
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z4;
        switch (this.f49775a) {
            case 0:
                ((q) this.f49776b).Z();
                return;
            case 1:
                ((z1) this.f49776b).w0();
                return;
            case 2:
                r3 r3Var = (r3) this.f49776b;
                if (view2 != null && r3Var.F(view2) != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                r3Var.X2 = z4;
                if (view2 instanceof e1) {
                    r3Var.I3 = (e1) view2;
                    return;
                }
                return;
            default:
                i5 i5Var = (i5) this.f49776b;
                i5Var.x();
                k5 k5Var = i5Var.v;
                if (k5Var != null) {
                    k5Var.invalidate();
                    return;
                }
                return;
        }
    }
}
