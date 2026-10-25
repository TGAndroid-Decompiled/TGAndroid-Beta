package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class z31 implements r0.n, org.telegram.ui.ActionBar.b2 {
    public final int f46164a;
    public final c41 f46165b;

    public z31(c41 c41Var, int i10) {
        this.f46164a = i10;
        this.f46165b = c41Var;
    }

    @Override
    public r0.k1 P0(View view, r0.k1 k1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        c41 c41Var = this.f46165b;
        c41Var.e = defaultWindowInsets;
        c41Var.f38250c.setPadding(defaultWindowInsets.f13450a, defaultWindowInsets.f13451b, defaultWindowInsets.f13452c, defaultWindowInsets.d);
        c41Var.f38248b.requestLayout();
        return r0.k1.f47114b;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f46164a) {
            case 1:
                org.telegram.ui.ActionBar.e2 e2Var2 = this.f46165b.f38251c0;
                if (e2Var2 != null) {
                    e2Var2.dismiss();
                    return;
                }
                return;
            default:
                c41 c41Var = this.f46165b;
                org.telegram.ui.ActionBar.e2 e2Var3 = c41Var.f38251c0;
                if (e2Var3 != null) {
                    e2Var3.dismiss();
                    c41Var.f38251c0 = null;
                }
                c41Var.dismiss();
                return;
        }
    }
}
