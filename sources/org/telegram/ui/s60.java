package org.telegram.ui;

import android.app.Activity;
public final class s60 extends sg.k0 {
    public final t60 W0;

    public s60(t60 t60Var, t60 t60Var2, Activity activity, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i10, i11, activity, t60Var2, f6Var);
        this.W0 = t60Var;
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
