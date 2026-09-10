package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class rs extends org.telegram.ui.Cells.s8 {
    public final int Q = 1;
    public final Object R;

    public rs(ts tsVar, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.R = tsVar;
    }

    @Override
    public int c(int i10) {
        switch (this.Q) {
            case 2:
                ((f11) this.R).e.getClass();
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
                ts tsVar = (ts) this.R;
                int measuredHeight2 = (measuredHeight - tsVar.U.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.w9 w9Var = tsVar.U;
                w9Var.layout(dp, measuredHeight2, w9Var.getMeasuredWidth() + dp, tsVar.U.getMeasuredHeight() + measuredHeight2);
                return;
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                int dp2 = AndroidUtilities.dp(21.0f);
                int measuredHeight3 = getMeasuredHeight();
                ay0 ay0Var = (ay0) this.R;
                int measuredHeight4 = (measuredHeight3 - ay0Var.d.f30329v0.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.w9 w9Var2 = ay0Var.d.f30329v0;
                w9Var2.layout(dp2, measuredHeight4, w9Var2.getMeasuredWidth() + dp2, ay0Var.d.f30329v0.getMeasuredHeight() + measuredHeight4);
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
                ts tsVar = (ts) this.R;
                tsVar.U.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
                tsVar.U.setRoundRadius(AndroidUtilities.dp(30.0f));
                return;
            case 1:
                super.onMeasure(i10, i11);
                ay0 ay0Var = (ay0) this.R;
                ay0Var.d.f30329v0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
                ay0Var.d.f30329v0.setRoundRadius(AndroidUtilities.dp(30.0f));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public rs(ay0 ay0Var, Activity activity) {
        super(activity);
        this.R = ay0Var;
    }

    public rs(f11 f11Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(18, context, f6Var, false, false);
        this.R = f11Var;
    }
}
