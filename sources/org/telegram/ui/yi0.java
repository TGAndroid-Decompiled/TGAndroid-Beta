package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class yi0 extends yg.h {
    public boolean J;
    public final bj0 K;

    public yi0(bj0 bj0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.K = bj0Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        bj0 bj0Var = this.K;
        bj0Var.f35661l0 = dp;
        bj0Var.f35660k0.G();
        if (this.J != bj0Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = bj0Var.isKeyboardVisible();
            this.J = isKeyboardVisible;
            if (isKeyboardVisible) {
                org.telegram.ui.Components.jm0 jm0Var = bj0Var.d;
                li.n nVar = new li.n(bj0Var.getContext(), 2, 0.6f);
                nVar.f46061a = 1;
                nVar.f16144p = AndroidUtilities.dp(36.0f);
                jm0Var.getLayoutManager().w0(nVar);
            }
        }
    }
}
