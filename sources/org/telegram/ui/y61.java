package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.LiteMode;
public final class y61 extends org.telegram.ui.Components.zx0 {
    public final z61 f44312x3;

    public y61(z61 z61Var, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i10, e6Var);
        this.f44312x3 = z61Var;
    }

    @Override
    public final boolean B1() {
        if (!LiteMode.isEnabled(16388) && this.f44312x3.f44546y.W != 4) {
            return false;
        }
        return true;
    }

    @Override
    public final void F1(int i10) {
        super.F1(i10);
        this.f44312x3.d(false);
    }
}
