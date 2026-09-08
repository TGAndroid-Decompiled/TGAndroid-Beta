package org.telegram.ui;

import android.app.Activity;
public final class ui extends org.telegram.ui.Cells.w0 {
    public final co f41128k2;

    public ui(Activity activity, org.telegram.ui.ActionBar.f6 f6Var, co coVar) {
        super(activity, f6Var, false);
        this.f41128k2 = coVar;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y3 = getY();
        co coVar = this.f41128k2;
        W(coVar.R0.getY() + y3, coVar.X0.getBackgroundSizeY());
    }
}
