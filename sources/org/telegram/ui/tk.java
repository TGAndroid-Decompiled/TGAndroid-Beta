package org.telegram.ui;

import android.content.Context;
public final class tk extends ih.e {
    public final eo L;

    public tk(eo eoVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, lj ljVar, zg.a aVar) {
        super(context, ljVar, f6Var, aVar);
        this.L = eoVar;
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
