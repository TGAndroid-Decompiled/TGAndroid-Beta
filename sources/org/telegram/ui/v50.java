package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class v50 extends org.telegram.ui.Cells.d4 {
    public final y50 f39006c0;

    public v50(y50 y50Var, Context context) {
        super(context);
        this.f39006c0 = y50Var;
    }

    @Override
    public final void d(org.telegram.ui.Cells.d4 d4Var) {
        e60 e60Var = this.f39006c0.J;
        e60 e60Var2 = e60.A3;
        e60Var.F1(d4Var);
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
