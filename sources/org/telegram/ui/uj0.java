package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class uj0 extends yg.i {
    public boolean J;
    public final xj0 K;

    public uj0(xj0 xj0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.K = xj0Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        xj0 xj0Var = this.K;
        xj0Var.f41881l0 = dp;
        xj0Var.f41880k0.G();
        if (this.J != xj0Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = xj0Var.isKeyboardVisible();
            this.J = isKeyboardVisible;
            if (isKeyboardVisible) {
                org.telegram.ui.Components.mm0 mm0Var = xj0Var.d;
                ki.o oVar = new ki.o(xj0Var.getContext(), 2, 0.6f);
                oVar.f44979a = 1;
                oVar.f14352p = AndroidUtilities.dp(36.0f);
                mm0Var.getLayoutManager().w0(oVar);
            }
        }
    }
}
