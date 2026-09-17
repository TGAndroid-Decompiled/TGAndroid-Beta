package org.telegram.ui;

import android.app.Activity;
public final class t60 extends rg.j0 {
    public final u60 W0;

    public t60(u60 u60Var, u60 u60Var2, Activity activity, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i10, i11, activity, u60Var2, f6Var);
        this.W0 = u60Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.W0.B0 = false;
    }

    @Override
    public final void onOpenAnimationEnd() {
        this.W0.B0 = false;
    }
}
