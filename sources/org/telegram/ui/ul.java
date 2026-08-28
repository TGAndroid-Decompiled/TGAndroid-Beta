package org.telegram.ui;

import android.content.Context;
public final class ul extends org.telegram.ui.Cells.h0 {
    public final bm H;

    public ul(bm bmVar, Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, i9, b6Var);
        this.H = bmVar;
    }

    @Override
    public final int getSideMenuWidth() {
        qn qnVar = this.H.M;
        int i9 = qn.Dc;
        return qnVar.R8();
    }
}
