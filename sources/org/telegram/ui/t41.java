package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class t41 implements r0.o, org.telegram.ui.ActionBar.c2 {
    public final int f38383a;
    public final w41 f38384b;

    public t41(w41 w41Var, int i10) {
        this.f38383a = i10;
        this.f38384b = w41Var;
    }

    @Override
    public r0.m1 M0(View view, r0.m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        w41 w41Var = this.f38384b;
        w41Var.e = defaultWindowInsets;
        w41Var.f39267c.setPadding(defaultWindowInsets.f7196a, defaultWindowInsets.f7197b, defaultWindowInsets.f7198c, defaultWindowInsets.d);
        w41Var.f39265b.requestLayout();
        return r0.m1.f43153b;
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f38383a) {
            case 1:
                org.telegram.ui.ActionBar.d2 d2Var2 = this.f38384b.Z;
                if (d2Var2 != null) {
                    d2Var2.dismiss();
                    return;
                }
                return;
            default:
                w41 w41Var = this.f38384b;
                org.telegram.ui.ActionBar.d2 d2Var3 = w41Var.Z;
                if (d2Var3 != null) {
                    d2Var3.dismiss();
                    w41Var.Z = null;
                }
                w41Var.dismiss();
                return;
        }
    }
}
