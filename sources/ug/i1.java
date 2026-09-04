package ug;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.ll0;
public final class i1 extends yg.i {
    public boolean J;
    public final n1 K;

    public i1(n1 n1Var, Context context, f6 f6Var) {
        super(context, f6Var);
        this.K = n1Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        n1 n1Var = this.K;
        n1Var.f47172q0 = dp;
        n1Var.f47171p0.G();
        if (this.J != n1Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = n1Var.isKeyboardVisible();
            this.J = isKeyboardVisible;
            if (isKeyboardVisible) {
                ll0 ll0Var = n1Var.d;
                ki.p pVar = new ki.p(n1Var.getContext(), 2, 0.6f);
                pVar.f45906a = 1;
                pVar.f15042p = AndroidUtilities.dp(36.0f);
                ll0Var.getLayoutManager().w0(pVar);
            }
        }
    }
}
