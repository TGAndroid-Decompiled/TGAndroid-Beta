package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class w31 implements r0.n, org.telegram.ui.ActionBar.a2 {
    public final int f42339a;
    public final z31 f42340b;

    public w31(z31 z31Var, int i10) {
        this.f42339a = i10;
        this.f42340b = z31Var;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        z31 z31Var = this.f42340b;
        z31Var.e = defaultWindowInsets;
        z31Var.f43534c.setPadding(defaultWindowInsets.f12284a, defaultWindowInsets.f12285b, defaultWindowInsets.f12286c, defaultWindowInsets.d);
        z31Var.f43532b.requestLayout();
        return r0.k1.f44826b;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f42339a) {
            case 1:
                org.telegram.ui.ActionBar.b2 b2Var2 = this.f42340b.f43535c0;
                if (b2Var2 != null) {
                    b2Var2.dismiss();
                    return;
                }
                return;
            default:
                z31 z31Var = this.f42340b;
                org.telegram.ui.ActionBar.b2 b2Var3 = z31Var.f43535c0;
                if (b2Var3 != null) {
                    b2Var3.dismiss();
                    z31Var.f43535c0 = null;
                }
                z31Var.dismiss();
                return;
        }
    }
}
