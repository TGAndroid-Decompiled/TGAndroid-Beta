package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class xi0 extends fg.m {
    public boolean F;
    public final bj0 G;

    public xi0(bj0 bj0Var, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var);
        this.G = bj0Var;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        int dp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        bj0 bj0Var = this.G;
        bj0Var.f36886h0 = dp;
        bj0Var.f36885g0.G();
        if (this.F != bj0Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = bj0Var.isKeyboardVisible();
            this.F = isKeyboardVisible;
            if (isKeyboardVisible) {
                org.telegram.ui.Components.wk0 wk0Var = bj0Var.d;
                rh.n nVar = new rh.n(bj0Var.getContext(), 2, 0.6f);
                nVar.f5443a = 1;
                nVar.f47269p = AndroidUtilities.dp(36.0f);
                wk0Var.getLayoutManager().w0(nVar);
            }
        }
    }
}
