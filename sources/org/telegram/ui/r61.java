package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class r61 extends sg.e1 {
    public final s61 M;

    public r61(s61 s61Var, Context context) {
        super(context, 2, null);
        this.M = s61Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        s61 s61Var = this.M;
        if (s61Var.getParent() instanceof View) {
            ((View) s61Var.getParent()).invalidate();
        }
    }
}
