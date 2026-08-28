package org.telegram.ui;

import android.app.Activity;
public final class x50 extends zf.j0 {
    public final y50 S0;

    public x50(y50 y50Var, y50 y50Var2, Activity activity, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        super(i9, i10, activity, y50Var2, b6Var);
        this.S0 = y50Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.S0.f44729x0 = false;
    }

    @Override
    public final void onOpenAnimationEnd() {
        this.S0.f44729x0 = false;
    }
}
