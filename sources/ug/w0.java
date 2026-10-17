package ug;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
public final class w0 extends yg.h {
    public final x0 J;

    public w0(x0 x0Var, Context context, d6 d6Var) {
        super(context, d6Var);
        this.J = x0Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(78.0f) + getMeasuredHeight();
        x0 x0Var = this.J;
        x0Var.f47808p0 = dp;
        x0Var.f47807o0.G();
    }
}
