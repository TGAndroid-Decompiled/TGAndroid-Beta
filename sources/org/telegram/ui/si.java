package org.telegram.ui;

import android.app.Activity;
public final class si extends org.telegram.ui.Cells.v0 {
    public final zn f38232h2;

    public si(Activity activity, org.telegram.ui.ActionBar.f6 f6Var, zn znVar) {
        super(activity, f6Var, false);
        this.f38232h2 = znVar;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        float y10 = getY();
        zn znVar = this.f38232h2;
        W(znVar.O0.getY() + y10, znVar.U0.getBackgroundSizeY());
    }
}
