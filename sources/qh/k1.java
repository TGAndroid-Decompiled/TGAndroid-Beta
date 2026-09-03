package qh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.zv;
public final class k1 extends zv {
    public final n1 f45606d0;

    public k1(n1 n1Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var, false, false, false, true, 0, null, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21981v6, g6Var), false);
        this.f45606d0 = n1Var;
    }

    @Override
    public final boolean h(int i10) {
        int i11;
        int paddingTop;
        q1 q1Var;
        n1 n1Var = this.f45606d0;
        d1 d1Var = n1Var.f45792b;
        m1 m1Var = n1Var.f45793c;
        r1 r1Var = n1Var.f45795f;
        int i12 = 0;
        if (this.d) {
            return false;
        }
        if (r1Var != null && (q1Var = r1Var.f45982f) != null) {
            if (q1Var.getSelectedCategory() != null) {
                d1.v1(d1Var, 0, 0);
                r1Var.f45982f.E1(null);
            }
            r1Var.f45982f.C1();
            r1Var.b();
        }
        if (m1Var != null) {
            m1Var.D(null);
        }
        while (true) {
            if (i12 < m1Var.f45740y.size()) {
                i11 = m1Var.f45740y.keyAt(i12);
                if (m1Var.f45740y.valueAt(i12) == i10) {
                    break;
                }
                i12++;
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 >= 0) {
            float f10 = n1Var.f45796n;
            if (f10 >= 0.0f) {
                paddingTop = d1Var.getPaddingTop();
            } else {
                f10 = n1Var.b();
                n1Var.f45796n = f10;
                paddingTop = d1Var.getPaddingTop();
            }
            d1.v1(d1Var, i11, ((int) (f10 + paddingTop)) - AndroidUtilities.dp(102.0f));
        }
        return true;
    }
}
