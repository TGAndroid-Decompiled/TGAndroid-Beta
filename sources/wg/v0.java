package wg;

import android.content.Context;
import org.telegram.ui.ActionBar.h6;
public final class v0 extends ah.o {
    public final w0 L;

    public v0(w0 w0Var, Context context, h6 h6Var) {
        super(context, h6Var);
        this.L = w0Var;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        int L = org.telegram.messenger.g0.L(78.0f) + getMeasuredHeight();
        w0 w0Var = this.L;
        w0Var.f59854l2 = L;
        w0Var.f59853k2.G();
    }
}
