package org.telegram.ui;

import android.app.Activity;
public final class si extends org.telegram.ui.Cells.w0 {
    public final yn f40506l2;

    public si(Activity activity, org.telegram.ui.ActionBar.d6 d6Var, yn ynVar) {
        super(activity, d6Var, false);
        this.f40506l2 = ynVar;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y3 = getY();
        yn ynVar = this.f40506l2;
        U(ynVar.P0.getY() + y3, ynVar.V0.getBackgroundSizeY());
    }
}
