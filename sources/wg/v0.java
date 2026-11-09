package wg;

import android.content.Context;
import org.telegram.ui.ActionBar.g6;
public final class v0 extends ah.o {
    public final w0 K;

    public v0(w0 w0Var, Context context, g6 g6Var) {
        super(context, g6Var);
        this.K = w0Var;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        int L = org.telegram.messenger.g0.L(78.0f) + getMeasuredHeight();
        w0 w0Var = this.K;
        w0Var.f57825h2 = L;
        w0Var.f57824g2.G();
    }
}
