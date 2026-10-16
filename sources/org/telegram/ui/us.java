package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class us extends org.telegram.ui.Cells.r8 {
    public final int R = 2;
    public final Object S;

    public us(ws wsVar, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.S = wsVar;
    }

    @Override
    public int c(int i10) {
        switch (this.R) {
            case 2:
                ((e11) this.S).e.getClass();
                return i10;
            default:
                return i10;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.R) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                int dp = AndroidUtilities.dp(21.0f);
                int measuredHeight = getMeasuredHeight();
                ws wsVar = (ws) this.S;
                int measuredHeight2 = (measuredHeight - wsVar.U.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.z9 z9Var = wsVar.U;
                z9Var.layout(dp, measuredHeight2, z9Var.getMeasuredWidth() + dp, wsVar.U.getMeasuredHeight() + measuredHeight2);
                return;
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                int dp2 = AndroidUtilities.dp(21.0f);
                int measuredHeight3 = getMeasuredHeight();
                ey0 ey0Var = (ey0) this.S;
                int measuredHeight4 = (measuredHeight3 - ey0Var.d.f32209v0.getMeasuredHeight()) / 2;
                org.telegram.ui.Components.z9 z9Var2 = ey0Var.d.f32209v0;
                z9Var2.layout(dp2, measuredHeight4, z9Var2.getMeasuredWidth() + dp2, ey0Var.d.f32209v0.getMeasuredHeight() + measuredHeight4);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.R) {
            case 0:
                super.onMeasure(i10, i11);
                ws wsVar = (ws) this.S;
                wsVar.U.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
                wsVar.U.setRoundRadius(AndroidUtilities.dp(30.0f));
                return;
            case 1:
                super.onMeasure(i10, i11);
                ey0 ey0Var = (ey0) this.S;
                ey0Var.d.f32209v0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
                ey0Var.d.f32209v0.setRoundRadius(AndroidUtilities.dp(30.0f));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public us(ey0 ey0Var, Activity activity) {
        super(activity);
        this.S = ey0Var;
    }

    public us(e11 e11Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(18, context, c6Var, false, false);
        this.S = e11Var;
    }
}
