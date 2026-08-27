package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

public final class zi0 extends gg.l {
    public boolean F;
    public final dj0 G;

    public zi0(dj0 dj0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.G = dj0Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int iDp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        dj0 dj0Var = this.G;
        dj0Var.f37424h0 = iDp;
        dj0Var.f37423g0.G();
        if (this.F != dj0Var.isKeyboardVisible()) {
            boolean zIsKeyboardVisible = dj0Var.isKeyboardVisible();
            this.F = zIsKeyboardVisible;
            if (zIsKeyboardVisible) {
                org.telegram.ui.Components.zk0 zk0Var = dj0Var.d;
                sh.n nVar = new sh.n(dj0Var.getContext(), 2, 0.6f);
                nVar.f5731a = 1;
                nVar.f47990p = AndroidUtilities.dp(36.0f);
                zk0Var.getLayoutManager().w0(nVar);
            }
        }
    }
}
