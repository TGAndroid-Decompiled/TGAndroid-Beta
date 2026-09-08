package ug;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
public final class z0 extends yg.i {
    public final a1 J;

    public z0(a1 a1Var, Context context, f6 f6Var) {
        super(context, f6Var);
        this.J = a1Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(78.0f) + getMeasuredHeight();
        a1 a1Var = this.J;
        a1Var.f47085p0 = dp;
        a1Var.f47084o0.G();
    }
}
