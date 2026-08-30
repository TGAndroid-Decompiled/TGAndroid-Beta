package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class x51 extends eg.s1 {
    public final y51 J;

    public x51(y51 y51Var, Context context) {
        super(context, 2, null);
        this.J = y51Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        y51 y51Var = this.J;
        if (y51Var.getParent() instanceof View) {
            ((View) y51Var.getParent()).invalidate();
        }
    }
}
