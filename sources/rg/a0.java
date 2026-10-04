package rg;

import android.content.Context;
import org.telegram.ui.ActionBar.d6;
public final class a0 extends q0 {
    public final k0 P;

    public a0(k0 k0Var, Context context, d6 d6Var) {
        super(context, d6Var, true);
        this.P = k0Var;
    }

    @Override
    public final void invalidate() {
        if (this.P.f46156f0) {
            return;
        }
        super.invalidate();
    }
}
