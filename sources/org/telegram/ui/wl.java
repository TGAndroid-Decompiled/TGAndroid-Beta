package org.telegram.ui;

import android.content.Context;
public final class wl extends org.telegram.ui.Cells.g0 {
    public final em L;

    public wl(em emVar, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, i10, g6Var);
        this.L = emVar;
    }

    @Override
    public final int getSideMenuWidth() {
        sn snVar = this.L.Q;
        int i10 = sn.Vc;
        return snVar.W8();
    }
}
