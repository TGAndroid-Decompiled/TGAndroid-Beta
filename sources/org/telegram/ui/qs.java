package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class qs extends org.telegram.ui.Cells.r8 {
    public final int Q = 2;
    public final Object R;

    public qs(ss ssVar, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.R = ssVar;
    }

    @Override
    public int c(int i10) {
        switch (this.Q) {
            case 2:
                ((a11) this.R).f34318e.getClass();
                return i10;
            default:
                return i10;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.Q) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                int dp = AndroidUtilities.dp(21.0f);
                int measuredHeight = getMeasuredHeight();
                ss ssVar = (ss) this.R;
                int measuredHeight2 = (measuredHeight - ssVar.U.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.x9 x9Var = ssVar.U;
                x9Var.layout(dp, measuredHeight2, x9Var.getMeasuredWidth() + dp, ssVar.U.getMeasuredHeight() + measuredHeight2);
                return;
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                int dp2 = AndroidUtilities.dp(21.0f);
                int measuredHeight3 = getMeasuredHeight();
                zx0 zx0Var = (zx0) this.R;
                int measuredHeight4 = (measuredHeight3 - zx0Var.d.f33861v0.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.x9 x9Var2 = zx0Var.d.f33861v0;
                x9Var2.layout(dp2, measuredHeight4, x9Var2.getMeasuredWidth() + dp2, zx0Var.d.f33861v0.getMeasuredHeight() + measuredHeight4);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.Q) {
            case 0:
                super.onMeasure(i10, i11);
                ss ssVar = (ss) this.R;
                ssVar.U.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
                ssVar.U.setRoundRadius(AndroidUtilities.dp(30.0f));
                return;
            case 1:
                super.onMeasure(i10, i11);
                zx0 zx0Var = (zx0) this.R;
                zx0Var.d.f33861v0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
                zx0Var.d.f33861v0.setRoundRadius(AndroidUtilities.dp(30.0f));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public qs(zx0 zx0Var, Activity activity) {
        super(activity);
        this.R = zx0Var;
    }

    public qs(a11 a11Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(18, context, f6Var, false, false);
        this.R = a11Var;
    }
}
