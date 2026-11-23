package wg;

import android.content.Context;
import org.telegram.ui.ActionBar.i6;
public final class u0 extends ah.o {
    public final v0 L;

    public u0(v0 v0Var, Context context, i6 i6Var) {
        super(context, i6Var);
        this.L = v0Var;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        int L = org.telegram.messenger.g0.L(78.0f) + getMeasuredHeight();
        v0 v0Var = this.L;
        v0Var.f59949l2 = L;
        v0Var.f59948k2.G();
    }
}
