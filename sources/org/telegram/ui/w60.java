package org.telegram.ui;

import android.app.Activity;
public final class w60 extends sg.j0 {
    public final x60 W0;

    public w60(x60 x60Var, x60 x60Var2, Activity activity, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        super(i10, i11, activity, x60Var2, c6Var);
        this.W0 = x60Var;
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
