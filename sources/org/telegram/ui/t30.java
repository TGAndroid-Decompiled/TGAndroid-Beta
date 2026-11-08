package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class t30 extends org.telegram.ui.Cells.f4 {
    public final w30 f49903g0;

    public t30(w30 w30Var, Context context) {
        super(context);
        this.f49903g0 = w30Var;
    }

    @Override
    public final void d(org.telegram.ui.Cells.f4 f4Var) {
        c40 c40Var = this.f49903g0.M;
        c40 c40Var2 = c40.f44542u5;
        c40Var.L1(f4Var);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        if (org.telegram.messenger.g0.Q1()) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(420.0f), View.MeasureSpec.getSize(i7)), 1073741824), i10);
        } else {
            super.onMeasure(i7, i10);
        }
    }
}
