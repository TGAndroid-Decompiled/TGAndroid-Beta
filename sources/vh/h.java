package vh;

import android.view.View;
import android.view.ViewTreeObserver;
public final class h implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public final int f45907a;
    public final Object f45908b;

    public h(Object obj, int i10) {
        this.f45907a = i10;
        this.f45908b = obj;
    }

    @Override
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z4;
        switch (this.f45907a) {
            case 0:
                ((p) this.f45908b).Z();
                return;
            case 1:
                ((y1) this.f45908b).w0();
                return;
            case 2:
                r3 r3Var = (r3) this.f45908b;
                if (view2 != null && r3Var.F(view2) != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                r3Var.X2 = z4;
                if (view2 instanceof d1) {
                    r3Var.I3 = (d1) view2;
                    return;
                }
                return;
            default:
                i5 i5Var = (i5) this.f45908b;
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
