package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class z61 extends sg.c1 {
    public final a71 M;

    public z61(a71 a71Var, Context context) {
        super(context, 2, null);
        this.M = a71Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        a71 a71Var = this.M;
        if (a71Var.getParent() instanceof View) {
            ((View) a71Var.getParent()).invalidate();
        }
    }
}
