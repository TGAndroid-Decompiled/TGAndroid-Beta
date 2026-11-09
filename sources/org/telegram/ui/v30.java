package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class v30 extends org.telegram.ui.Cells.f4 {
    public final y30 f50560g0;

    public v30(y30 y30Var, Context context) {
        super(context);
        this.f50560g0 = y30Var;
    }

    @Override
    public final void d(org.telegram.ui.Cells.f4 f4Var) {
        e40 e40Var = this.f50560g0.M;
        e40 e40Var2 = e40.f45182u5;
        e40Var.L1(f4Var);
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
