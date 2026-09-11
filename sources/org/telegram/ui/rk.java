package org.telegram.ui;

import android.content.Context;
public final class rk extends kh.e {
    public final co L;

    public rk(co coVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, jj jjVar, bh.b bVar) {
        super(context, bVar, jjVar, f6Var);
        this.L = coVar;
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
        lVar.j(3, z10, z11);
    }
}
