package org.telegram.ui;

import android.content.Context;
import android.view.View;
public final class r40 extends org.telegram.ui.Cells.h4 {
    public final u40 f40968g0;

    public r40(u40 u40Var, Context context) {
        super(context);
        this.f40968g0 = u40Var;
    }

    @Override
    public final void d(org.telegram.ui.Cells.h4 h4Var) {
        a50 a50Var = this.f40968g0.M;
        a50 a50Var2 = a50.f35573u5;
        a50Var.I1(h4Var);
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
