package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class s61 extends rg.c1 {
    public final t61 M;

    public s61(t61 t61Var, Context context) {
        super(context, 2, null);
        this.M = t61Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        t61 t61Var = this.M;
        if (t61Var.getParent() instanceof View) {
            ((View) t61Var.getParent()).invalidate();
        }
    }
}
