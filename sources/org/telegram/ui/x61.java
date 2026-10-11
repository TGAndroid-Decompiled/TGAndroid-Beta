package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.LiteMode;
public final class x61 extends org.telegram.ui.Components.ay0 {
    public final y61 f43994x3;

    public x61(y61 y61Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, d6Var);
        this.f43994x3 = y61Var;
    }

    @Override
    public final boolean B1() {
        if (!LiteMode.isEnabled(16388) && this.f43994x3.f44272y.W != 4) {
            return false;
        }
        return true;
    }

    @Override
    public final void F1(int i10) {
        super.F1(i10);
        this.f43994x3.d(false);
    }
}
