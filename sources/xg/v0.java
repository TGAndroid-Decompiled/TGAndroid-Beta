package xg;

import android.content.Context;
import org.telegram.ui.ActionBar.e6;
public final class v0 extends bh.m {
    public final w0 L;

    public v0(w0 w0Var, Context context, e6 e6Var) {
        super(context, e6Var);
        this.L = w0Var;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        int L = org.telegram.messenger.g0.L(78.0f) + getMeasuredHeight();
        w0 w0Var = this.L;
        w0Var.f58778i2 = L;
        w0Var.f58777h2.G();
    }
}
