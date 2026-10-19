package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class u31 implements r0.n, org.telegram.ui.ActionBar.a2 {
    public final int f41809a;
    public final x31 f41810b;

    public u31(x31 x31Var, int i10) {
        this.f41809a = i10;
        this.f41810b = x31Var;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        x31 x31Var = this.f41810b;
        x31Var.e = defaultWindowInsets;
        x31Var.f43019c.setPadding(defaultWindowInsets.f12285a, defaultWindowInsets.f12286b, defaultWindowInsets.f12287c, defaultWindowInsets.d);
        x31Var.f43017b.requestLayout();
        return r0.k1.f44824b;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f41809a) {
            case 1:
                org.telegram.ui.ActionBar.b2 b2Var2 = this.f41810b.f43020c0;
                if (b2Var2 != null) {
                    b2Var2.dismiss();
                    return;
                }
                return;
            default:
                x31 x31Var = this.f41810b;
                org.telegram.ui.ActionBar.b2 b2Var3 = x31Var.f43020c0;
                if (b2Var3 != null) {
                    b2Var3.dismiss();
                    x31Var.f43020c0 = null;
                }
                x31Var.dismiss();
                return;
        }
    }
}
