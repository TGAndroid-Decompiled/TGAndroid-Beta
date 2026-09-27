package org.telegram.ui;

import android.app.Activity;
public final class ti extends org.telegram.ui.Cells.w0 {
    public final xn f37827l2;

    public ti(Activity activity, org.telegram.ui.ActionBar.e6 e6Var, xn xnVar) {
        super(activity, e6Var, false);
        this.f37827l2 = xnVar;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y3 = getY();
        xn xnVar = this.f37827l2;
        W(xnVar.R0.getY() + y3, xnVar.X0.getBackgroundSizeY());
    }
}
