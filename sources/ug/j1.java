package ug;

import android.content.Context;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.sb0;
public final class j1 extends di.d {
    public final m1 f46325h0;

    public j1(m1 m1Var, Context context, c6 c6Var) {
        super(context, c6Var, true);
        this.f46325h0 = m1Var;
    }

    @Override
    public final float a(float f7, float f10) {
        boolean z10;
        m1 m1Var = this.f46325h0;
        if (m1Var.f46358t0 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        m1Var.f46358t0 = f7;
        if (z10) {
            m1Var.f46359u0 = new sb0(m1Var, 2);
            m1Var.h0(false);
        }
        return f7;
    }
}
