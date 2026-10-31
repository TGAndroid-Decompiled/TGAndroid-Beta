package rh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.rv0;
public final class n0 extends p51 {
    public final t0 P;

    public n0(t0 t0Var, tk0 tk0Var, Context context, int i10, qh.d dVar, org.telegram.ui.ActionBar.p6 p6Var) {
        super(tk0Var, context, i10, 0, true, dVar, p6Var);
        this.P = t0Var;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        super.t(c1Var, i10);
        View view = c1Var.f47898a;
        if (!(view instanceof q0)) {
            return;
        }
        q0 q0Var = (q0) view;
        o0 o0Var = q0Var.f47341w;
        boolean f12 = this.P.f1(o0Var);
        q0Var.f47336c.f(f12, false);
        q0Var.f47339r.a(f12, false);
        q0Var.setOnClickListener(new rv0(28, this, o0Var));
    }
}
