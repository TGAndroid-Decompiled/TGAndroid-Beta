package vg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.u6;
public final class y0 extends zg.i {
    public final z0 K;

    public y0(z0 z0Var, Context context, u6 u6Var) {
        super(context, u6Var);
        this.K = z0Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(78.0f) + getMeasuredHeight();
        z0 z0Var = this.K;
        z0Var.f50330p0 = dp;
        z0Var.f50329o0.G();
    }
}
