package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class u31 implements r0.n, org.telegram.ui.ActionBar.a2 {
    public final int f41793a;
    public final x31 f41794b;

    public u31(x31 x31Var, int i10) {
        this.f41793a = i10;
        this.f41794b = x31Var;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        x31 x31Var = this.f41794b;
        x31Var.e = defaultWindowInsets;
        x31Var.f43018c.setPadding(defaultWindowInsets.f12283a, defaultWindowInsets.f12284b, defaultWindowInsets.f12285c, defaultWindowInsets.d);
        x31Var.f43016b.requestLayout();
        return r0.k1.f44826b;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f41793a) {
            case 1:
                org.telegram.ui.ActionBar.b2 b2Var2 = this.f41794b.f43019c0;
                if (b2Var2 != null) {
                    b2Var2.dismiss();
                    return;
                }
                return;
            default:
                x31 x31Var = this.f41794b;
                org.telegram.ui.ActionBar.b2 b2Var3 = x31Var.f43019c0;
                if (b2Var3 != null) {
                    b2Var3.dismiss();
                    x31Var.f43019c0 = null;
                }
                x31Var.dismiss();
                return;
        }
    }
}
