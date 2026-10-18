package ug;

import android.content.Context;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.mb0;
public final class i1 extends ei.d {
    public final m1 f47683h0;

    public i1(m1 m1Var, Context context, d6 d6Var) {
        super(context, d6Var, true);
        this.f47683h0 = m1Var;
    }

    @Override
    public final float a(float f7, float f10) {
        boolean z10;
        m1 m1Var = this.f47683h0;
        if (m1Var.f47721t0 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        m1Var.f47721t0 = f7;
        if (z10) {
            m1Var.f47722u0 = new mb0(m1Var, 2);
            m1Var.h0(false);
        }
        return f7;
    }
}
