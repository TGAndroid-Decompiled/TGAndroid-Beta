package tg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.wm0;
public final class h1 extends xg.i {
    public boolean J;
    public final m1 K;

    public h1(m1 m1Var, Context context, c6 c6Var) {
        super(context, c6Var);
        this.K = m1Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        m1 m1Var = this.K;
        m1Var.f48609q0 = dp;
        m1Var.f48608p0.G();
        if (this.J != m1Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = m1Var.isKeyboardVisible();
            this.J = isKeyboardVisible;
            if (isKeyboardVisible) {
                wm0 wm0Var = m1Var.d;
                ji.o oVar = new ji.o(m1Var.getContext(), 2, 0.6f);
                oVar.f48066a = 1;
                oVar.f14271p = AndroidUtilities.dp(36.0f);
                wm0Var.getLayoutManager().w0(oVar);
            }
        }
    }
}
