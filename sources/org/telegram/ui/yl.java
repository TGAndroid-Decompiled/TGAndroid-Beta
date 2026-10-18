package org.telegram.ui;

import android.content.Context;
public final class yl extends org.telegram.ui.Cells.b0 {
    public final fm f43445f;

    public yl(fm fmVar, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, d6Var);
        this.f43445f = fmVar;
    }

    @Override
    public final int getSideMenuWidth() {
        sn snVar = this.f43445f.Q;
        int i10 = sn.Hc;
        return snVar.W8();
    }
}
