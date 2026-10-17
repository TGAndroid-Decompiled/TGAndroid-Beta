package ug;

import android.content.Context;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.mb0;
public final class h1 extends ei.d {
    public final l1 f47702h0;

    public h1(l1 l1Var, Context context, d6 d6Var) {
        super(context, d6Var, true);
        this.f47702h0 = l1Var;
    }

    @Override
    public final float a(float f7, float f10) {
        boolean z10;
        l1 l1Var = this.f47702h0;
        if (l1Var.f47740t0 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        l1Var.f47740t0 = f7;
        if (z10) {
            l1Var.f47741u0 = new mb0(l1Var, 2);
            l1Var.h0(false);
        }
        return f7;
    }
}
