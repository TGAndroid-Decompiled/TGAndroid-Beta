package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class z31 implements r0.n, org.telegram.ui.ActionBar.b2 {
    public final int f46167a;
    public final c41 f46168b;

    public z31(c41 c41Var, int i10) {
        this.f46167a = i10;
        this.f46168b = c41Var;
    }

    @Override
    public r0.k1 P0(View view, r0.k1 k1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        c41 c41Var = this.f46168b;
        c41Var.e = defaultWindowInsets;
        c41Var.f38253c.setPadding(defaultWindowInsets.f13450a, defaultWindowInsets.f13451b, defaultWindowInsets.f13452c, defaultWindowInsets.d);
        c41Var.f38251b.requestLayout();
        return r0.k1.f47117b;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f46167a) {
            case 1:
                org.telegram.ui.ActionBar.e2 e2Var2 = this.f46168b.f38254c0;
                if (e2Var2 != null) {
                    e2Var2.dismiss();
                    return;
                }
                return;
            default:
                c41 c41Var = this.f46168b;
                org.telegram.ui.ActionBar.e2 e2Var3 = c41Var.f38254c0;
                if (e2Var3 != null) {
                    e2Var3.dismiss();
                    c41Var.f38254c0 = null;
                }
                c41Var.dismiss();
                return;
        }
    }
}
