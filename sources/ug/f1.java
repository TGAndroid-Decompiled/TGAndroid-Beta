package ug;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.lm0;
public final class f1 extends yg.h {
    public boolean K;
    public final l1 L;

    public f1(l1 l1Var, Context context, g6 g6Var) {
        super(context, g6Var);
        this.L = l1Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        l1 l1Var = this.L;
        l1Var.f48161q0 = dp;
        l1Var.f48160p0.G();
        if (this.K != l1Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = l1Var.isKeyboardVisible();
            this.K = isKeyboardVisible;
            if (isKeyboardVisible) {
                lm0 lm0Var = l1Var.d;
                li.n nVar = new li.n(l1Var.getContext(), 2, 0.6f);
                nVar.f46483a = 1;
                nVar.f16207p = AndroidUtilities.dp(36.0f);
                lm0Var.getLayoutManager().w0(nVar);
            }
        }
    }
}
