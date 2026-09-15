package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.LiteMode;
public final class u61 extends org.telegram.ui.Components.ww0 {
    public final v61 f37869z3;

    public u61(v61 v61Var, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i10, e6Var);
        this.f37869z3 = v61Var;
    }

    @Override
    public final boolean A1() {
        if (!LiteMode.isEnabled(16388) && this.f37869z3.f38381y.W != 4) {
            return false;
        }
        return true;
    }

    @Override
    public final void E1(int i10) {
        super.E1(i10);
        this.f37869z3.d(false);
    }
}
