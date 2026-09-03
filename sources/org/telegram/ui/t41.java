package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class t41 implements r0.o, org.telegram.ui.ActionBar.c2 {
    public final int f41443a;
    public final w41 f41444b;

    public t41(w41 w41Var, int i10) {
        this.f41443a = i10;
        this.f41444b = w41Var;
    }

    @Override
    public r0.m1 M0(View view, r0.m1 m1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        w41 w41Var = this.f41444b;
        w41Var.f42284e = defaultWindowInsets;
        w41Var.f42283c.setPadding(defaultWindowInsets.f7757a, defaultWindowInsets.f7758b, defaultWindowInsets.f7759c, defaultWindowInsets.d);
        w41Var.f42281b.requestLayout();
        return r0.m1.f46482b;
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f41443a) {
            case 1:
                org.telegram.ui.ActionBar.d2 d2Var2 = this.f41444b.Z;
                if (d2Var2 != null) {
                    d2Var2.dismiss();
                    return;
                }
                return;
            default:
                w41 w41Var = this.f41444b;
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
