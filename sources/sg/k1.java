package sg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.vl0;
public final class k1 extends wg.h {
    public boolean J;
    public final p1 K;

    public k1(p1 p1Var, Context context, f6 f6Var) {
        super(context, f6Var);
        this.K = p1Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        p1 p1Var = this.K;
        p1Var.f41982q0 = dp;
        p1Var.f41981p0.G();
        if (this.J != p1Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = p1Var.isKeyboardVisible();
            this.J = isKeyboardVisible;
            if (isKeyboardVisible) {
                vl0 vl0Var = p1Var.d;
                ii.o oVar = new ii.o(p1Var.getContext(), 2, 0.6f);
                oVar.f41760a = 1;
                oVar.f10694p = AndroidUtilities.dp(36.0f);
                vl0Var.getLayoutManager().w0(oVar);
            }
        }
    }
}
