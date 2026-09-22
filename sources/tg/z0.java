package tg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;
public final class z0 extends xg.i {
    public final a1 J;

    public z0(a1 a1Var, Context context, e6 e6Var) {
        super(context, e6Var);
        this.J = a1Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(78.0f) + getMeasuredHeight();
        a1 a1Var = this.J;
        a1Var.f43074p0 = dp;
        a1Var.f43073o0.G();
    }
}
