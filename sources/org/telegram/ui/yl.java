package org.telegram.ui;

import android.content.Context;
public final class yl extends org.telegram.ui.Cells.a0 {
    public final fm f46078f;

    public yl(fm fmVar, Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, i10, u6Var);
        this.f46078f = fmVar;
    }

    @Override
    public final int getSideMenuWidth() {
        un unVar = this.f46078f.Q;
        int i10 = un.f44168bd;
        return unVar.b9();
    }
}
