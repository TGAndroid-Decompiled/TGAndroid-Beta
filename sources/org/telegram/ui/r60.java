package org.telegram.ui;

import android.app.Activity;
public final class r60 extends qg.k0 {
    public final s60 W0;

    public r60(s60 s60Var, s60 s60Var2, Activity activity, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i10, i11, activity, s60Var2, f6Var);
        this.W0 = s60Var;
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
