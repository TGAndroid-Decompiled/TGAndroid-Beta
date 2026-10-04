package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class y50 extends org.telegram.ui.Cells.e4 {
    public final b60 f43072f0;

    public y50(b60 b60Var, Context context) {
        super(context);
        this.f43072f0 = b60Var;
    }

    @Override
    public final void d(org.telegram.ui.Cells.e4 e4Var) {
        h60 h60Var = this.f43072f0.M;
        h60 h60Var2 = h60.D3;
        h60Var.F1(e4Var);
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
