package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class v61 extends rg.c1 {
    public final w61 M;

    public v61(w61 w61Var, Context context) {
        super(context, 2, null);
        this.M = w61Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        w61 w61Var = this.M;
        if (w61Var.getParent() instanceof View) {
            ((View) w61Var.getParent()).invalidate();
        }
    }
}
