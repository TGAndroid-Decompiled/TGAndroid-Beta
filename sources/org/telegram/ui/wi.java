package org.telegram.ui;

import android.app.Activity;
public final class wi extends org.telegram.ui.Cells.s0 {
    public final un f43317t2;

    public wi(Activity activity, org.telegram.ui.ActionBar.p6 p6Var, un unVar) {
        super(activity, p6Var, false);
        this.f43317t2 = unVar;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y3 = getY();
        un unVar = this.f43317t2;
        g0(unVar.f42245f1.getY() + y3, unVar.l1.getBackgroundSizeY());
    }
}
