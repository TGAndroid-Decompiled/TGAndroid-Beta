package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class z50 extends org.telegram.ui.Cells.f4 {
    public final c60 f40121f0;

    public z50(c60 c60Var, Context context) {
        super(context);
        this.f40121f0 = c60Var;
    }

    @Override
    public final void d(org.telegram.ui.Cells.f4 f4Var) {
        i60 i60Var = this.f40121f0.M;
        i60 i60Var2 = i60.D3;
        i60Var.F1(f4Var);
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
