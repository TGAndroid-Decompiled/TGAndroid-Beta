package tg;

import android.content.Context;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.eb0;
public final class j1 extends ci.d {
    public final m1 f43420h0;

    public j1(m1 m1Var, Context context, d6 d6Var) {
        super(context, d6Var, true);
        this.f43420h0 = m1Var;
    }

    @Override
    public final float a(float f7, float f10) {
        boolean z10;
        m1 m1Var = this.f43420h0;
        if (m1Var.f43453t0 == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        m1Var.f43453t0 = f7;
        if (z10) {
            m1Var.f43454u0 = new eb0(m1Var, 2);
            m1Var.g0(false);
        }
        return f7;
    }
}
