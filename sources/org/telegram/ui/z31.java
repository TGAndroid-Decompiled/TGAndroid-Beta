package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class z31 implements r0.o, org.telegram.ui.ActionBar.a2 {

    public final int f45015a;

    public final c41 f45016b;

    public z31(c41 c41Var, int i10) {
        this.f45015a = i10;
        this.f45016b = c41Var;
    }

    @Override
    public r0.m1 I0(View view, r0.m1 m1Var) {
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        c41 c41Var = this.f45016b;
        c41Var.f36940e = defaultWindowInsets;
        c41Var.f36939c.setPadding(defaultWindowInsets.f10489a, defaultWindowInsets.f10490b, defaultWindowInsets.f10491c, defaultWindowInsets.d);
        c41Var.f36938b.requestLayout();
        return r0.m1.f46618b;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f45015a) {
            case 1:
                org.telegram.ui.ActionBar.b2 b2Var2 = this.f45016b.Y;
                if (b2Var2 != null) {
                    b2Var2.dismiss();
                }
                break;
            default:
                c41 c41Var = this.f45016b;
                org.telegram.ui.ActionBar.b2 b2Var3 = c41Var.Y;
                if (b2Var3 != null) {
                    b2Var3.dismiss();
                    c41Var.Y = null;
                }
                c41Var.dismiss();
                break;
        }
    }
}
