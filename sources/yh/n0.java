package yh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.wl0;
public final class n0 extends l61 {
    public final s0 N;

    public n0(s0 s0Var, wl0 wl0Var, Context context, int i10, hi.a aVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(wl0Var, context, i10, 0, true, aVar, e6Var);
        this.N = s0Var;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        super.v(c1Var, i10);
        View view = c1Var.f42929a;
        if (!(view instanceof q0)) {
            return;
        }
        q0 q0Var = (q0) view;
        o0 o0Var = q0Var.v;
        boolean R = this.N.R(o0Var);
        q0Var.f47888c.f(R, false);
        q0Var.f47891r.a(R, false);
        q0Var.setOnClickListener(new w(3, this, o0Var));
    }
}
