package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class r21 extends kg.l1 {
    public final s21 M;

    public r21(s21 s21Var, Context context) {
        super(2, context, null);
        this.M = s21Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        s21 s21Var = this.M;
        if (s21Var.getParent() instanceof View) {
            ((View) s21Var.getParent()).invalidate();
        }
    }
}
