package org.telegram.ui;

import android.app.Activity;
public final class yi extends org.telegram.ui.Cells.x0 {
    public final fo f42170t2;

    public yi(Activity activity, org.telegram.ui.ActionBar.c6 c6Var, fo foVar) {
        super(activity, c6Var, false);
        this.f42170t2 = foVar;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y3 = getY();
        fo foVar = this.f42170t2;
        a0(foVar.R0.getY() + y3, foVar.X0.getBackgroundSizeY());
    }
}
