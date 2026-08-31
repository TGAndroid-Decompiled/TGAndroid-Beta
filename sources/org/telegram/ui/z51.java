package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class z51 extends fg.r1 {
    public final a61 J;

    public z51(a61 a61Var, Context context) {
        super(context, 2, null);
        this.J = a61Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        a61 a61Var = this.J;
        if (a61Var.getParent() instanceof View) {
            ((View) a61Var.getParent()).invalidate();
        }
    }
}
