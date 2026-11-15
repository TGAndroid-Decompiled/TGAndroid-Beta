package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class w01 extends ug.a1 {
    public final x01 N;

    public w01(x01 x01Var, Context context) {
        super(2, context, null);
        this.N = x01Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        x01 x01Var = this.N;
        if (x01Var.getParent() instanceof View) {
            ((View) x01Var.getParent()).invalidate();
        }
    }
}
