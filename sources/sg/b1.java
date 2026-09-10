package sg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
public final class b1 extends wg.h {
    public final c1 J;

    public b1(c1 c1Var, Context context, f6 f6Var) {
        super(context, f6Var);
        this.J = c1Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(78.0f) + getMeasuredHeight();
        c1 c1Var = this.J;
        c1Var.f41893p0 = dp;
        c1Var.f41892o0.G();
    }
}
