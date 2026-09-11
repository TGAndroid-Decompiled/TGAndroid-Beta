package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class xq0 extends org.telegram.ui.Components.t00 {
    public final int U;

    public xq0(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.U = i10;
    }

    @Override
    public int getColumnsCount() {
        switch (this.U) {
            case 0:
                return 3;
            default:
                return super.getColumnsCount();
        }
    }

    @Override
    public int getViewType() {
        switch (this.U) {
            case 0:
                return 2;
            default:
                return super.getViewType();
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.U) {
            case 1:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(104.0f));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }
}
