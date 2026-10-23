package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class y31 implements r0.n, org.telegram.ui.ActionBar.z1 {
    public final int f43706a;
    public final b41 f43707b;

    public y31(b41 b41Var, int i10) {
        this.f43706a = i10;
        this.f43707b = b41Var;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        b41 b41Var = this.f43707b;
        b41Var.e = defaultWindowInsets;
        b41Var.f35860c.setPadding(defaultWindowInsets.f12315a, defaultWindowInsets.f12316b, defaultWindowInsets.f12317c, defaultWindowInsets.d);
        b41Var.f35858b.requestLayout();
        return r0.k1.f45250b;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f43706a) {
            case 1:
                org.telegram.ui.ActionBar.c2 c2Var2 = this.f43707b.f35861c0;
                if (c2Var2 != null) {
                    c2Var2.dismiss();
                    return;
                }
                return;
            default:
                b41 b41Var = this.f43707b;
                org.telegram.ui.ActionBar.c2 c2Var3 = b41Var.f35861c0;
                if (c2Var3 != null) {
                    c2Var3.dismiss();
                    b41Var.f35861c0 = null;
                }
                b41Var.dismiss();
                return;
        }
    }
}
