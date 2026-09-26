package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class y41 implements r0.n, org.telegram.ui.ActionBar.z1 {
    public final int f40052a;
    public final b51 f40053b;

    public y41(b51 b51Var, int i10) {
        this.f40052a = i10;
        this.f40053b = b51Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        b51 b51Var = this.f40053b;
        b51Var.e = defaultWindowInsets;
        b51Var.f32324c.setPadding(defaultWindowInsets.f10576a, defaultWindowInsets.f10577b, defaultWindowInsets.f10578c, defaultWindowInsets.d);
        b51Var.f32322b.requestLayout();
        return r0.l1.f42138b;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f40052a) {
            case 1:
                org.telegram.ui.ActionBar.a2 a2Var2 = this.f40053b.f32325c0;
                if (a2Var2 != null) {
                    a2Var2.dismiss();
                    return;
                }
                return;
            default:
                b51 b51Var = this.f40053b;
                org.telegram.ui.ActionBar.a2 a2Var3 = b51Var.f32325c0;
                if (a2Var3 != null) {
                    a2Var3.dismiss();
                    b51Var.f32325c0 = null;
                }
                b51Var.dismiss();
                return;
        }
    }
}
