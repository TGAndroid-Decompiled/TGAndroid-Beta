package org.telegram.ui;

import android.content.Context;
public final class wl extends org.telegram.ui.Cells.b0 {
    public final dm f42887f;

    public wl(dm dmVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, d6Var);
        this.f42887f = dmVar;
    }

    @Override
    public final int getSideMenuWidth() {
        qn qnVar = this.f42887f.Q;
        int i10 = qn.Ic;
        return qnVar.W8();
    }
}
