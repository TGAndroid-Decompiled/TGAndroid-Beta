package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class t61 extends qg.e1 {
    public final u61 M;

    public t61(u61 u61Var, Context context) {
        super(context, 2, null);
        this.M = u61Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        u61 u61Var = this.M;
        if (u61Var.getParent() instanceof View) {
            ((View) u61Var.getParent()).invalidate();
        }
    }
}
