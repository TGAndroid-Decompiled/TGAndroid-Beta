package ug;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.im0;
public final class f1 extends yg.h {
    public boolean J;
    public final l1 K;

    public f1(l1 l1Var, Context context, d6 d6Var) {
        super(context, d6Var);
        this.K = l1Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        l1 l1Var = this.K;
        l1Var.f47737q0 = dp;
        l1Var.f47736p0.G();
        if (this.J != l1Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = l1Var.isKeyboardVisible();
            this.J = isKeyboardVisible;
            if (isKeyboardVisible) {
                im0 im0Var = l1Var.d;
                li.n nVar = new li.n(l1Var.getContext(), 2, 0.6f);
                nVar.f46079a = 1;
                nVar.f16138p = AndroidUtilities.dp(36.0f);
                im0Var.getLayoutManager().w0(nVar);
            }
        }
    }
}
