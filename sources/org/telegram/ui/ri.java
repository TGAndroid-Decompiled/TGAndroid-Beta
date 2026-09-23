package org.telegram.ui;

import android.app.Activity;
public final class ri extends org.telegram.ui.Cells.w0 {
    public final xn f36857l2;

    public ri(Activity activity, org.telegram.ui.ActionBar.d6 d6Var, xn xnVar) {
        super(activity, d6Var, false);
        this.f36857l2 = xnVar;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y3 = getY();
        xn xnVar = this.f36857l2;
        W(xnVar.R0.getY() + y3, xnVar.X0.getBackgroundSizeY());
    }
}
