package zh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.v51;
public final class n0 extends v51 {
    public final s0 N;

    public n0(s0 s0Var, ll0 ll0Var, Context context, int i10, ii.a aVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(ll0Var, context, i10, 0, true, aVar, f6Var);
        this.N = s0Var;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        super.v(c1Var, i10);
        View view = c1Var.f45766a;
        if (!(view instanceof q0)) {
            return;
        }
        q0 q0Var = (q0) view;
        o0 o0Var = q0Var.v;
        boolean R = this.N.R(o0Var);
        q0Var.f52476c.f(R, false);
        q0Var.f52480r.a(R, false);
        q0Var.setOnClickListener(new w(3, this, o0Var));
    }
}
