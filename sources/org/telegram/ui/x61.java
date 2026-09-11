package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.LiteMode;
public final class x61 extends org.telegram.ui.Components.vw0 {
    public final y61 f42599z3;

    public x61(y61 y61Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, f6Var);
        this.f42599z3 = y61Var;
    }

    @Override
    public final void D1(int i10) {
        super.D1(i10);
        this.f42599z3.e(false);
    }

    @Override
    public final boolean z1() {
        if (!LiteMode.isEnabled(16388) && this.f42599z3.f43010y.W != 4) {
            return false;
        }
        return true;
    }
}
