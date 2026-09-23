package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class x41 implements r0.n, org.telegram.ui.ActionBar.a2 {
    public final int f39187a;
    public final a51 f39188b;

    public x41(a51 a51Var, int i10) {
        this.f39187a = i10;
        this.f39188b = a51Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        a51 a51Var = this.f39188b;
        a51Var.e = defaultWindowInsets;
        a51Var.f31670c.setPadding(defaultWindowInsets.f10576a, defaultWindowInsets.f10577b, defaultWindowInsets.f10578c, defaultWindowInsets.d);
        a51Var.f31668b.requestLayout();
        return r0.l1.f41806b;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f39187a) {
            case 1:
                org.telegram.ui.ActionBar.b2 b2Var2 = this.f39188b.f31671c0;
                if (b2Var2 != null) {
                    b2Var2.dismiss();
                    return;
                }
                return;
            default:
                a51 a51Var = this.f39188b;
                org.telegram.ui.ActionBar.b2 b2Var3 = a51Var.f31671c0;
                if (b2Var3 != null) {
                    b2Var3.dismiss();
                    a51Var.f31671c0 = null;
                }
                a51Var.dismiss();
                return;
        }
    }
}
