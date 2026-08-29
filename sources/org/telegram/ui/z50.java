package org.telegram.ui;

import android.app.Activity;
public final class z50 extends cg.v0 {
    public final a60 S0;

    public z50(a60 a60Var, a60 a60Var2, Activity activity, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        super(i10, i11, activity, a60Var2, c6Var);
        this.S0 = a60Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.S0.f36442x0 = false;
    }

    @Override
    public final void onOpenAnimationEnd() {
        this.S0.f36442x0 = false;
    }
}
