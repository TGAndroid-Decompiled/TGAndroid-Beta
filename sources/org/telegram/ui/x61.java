package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.LiteMode;
public final class x61 extends org.telegram.ui.Components.hx0 {
    public final y61 f39358z3;

    public x61(y61 y61Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, f6Var);
        this.f39358z3 = y61Var;
    }

    @Override
    public final boolean B1() {
        if (!LiteMode.isEnabled(16388) && this.f39358z3.f39814y.W != 4) {
            return false;
        }
        return true;
    }

    @Override
    public final void F1(int i10) {
        super.F1(i10);
        this.f39358z3.d(false);
    }
}
