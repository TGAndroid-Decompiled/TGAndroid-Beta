package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class z01 extends ug.b1 {
    public final a11 N;

    public z01(a11 a11Var, Context context) {
        super(2, context, null);
        this.N = a11Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        a11 a11Var = this.N;
        if (a11Var.getParent() instanceof View) {
            ((View) a11Var.getParent()).invalidate();
        }
    }
}
