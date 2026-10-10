package yh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.rm0;
public final class m0 extends d71 {
    public final r0 N;

    public m0(r0 r0Var, rm0 rm0Var, Context context, int i10, hi.a aVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(rm0Var, context, i10, 0, true, aVar, e6Var);
        this.N = r0Var;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        super.v(d1Var, i10);
        View view = d1Var.f47702a;
        if (!(view instanceof p0)) {
            return;
        }
        p0 p0Var = (p0) view;
        n0 n0Var = p0Var.v;
        boolean S = this.N.S(n0Var);
        p0Var.f53026c.f(S, false);
        p0Var.f53030r.a(S, false);
        p0Var.setOnClickListener(new xh.a(9, this, n0Var));
    }
}
