package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class xi0 extends yg.h {
    public boolean J;
    public final aj0 K;

    public xi0(aj0 aj0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.K = aj0Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        aj0 aj0Var = this.K;
        aj0Var.f35382l0 = dp;
        aj0Var.f35381k0.G();
        if (this.J != aj0Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = aj0Var.isKeyboardVisible();
            this.J = isKeyboardVisible;
            if (isKeyboardVisible) {
                org.telegram.ui.Components.im0 im0Var = aj0Var.d;
                li.n nVar = new li.n(aj0Var.getContext(), 2, 0.6f);
                nVar.f46051a = 1;
                nVar.f16146p = AndroidUtilities.dp(36.0f);
                im0Var.getLayoutManager().w0(nVar);
            }
        }
    }
}
