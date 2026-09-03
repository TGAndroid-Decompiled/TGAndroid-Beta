package vh;

import android.view.View;
import android.view.ViewTreeObserver;
public final class i implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public final int f46004a;
    public final Object f46005b;

    public i(Object obj, int i10) {
        this.f46004a = i10;
        this.f46005b = obj;
    }

    @Override
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z4;
        switch (this.f46004a) {
            case 0:
                ((q) this.f46005b).Z();
                return;
            case 1:
                ((y1) this.f46005b).w0();
                return;
            case 2:
                s3 s3Var = (s3) this.f46005b;
                if (view2 != null && s3Var.F(view2) != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                s3Var.X2 = z4;
                if (view2 instanceof e1) {
                    s3Var.I3 = (e1) view2;
                    return;
                }
                return;
            default:
                j5 j5Var = (j5) this.f46005b;
                j5Var.x();
                l5 l5Var = j5Var.v;
                if (l5Var != null) {
                    l5Var.invalidate();
                    return;
                }
                return;
        }
    }
}
