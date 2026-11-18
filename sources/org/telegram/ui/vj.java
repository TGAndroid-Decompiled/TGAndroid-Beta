package org.telegram.ui;

import android.content.Context;
public final class vj extends lh.e {
    public final bn M;

    public vj(bn bnVar, Context context, org.telegram.ui.ActionBar.i6 i6Var, pi piVar, dh.c cVar) {
        super(context, cVar, piVar, i6Var);
        this.M = bnVar;
    }

    @Override
    public final void setVisibility(int i7) {
        boolean z10;
        super.setVisibility(i7);
        m6.n nVar = this.M.f46066jd;
        boolean z11 = false;
        if (i7 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (getMeasuredWidth() > 0) {
            z11 = true;
        }
        nVar.h(3, z10, z11);
    }
}
