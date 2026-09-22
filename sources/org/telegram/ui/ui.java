package org.telegram.ui;

import android.app.Activity;
public final class ui extends org.telegram.ui.Cells.w0 {
    public final bo f37978l2;

    public ui(Activity activity, org.telegram.ui.ActionBar.e6 e6Var, bo boVar) {
        super(activity, e6Var, false);
        this.f37978l2 = boVar;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float y3 = getY();
        bo boVar = this.f37978l2;
        W(boVar.R0.getY() + y3, boVar.X0.getBackgroundSizeY());
    }
}
