package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class y41 implements r0.n, org.telegram.ui.ActionBar.z1 {
    public final int f40054a;
    public final b51 f40055b;

    public y41(b51 b51Var, int i10) {
        this.f40054a = i10;
        this.f40055b = b51Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        b51 b51Var = this.f40055b;
        b51Var.e = defaultWindowInsets;
        b51Var.f32326c.setPadding(defaultWindowInsets.f10576a, defaultWindowInsets.f10577b, defaultWindowInsets.f10578c, defaultWindowInsets.d);
        b51Var.f32324b.requestLayout();
        return r0.l1.f42140b;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f40054a) {
            case 1:
                org.telegram.ui.ActionBar.a2 a2Var2 = this.f40055b.f32327c0;
                if (a2Var2 != null) {
                    a2Var2.dismiss();
                    return;
                }
                return;
            default:
                b51 b51Var = this.f40055b;
                org.telegram.ui.ActionBar.a2 a2Var3 = b51Var.f32327c0;
                if (a2Var3 != null) {
                    a2Var3.dismiss();
                    b51Var.f32327c0 = null;
                }
                b51Var.dismiss();
                return;
        }
    }
}
