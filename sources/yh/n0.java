package yh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.v51;
public final class n0 extends v51 {
    public final s0 N;

    public n0(s0 s0Var, ml0 ml0Var, Context context, int i10, hi.a aVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(ml0Var, context, i10, 0, true, aVar, d6Var);
        this.N = s0Var;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        super.v(c1Var, i10);
        View view = c1Var.f42627a;
        if (!(view instanceof q0)) {
            return;
        }
        q0 q0Var = (q0) view;
        o0 o0Var = q0Var.v;
        boolean R = this.N.R(o0Var);
        q0Var.f47572c.f(R, false);
        q0Var.f47575r.a(R, false);
        q0Var.setOnClickListener(new w(3, this, o0Var));
    }
}
