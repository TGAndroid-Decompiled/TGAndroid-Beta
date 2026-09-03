package ph;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.wv;
public final class k1 extends wv {
    public final n1 f41873d0;

    public k1(n1 n1Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var, false, false, false, true, 0, null, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20200v6, f6Var), false);
        this.f41873d0 = n1Var;
    }

    @Override
    public final boolean h(int i10) {
        int i11;
        int paddingTop;
        q1 q1Var;
        n1 n1Var = this.f41873d0;
        d1 d1Var = n1Var.f42035b;
        m1 m1Var = n1Var.f42036c;
        r1 r1Var = n1Var.f42037f;
        int i12 = 0;
        if (this.d) {
            return false;
        }
        if (r1Var != null && (q1Var = r1Var.f42270f) != null) {
            if (q1Var.getSelectedCategory() != null) {
                d1.v1(d1Var, 0, 0);
                r1Var.f42270f.E1(null);
            }
            r1Var.f42270f.C1();
            r1Var.b();
        }
        if (m1Var != null) {
            m1Var.D(null);
        }
        while (true) {
            if (i12 < m1Var.f42004y.size()) {
                i11 = m1Var.f42004y.keyAt(i12);
                if (m1Var.f42004y.valueAt(i12) == i10) {
                    break;
                }
                i12++;
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 >= 0) {
            float f10 = n1Var.f42038n;
            if (f10 >= 0.0f) {
                paddingTop = d1Var.getPaddingTop();
            } else {
                f10 = n1Var.b();
                n1Var.f42038n = f10;
                paddingTop = d1Var.getPaddingTop();
            }
            d1.v1(d1Var, i11, ((int) (f10 + paddingTop)) - AndroidUtilities.dp(102.0f));
        }
        return true;
    }
}
