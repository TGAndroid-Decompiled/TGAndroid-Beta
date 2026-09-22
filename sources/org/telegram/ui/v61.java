package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.LiteMode;
public final class v61 extends org.telegram.ui.Components.ww0 {
    public final w61 f38385z3;

    public v61(w61 w61Var, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i10, e6Var);
        this.f38385z3 = w61Var;
    }

    @Override
    public final boolean A1() {
        if (!LiteMode.isEnabled(16388) && this.f38385z3.f38711y.W != 4) {
            return false;
        }
        return true;
    }

    @Override
    public final void E1(int i10) {
        super.E1(i10);
        this.f38385z3.d(false);
    }
}
