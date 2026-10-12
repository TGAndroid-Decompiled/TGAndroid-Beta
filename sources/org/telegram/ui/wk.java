package org.telegram.ui;

import android.content.Context;
public final class wk extends kh.e {
    public final fo L;

    public wk(fo foVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, oj ojVar, bh.b bVar) {
        super(context, bVar, ojVar, c6Var);
        this.L = foVar;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        super.setVisibility(i10);
        j6.l lVar = this.L.Bc;
        boolean z11 = false;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (getMeasuredWidth() > 0) {
            z11 = true;
        }
        lVar.i(3, z10, z11);
    }
}
