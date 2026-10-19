package org.telegram.ui;

import android.content.Context;
public final class vl extends org.telegram.ui.Cells.h0 {
    public final dm L;

    public vl(dm dmVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, d6Var);
        this.L = dmVar;
    }

    @Override
    public final int getSideMenuWidth() {
        qn qnVar = this.L.Q;
        int i10 = qn.Ic;
        return qnVar.W8();
    }
}
