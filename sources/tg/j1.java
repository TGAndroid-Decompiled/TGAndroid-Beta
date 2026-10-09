package tg;

import android.content.Context;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.tb0;
public final class j1 extends ci.d {
    public final m1 f48339h0;

    public j1(m1 m1Var, Context context, e6 e6Var) {
        super(context, e6Var, true);
        this.f48339h0 = m1Var;
    }

    @Override
    public final float a(float f7, float f10) {
        boolean z10;
        m1 m1Var = this.f48339h0;
        if (m1Var.f48373t0 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        m1Var.f48373t0 = f7;
        if (z10) {
            m1Var.f48374u0 = new tb0(m1Var, 2);
            m1Var.h0(false);
        }
        return f7;
    }
}
