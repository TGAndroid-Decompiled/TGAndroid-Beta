package wg;

import android.content.Context;
import org.telegram.ui.ActionBar.e6;
public final class t0 extends ah.o {
    public final u0 L;

    public t0(u0 u0Var, Context context, e6 e6Var) {
        super(context, e6Var);
        this.L = u0Var;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        int L = org.telegram.messenger.g0.L(78.0f) + getMeasuredHeight();
        u0 u0Var = this.L;
        u0Var.f59253l2 = L;
        u0Var.f59252k2.G();
    }
}
