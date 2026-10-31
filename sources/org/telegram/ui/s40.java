package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class s40 extends org.telegram.ui.Cells.h4 {
    public final v40 f41371g0;

    public s40(v40 v40Var, Context context) {
        super(context);
        this.f41371g0 = v40Var;
    }

    @Override
    public final void d(org.telegram.ui.Cells.h4 h4Var) {
        b50 b50Var = this.f41371g0.M;
        b50 b50Var2 = b50.f35989u5;
        b50Var.I1(h4Var);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (org.telegram.messenger.i0.Q1()) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.i0.L(420.0f), View.MeasureSpec.getSize(i10)), 1073741824), i11);
        } else {
            super.onMeasure(i10, i11);
        }
    }
}
