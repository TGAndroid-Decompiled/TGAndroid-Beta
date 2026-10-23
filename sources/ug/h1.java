package ug;

import android.content.Context;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.nb0;
public final class h1 extends ei.d {
    public final l1 f48127k0;

    public h1(l1 l1Var, Context context, g6 g6Var) {
        super(context, g6Var, true);
        this.f48127k0 = l1Var;
    }

    @Override
    public final float a(float f7, float f10) {
        boolean z10;
        l1 l1Var = this.f48127k0;
        if (l1Var.f48165t0 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        l1Var.f48165t0 = f7;
        if (z10) {
            l1Var.f48166u0 = new nb0(l1Var, 2);
            l1Var.g0(false);
        }
        return f7;
    }
}
