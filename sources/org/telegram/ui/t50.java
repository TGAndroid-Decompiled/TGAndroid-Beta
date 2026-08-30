package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class t50 extends org.telegram.ui.Cells.e4 {
    public final w50 f38555c0;

    public t50(w50 w50Var, Context context) {
        super(context);
        this.f38555c0 = w50Var;
    }

    @Override
    public final void d(org.telegram.ui.Cells.e4 e4Var) {
        c60 c60Var = this.f38555c0.J;
        c60 c60Var2 = c60.A3;
        c60Var.F1(e4Var);
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
