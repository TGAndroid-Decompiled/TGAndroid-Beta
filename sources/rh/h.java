package rh;

import android.view.View;
import android.view.ViewTreeObserver;

public final class h implements ViewTreeObserver.OnGlobalFocusChangeListener {

    public final int f47169a;

    public final Object f47170b;

    public h(Object obj, int i10) {
        this.f47169a = i10;
        this.f47170b = obj;
    }

    @Override
    public final void onGlobalFocusChanged(View view, View view2) {
        switch (this.f47169a) {
            case 0:
                ((p) this.f47170b).Z();
                break;
            case 1:
                ((x1) this.f47170b).w0();
                break;
            case 2:
                p3 p3Var = (p3) this.f47170b;
                p3Var.W2 = (view2 == null || p3Var.F(view2) == null) ? false : true;
                if (view2 instanceof d1) {
                    p3Var.H3 = (d1) view2;
                }
                break;
            default:
                g5 g5Var = (g5) this.f47170b;
                g5Var.x();
                i5 i5Var = g5Var.v;
                if (i5Var != null) {
                    i5Var.invalidate();
                }
                break;
        }
    }
}
