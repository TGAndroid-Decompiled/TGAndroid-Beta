package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class x50 extends org.telegram.ui.Cells.e4 {
    public final a60 f39537f0;

    public x50(a60 a60Var, Context context) {
        super(context);
        this.f39537f0 = a60Var;
    }

    @Override
    public final void d(org.telegram.ui.Cells.e4 e4Var) {
        g60 g60Var = this.f39537f0.M;
        g60 g60Var2 = g60.D3;
        g60Var.F1(e4Var);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (AndroidUtilities.isTablet()) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(420.0f), View.MeasureSpec.getSize(i10)), 1073741824), i11);
        } else {
            super.onMeasure(i10, i11);
        }
    }
}
