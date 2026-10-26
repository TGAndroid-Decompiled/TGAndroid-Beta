package vg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.mm0;
public final class h1 extends zg.i {
    public boolean K;
    public final n1 L;

    public h1(n1 n1Var, Context context, u6 u6Var) {
        super(context, u6Var);
        this.L = n1Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        n1 n1Var = this.L;
        n1Var.f50224q0 = dp;
        n1Var.f50223p0.G();
        if (this.K != n1Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = n1Var.isKeyboardVisible();
            this.K = isKeyboardVisible;
            if (isKeyboardVisible) {
                mm0 mm0Var = n1Var.d;
                mi.n nVar = new mi.n(n1Var.getContext(), 2, 0.6f);
                nVar.f47680a = 1;
                nVar.f18556p = AndroidUtilities.dp(36.0f);
                mm0Var.getLayoutManager().w0(nVar);
            }
        }
    }
}
