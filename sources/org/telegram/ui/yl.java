package org.telegram.ui;

import android.content.Context;
public final class yl extends org.telegram.ui.Cells.b0 {
    public final fm f43409f;

    public yl(fm fmVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, d6Var);
        this.f43409f = fmVar;
    }

    @Override
    public final int getSideMenuWidth() {
        sn snVar = this.f43409f.Q;
        int i10 = sn.Ic;
        return snVar.W8();
    }
}
