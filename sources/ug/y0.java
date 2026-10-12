package ug;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
public final class y0 extends yg.i {
    public final z0 J;

    public y0(z0 z0Var, Context context, c6 c6Var) {
        super(context, c6Var);
        this.J = z0Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(78.0f) + getMeasuredHeight();
        z0 z0Var = this.J;
        z0Var.f46428p0 = dp;
        z0Var.f46427o0.G();
    }
}
