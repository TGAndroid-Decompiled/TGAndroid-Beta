package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class x31 implements r0.n, org.telegram.ui.ActionBar.z1 {
    public final int f43462a;
    public final a41 f43463b;

    public x31(a41 a41Var, int i10) {
        this.f43462a = i10;
        this.f43463b = a41Var;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        a41 a41Var = this.f43463b;
        a41Var.e = defaultWindowInsets;
        a41Var.f35580c.setPadding(defaultWindowInsets.f12315a, defaultWindowInsets.f12316b, defaultWindowInsets.f12317c, defaultWindowInsets.d);
        a41Var.f35578b.requestLayout();
        return r0.k1.f45249b;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f43462a) {
            case 1:
                org.telegram.ui.ActionBar.c2 c2Var2 = this.f43463b.f35581c0;
                if (c2Var2 != null) {
                    c2Var2.dismiss();
                    return;
                }
                return;
            default:
                a41 a41Var = this.f43463b;
                org.telegram.ui.ActionBar.c2 c2Var3 = a41Var.f35581c0;
                if (c2Var3 != null) {
                    c2Var3.dismiss();
                    a41Var.f35581c0 = null;
                }
                a41Var.dismiss();
                return;
        }
    }
}
