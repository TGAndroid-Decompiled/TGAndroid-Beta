package ug;

import android.content.Context;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.sa0;
public final class k1 extends di.d {
    public final n1 f47141h0;

    public k1(n1 n1Var, Context context, f6 f6Var) {
        super(context, f6Var, true);
        this.f47141h0 = n1Var;
    }

    @Override
    public final float a(float f7, float f10) {
        boolean z10;
        n1 n1Var = this.f47141h0;
        if (n1Var.f47175t0 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        n1Var.f47175t0 = f7;
        if (z10) {
            n1Var.f47176u0 = new sa0(n1Var, 2);
            n1Var.g0(false);
        }
        return f7;
    }
}
