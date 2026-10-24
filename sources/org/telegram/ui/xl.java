package org.telegram.ui;

import android.content.Context;
public final class xl extends org.telegram.ui.Cells.a0 {
    public final em f43635f;

    public xl(em emVar, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, i10, g6Var);
        this.f43635f = emVar;
    }

    @Override
    public final int getSideMenuWidth() {
        sn snVar = this.f43635f.Q;
        int i10 = sn.Vc;
        return snVar.W8();
    }
}
