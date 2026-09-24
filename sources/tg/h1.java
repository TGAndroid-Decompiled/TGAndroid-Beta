package tg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.wl0;
public final class h1 extends xg.i {
    public boolean J;
    public final m1 K;

    public h1(m1 m1Var, Context context, d6 d6Var) {
        super(context, d6Var);
        this.K = m1Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        m1 m1Var = this.K;
        m1Var.f43437q0 = dp;
        m1Var.f43436p0.G();
        if (this.J != m1Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = m1Var.isKeyboardVisible();
            this.J = isKeyboardVisible;
            if (isKeyboardVisible) {
                wl0 wl0Var = m1Var.d;
                ji.o oVar = new ji.o(m1Var.getContext(), 2, 0.6f);
                oVar.f43096a = 1;
                oVar.f13094p = AndroidUtilities.dp(36.0f);
                wl0Var.getLayoutManager().w0(oVar);
            }
        }
    }
}
