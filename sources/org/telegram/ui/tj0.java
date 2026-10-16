package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class tj0 extends yg.i {
    public boolean J;
    public final wj0 K;

    public tj0(wj0 wj0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.K = wj0Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        wj0 wj0Var = this.K;
        wj0Var.f41311l0 = dp;
        wj0Var.f41310k0.G();
        if (this.J != wj0Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = wj0Var.isKeyboardVisible();
            this.J = isKeyboardVisible;
            if (isKeyboardVisible) {
                org.telegram.ui.Components.mm0 mm0Var = wj0Var.d;
                ki.o oVar = new ki.o(wj0Var.getContext(), 2, 0.6f);
                oVar.f44979a = 1;
                oVar.f14354p = AndroidUtilities.dp(36.0f);
                mm0Var.getLayoutManager().w0(oVar);
            }
        }
    }
}
