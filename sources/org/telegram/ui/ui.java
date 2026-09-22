package org.telegram.ui;

import android.app.Activity;
public final class ui extends org.telegram.ui.Cells.w0 {
    public final zn f38097l2;

    public ui(Activity activity, org.telegram.ui.ActionBar.f6 f6Var, zn znVar) {
        super(activity, f6Var, false);
        this.f38097l2 = znVar;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y3 = getY();
        zn znVar = this.f38097l2;
        W(znVar.R0.getY() + y3, znVar.X0.getBackgroundSizeY());
    }
}
