package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class w50 extends org.telegram.ui.Cells.e4 {
    public final z50 f38544f0;

    public w50(z50 z50Var, Context context) {
        super(context);
        this.f38544f0 = z50Var;
    }

    @Override
    public final void d(org.telegram.ui.Cells.e4 e4Var) {
        f60 f60Var = this.f38544f0.M;
        f60 f60Var2 = f60.D3;
        f60Var.F1(e4Var);
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
