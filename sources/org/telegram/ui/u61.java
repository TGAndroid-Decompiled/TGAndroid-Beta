package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.LiteMode;
public final class u61 extends org.telegram.ui.Components.ix0 {
    public final v61 f37892z3;

    public u61(v61 v61Var, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i10, e6Var);
        this.f37892z3 = v61Var;
    }

    @Override
    public final boolean B1() {
        if (!LiteMode.isEnabled(16388) && this.f37892z3.f38322y.W != 4) {
            return false;
        }
        return true;
    }

    @Override
    public final void F1(int i10) {
        super.F1(i10);
        this.f37892z3.d(false);
    }
}
