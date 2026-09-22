package tg;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.yl0;
public final class h1 extends xg.i {
    public boolean J;
    public final m1 K;

    public h1(m1 m1Var, Context context, f6 f6Var) {
        super(context, f6Var);
        this.K = m1Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(64.0f) + getMeasuredHeight();
        m1 m1Var = this.K;
        m1Var.f43487q0 = dp;
        m1Var.f43486p0.G();
        if (this.J != m1Var.isKeyboardVisible()) {
            boolean isKeyboardVisible = m1Var.isKeyboardVisible();
            this.J = isKeyboardVisible;
            if (isKeyboardVisible) {
                yl0 yl0Var = m1Var.d;
                ji.o oVar = new ji.o(m1Var.getContext(), 2, 0.6f);
                oVar.f43145a = 1;
                oVar.f13106p = AndroidUtilities.dp(36.0f);
                yl0Var.getLayoutManager().w0(oVar);
            }
        }
    }
}
