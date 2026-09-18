package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.LiteMode;
public final class w61 extends org.telegram.ui.Components.xw0 {
    public final x61 f38581z3;

    public w61(x61 x61Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, f6Var);
        this.f38581z3 = x61Var;
    }

    @Override
    public final boolean B1() {
        if (!LiteMode.isEnabled(16388) && this.f38581z3.f39404y.W != 4) {
            return false;
        }
        return true;
    }

    @Override
    public final void F1(int i10) {
        super.F1(i10);
        this.f38581z3.d(false);
    }
}
