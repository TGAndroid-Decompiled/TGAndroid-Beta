package org.telegram.ui;

import android.content.Context;
public final class v01 extends org.telegram.ui.Components.xu0 {
    public final yz0 H3;

    public v01(yz0 yz0Var, Context context, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i3, context, e6Var);
        this.H3 = yz0Var;
    }

    @Override
    public final boolean D1() {
        if (!org.telegram.messenger.lc.e(16388) && this.H3.G.f45435a0 != 4) {
            return false;
        }
        return true;
    }

    @Override
    public final void H1(int i3) {
        super.H1(i3);
        this.H3.d(false);
    }
}
