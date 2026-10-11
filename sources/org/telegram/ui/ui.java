package org.telegram.ui;

import android.app.Activity;
public final class ui extends org.telegram.ui.Cells.w0 {
    public final zn f42571t2;

    public ui(Activity activity, org.telegram.ui.ActionBar.d6 d6Var, zn znVar) {
        super(activity, d6Var, false);
        this.f42571t2 = znVar;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y3 = getY();
        zn znVar = this.f42571t2;
        a0(znVar.R0.getY() + y3, znVar.X0.getBackgroundSizeY());
    }
}
