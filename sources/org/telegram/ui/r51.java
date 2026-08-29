package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.LiteMode;
public final class r51 extends org.telegram.ui.Components.ow0 {
    public final s51 f41977v3;

    public r51(s51 s51Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, c6Var);
        this.f41977v3 = s51Var;
    }

    @Override
    public final boolean A1() {
        if (!LiteMode.isEnabled(16388) && this.f41977v3.f42281y.S != 4) {
            return false;
        }
        return true;
    }

    @Override
    public final void E1(int i10) {
        super.E1(i10);
        this.f41977v3.d(false);
    }
}
