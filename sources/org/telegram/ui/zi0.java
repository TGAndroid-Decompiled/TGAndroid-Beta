package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class zi0 extends yg.h {
    public boolean J;
    public final cj0 K;

    public zi0(cj0 cj0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.K = cj0Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        cj0 cj0Var = this.K;
        cj0Var.f35927l0 = dp;
        cj0Var.f35926k0.G();
        if (this.J != cj0Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = cj0Var.isKeyboardVisible();
            this.J = isKeyboardVisible;
            if (isKeyboardVisible) {
                org.telegram.ui.Components.im0 im0Var = cj0Var.d;
                li.n nVar = new li.n(cj0Var.getContext(), 2, 0.6f);
                nVar.f46051a = 1;
                nVar.f16143p = AndroidUtilities.dp(36.0f);
                im0Var.getLayoutManager().w0(nVar);
            }
        }
    }
}
