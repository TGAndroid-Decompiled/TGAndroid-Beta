package vg;

import android.content.Context;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.kb0;
public final class j1 extends fi.d {
    public final n1 f50187k0;

    public j1(n1 n1Var, Context context, u6 u6Var) {
        super(context, u6Var, true);
        this.f50187k0 = n1Var;
    }

    @Override
    public final float a(float f7, float f10) {
        boolean z10;
        n1 n1Var = this.f50187k0;
        if (n1Var.f50227t0 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        n1Var.f50227t0 = f7;
        if (z10) {
            n1Var.f50228u0 = new kb0(n1Var, 2);
            n1Var.g0(false);
        }
        return f7;
    }
}
