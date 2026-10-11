package tg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
public final class x0 extends xg.i {
    public final y0 J;

    public x0(y0 y0Var, Context context, d6 d6Var) {
        super(context, d6Var);
        this.J = y0Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(78.0f) + getMeasuredHeight();
        y0 y0Var = this.J;
        y0Var.f48546p0 = dp;
        y0Var.f48545o0.G();
    }
}
