package vh;

import android.content.Context;
import org.telegram.ui.Components.mv;
public final class j1 extends mv {
    public final l1 f51318g0;

    public j1(l1 l1Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var, false, false, false, true, 0, null, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21260v6, p6Var), false);
        this.f51318g0 = l1Var;
    }

    @Override
    public final boolean h(int i10) {
        int i11;
        int paddingTop;
        o1 o1Var;
        l1 l1Var = this.f51318g0;
        c1 c1Var = l1Var.f51460b;
        k1 k1Var = l1Var.f51461c;
        p1 p1Var = l1Var.f51462f;
        int i12 = 0;
        if (this.d) {
            return false;
        }
        if (p1Var != null && (o1Var = p1Var.h) != null) {
            if (o1Var.getSelectedCategory() != null) {
                c1.z1(c1Var, 0, 0);
                p1Var.h.I1(null);
            }
            p1Var.h.G1();
            p1Var.b();
        }
        if (k1Var != null) {
            k1Var.D(null);
        }
        while (true) {
            if (i12 < k1Var.D.size()) {
                i11 = k1Var.D.keyAt(i12);
                if (k1Var.D.valueAt(i12) == i10) {
                    break;
                }
                i12++;
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 >= 0) {
            float f7 = l1Var.f51463n;
            if (f7 >= 0.0f) {
                paddingTop = c1Var.getPaddingTop();
            } else {
                f7 = l1Var.b();
                l1Var.f51463n = f7;
                paddingTop = c1Var.getPaddingTop();
            }
            c1.z1(c1Var, i11, ((int) (f7 + paddingTop)) - org.telegram.messenger.i0.L(102.0f));
        }
        return true;
    }
}
