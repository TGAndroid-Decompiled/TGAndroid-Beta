package org.telegram.ui;

import android.app.Activity;
public final class wi extends org.telegram.ui.Cells.w0 {
    public final eo f38207k2;

    public wi(Activity activity, org.telegram.ui.ActionBar.f6 f6Var, eo eoVar) {
        super(activity, f6Var, false);
        this.f38207k2 = eoVar;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y3 = getY();
        eo eoVar = this.f38207k2;
        W(eoVar.R0.getY() + y3, eoVar.X0.getBackgroundSizeY());
    }
}
