package tg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
public final class y0 extends xg.i {
    public final z0 J;

    public y0(z0 z0Var, Context context, f6 f6Var) {
        super(context, f6Var);
        this.J = z0Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(78.0f) + getMeasuredHeight();
        z0 z0Var = this.J;
        z0Var.f43561p0 = dp;
        z0Var.f43560o0.G();
    }
}
