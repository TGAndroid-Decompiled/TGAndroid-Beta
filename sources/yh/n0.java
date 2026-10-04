package yh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.zl0;
public final class n0 extends u61 {
    public final s0 N;

    public n0(s0 s0Var, zl0 zl0Var, Context context, int i10, hi.a aVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(zl0Var, context, i10, 0, true, aVar, d6Var);
        this.N = s0Var;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        super.v(c1Var, i10);
        View view = c1Var.f46523a;
        if (!(view instanceof q0)) {
            return;
        }
        q0 q0Var = (q0) view;
        o0 o0Var = q0Var.v;
        boolean P = this.N.P(o0Var);
        q0Var.f51841c.f(P, false);
        q0Var.f51845r.a(P, false);
        q0Var.setOnClickListener(new w(3, this, o0Var));
    }
}
