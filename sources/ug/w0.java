package ug;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
public final class w0 extends yg.h {
    public final x0 K;

    public w0(x0 x0Var, Context context, g6 g6Var) {
        super(context, g6Var);
        this.K = x0Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(78.0f) + getMeasuredHeight();
        x0 x0Var = this.K;
        x0Var.f48232p0 = dp;
        x0Var.f48231o0.G();
    }
}
