package org.telegram.ui;

import android.content.Context;

public final class wl extends org.telegram.ui.Cells.b0 {

    public final dm f44141f;

    public wl(dm dmVar, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, c6Var);
        this.f44141f = dmVar;
    }

    @Override
    public final int getSideMenuWidth() {
        rn rnVar = this.f44141f.M;
        int i10 = rn.Dc;
        return rnVar.R8();
    }
}
