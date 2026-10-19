package org.telegram.ui;

import android.app.Activity;
public final class y50 extends sg.k0 {
    public final z50 W0;

    public y50(z50 z50Var, z50 z50Var2, Activity activity, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        super(i10, i11, activity, z50Var2, d6Var);
        this.W0 = z50Var;
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
