package org.telegram.ui;

import android.content.Context;
public final class vl extends org.telegram.ui.Cells.b0 {
    public final bm f43510f;

    public vl(bm bmVar, Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, i9, b6Var);
        this.f43510f = bmVar;
    }

    @Override
    public final int getSideMenuWidth() {
        qn qnVar = this.f43510f.M;
        int i9 = qn.Dc;
        return qnVar.R8();
    }
}
