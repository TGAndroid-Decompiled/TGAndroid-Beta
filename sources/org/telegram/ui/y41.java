package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class y41 implements r0.n, org.telegram.ui.ActionBar.z1 {
    public final int f40159a;
    public final b51 f40160b;

    public y41(b51 b51Var, int i10) {
        this.f40159a = i10;
        this.f40160b = b51Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        b51 b51Var = this.f40160b;
        b51Var.e = defaultWindowInsets;
        b51Var.f32400c.setPadding(defaultWindowInsets.f10590a, defaultWindowInsets.f10591b, defaultWindowInsets.f10592c, defaultWindowInsets.d);
        b51Var.f32398b.requestLayout();
        return r0.l1.f42244b;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f40159a) {
            case 1:
                org.telegram.ui.ActionBar.a2 a2Var2 = this.f40160b.f32401c0;
                if (a2Var2 != null) {
                    a2Var2.dismiss();
                    return;
                }
                return;
            default:
                b51 b51Var = this.f40160b;
                org.telegram.ui.ActionBar.a2 a2Var3 = b51Var.f32401c0;
                if (a2Var3 != null) {
                    a2Var3.dismiss();
                    b51Var.f32401c0 = null;
                }
                b51Var.dismiss();
                return;
        }
    }
}
