package ug;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.im0;
public final class g1 extends yg.h {
    public boolean J;
    public final m1 K;

    public g1(m1 m1Var, Context context, d6 d6Var) {
        super(context, d6Var);
        this.K = m1Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        m1 m1Var = this.K;
        m1Var.f47720q0 = dp;
        m1Var.f47719p0.G();
        if (this.J != m1Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = m1Var.isKeyboardVisible();
            this.J = isKeyboardVisible;
            if (isKeyboardVisible) {
                im0 im0Var = m1Var.d;
                li.n nVar = new li.n(m1Var.getContext(), 2, 0.6f);
                nVar.f46053a = 1;
                nVar.f16144p = AndroidUtilities.dp(36.0f);
                im0Var.getLayoutManager().w0(nVar);
            }
        }
    }
}
