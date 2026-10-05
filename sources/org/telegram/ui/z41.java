package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class z41 implements r0.n, org.telegram.ui.ActionBar.a2 {
    public final int f43698a;
    public final c51 f43699b;

    public z41(c51 c51Var, int i10) {
        this.f43698a = i10;
        this.f43699b = c51Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        c51 c51Var = this.f43699b;
        c51Var.f35317e = defaultWindowInsets;
        c51Var.f35314c.setPadding(defaultWindowInsets.f11526a, defaultWindowInsets.f11527b, defaultWindowInsets.f11528c, defaultWindowInsets.d);
        c51Var.f35312b.requestLayout();
        return r0.l1.f45623b;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f43698a) {
            case 1:
                org.telegram.ui.ActionBar.b2 b2Var2 = this.f43699b.f35315c0;
                if (b2Var2 != null) {
                    b2Var2.dismiss();
                    return;
                }
                return;
            default:
                c51 c51Var = this.f43699b;
                org.telegram.ui.ActionBar.b2 b2Var3 = c51Var.f35315c0;
                if (b2Var3 != null) {
                    b2Var3.dismiss();
                    c51Var.f35315c0 = null;
                }
                c51Var.dismiss();
                return;
        }
    }
}
