package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class u50 extends org.telegram.ui.Cells.e4 {
    public final x50 f41790c0;

    public u50(x50 x50Var, Context context) {
        super(context);
        this.f41790c0 = x50Var;
    }

    @Override
    public final void d(org.telegram.ui.Cells.e4 e4Var) {
        d60 d60Var = this.f41790c0.J;
        d60 d60Var2 = d60.A3;
        d60Var.F1(e4Var);
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
