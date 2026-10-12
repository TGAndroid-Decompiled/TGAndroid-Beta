package org.telegram.ui;

import android.app.Activity;
public final class yi extends org.telegram.ui.Cells.w0 {
    public final eo f44484t2;

    public yi(Activity activity, org.telegram.ui.ActionBar.c6 c6Var, eo eoVar) {
        super(activity, c6Var, false);
        this.f44484t2 = eoVar;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y3 = getY();
        eo eoVar = this.f44484t2;
        a0(eoVar.R0.getY() + y3, eoVar.X0.getBackgroundSizeY());
    }
}
