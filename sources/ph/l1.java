package ph;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.xv;
public final class l1 extends xv {
    public final o1 f41874d0;

    public l1(o1 o1Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, false, false, false, true, 0, null, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20225v6, f6Var), false);
        this.f41874d0 = o1Var;
    }

    @Override
    public final boolean h(int i10) {
        int i11;
        int paddingTop;
        r1 r1Var;
        o1 o1Var = this.f41874d0;
        d1 d1Var = o1Var.f42038b;
        n1 n1Var = o1Var.f42039c;
        s1 s1Var = o1Var.f42040f;
        int i12 = 0;
        if (this.d) {
            return false;
        }
        if (s1Var != null && (r1Var = s1Var.f42299f) != null) {
            if (r1Var.getSelectedCategory() != null) {
                d1.w1(d1Var, 0, 0);
                s1Var.f42299f.F1(null);
            }
            s1Var.f42299f.D1();
            s1Var.b();
        }
        if (n1Var != null) {
            n1Var.D(null);
        }
        while (true) {
            if (i12 < n1Var.f42003y.size()) {
                i11 = n1Var.f42003y.keyAt(i12);
                if (n1Var.f42003y.valueAt(i12) == i10) {
                    break;
                }
                i12++;
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 >= 0) {
            float f10 = o1Var.f42041n;
            if (f10 >= 0.0f) {
                paddingTop = d1Var.getPaddingTop();
            } else {
                f10 = o1Var.b();
                o1Var.f42041n = f10;
                paddingTop = d1Var.getPaddingTop();
            }
            d1.w1(d1Var, i11, ((int) (f10 + paddingTop)) - AndroidUtilities.dp(102.0f));
        }
        return true;
    }
}
