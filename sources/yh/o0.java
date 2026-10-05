package yh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.zl0;
public final class o0 extends w61 {
    public final t0 N;

    public o0(t0 t0Var, zl0 zl0Var, Context context, int i10, hi.a aVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(zl0Var, context, i10, 0, true, aVar, d6Var);
        this.N = t0Var;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        super.v(c1Var, i10);
        View view = c1Var.f46538a;
        if (!(view instanceof r0)) {
            return;
        }
        r0 r0Var = (r0) view;
        p0 p0Var = r0Var.v;
        boolean P = this.N.P(p0Var);
        r0Var.f51892c.f(P, false);
        r0Var.f51896r.a(P, false);
        r0Var.setOnClickListener(new x(3, this, p0Var));
    }
}
