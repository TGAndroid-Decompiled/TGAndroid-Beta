package org.telegram.ui;

import android.content.Context;
public final class yl extends org.telegram.ui.Cells.a0 {
    public final fm f46081f;

    public yl(fm fmVar, Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, i10, u6Var);
        this.f46081f = fmVar;
    }

    @Override
    public final int getSideMenuWidth() {
        un unVar = this.f46081f.Q;
        int i10 = un.f44171bd;
        return unVar.b9();
    }
}
