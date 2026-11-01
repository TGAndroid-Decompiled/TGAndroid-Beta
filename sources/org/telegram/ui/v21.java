package org.telegram.ui;

import android.content.Context;
public final class v21 extends org.telegram.ui.Components.cw0 {
    public final y11 G3;

    public v21(y11 y11Var, Context context, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(i10, context, p6Var);
        this.G3 = y11Var;
    }

    @Override
    public final boolean D1() {
        if (!org.telegram.messenger.tc.e(16388) && this.G3.F.W != 4) {
            return false;
        }
        return true;
    }

    @Override
    public final void H1(int i10) {
        super.H1(i10);
        this.G3.d(false);
    }
}
