package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.LiteMode;
public final class z61 extends org.telegram.ui.Components.hx0 {
    public final a71 f39217z3;

    public z61(a71 a71Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, f6Var);
        this.f39217z3 = a71Var;
    }

    @Override
    public final void D1(int i10) {
        super.D1(i10);
        this.f39217z3.d(false);
    }

    @Override
    public final boolean z1() {
        if (!LiteMode.isEnabled(16388) && this.f39217z3.f30821y.W != 4) {
            return false;
        }
        return true;
    }
}
