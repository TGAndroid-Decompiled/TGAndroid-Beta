package org.telegram.ui;

import android.content.Context;
public final class zl extends org.telegram.ui.Cells.g0 {
    public final hm L;

    public zl(hm hmVar, Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, i10, u6Var);
        this.L = hmVar;
    }

    @Override
    public final int getSideMenuWidth() {
        wn wnVar = this.L.Q;
        int i10 = wn.f45035fd;
        return wnVar.e9();
    }
}
