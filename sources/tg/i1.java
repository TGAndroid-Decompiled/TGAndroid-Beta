package tg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.ml0;
public final class i1 extends xg.i {
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
        n1Var.f43212q0 = dp;
        n1Var.f43211p0.G();
        if (this.J != n1Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = n1Var.isKeyboardVisible();
            this.J = isKeyboardVisible;
            if (isKeyboardVisible) {
                ml0 ml0Var = n1Var.d;
                ji.o oVar = new ji.o(n1Var.getContext(), 2, 0.6f);
                oVar.f42847a = 1;
                oVar.f13105p = AndroidUtilities.dp(36.0f);
                ml0Var.getLayoutManager().w0(oVar);
            }
        }
    }
}
