package yh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.sm0;
public final class m0 extends e71 {
    public final r0 N;

    public m0(r0 r0Var, sm0 sm0Var, Context context, int i10, hi.a aVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(sm0Var, context, i10, 0, true, aVar, d6Var);
        this.N = r0Var;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        super.v(d1Var, i10);
        View view = d1Var.f47748a;
        if (!(view instanceof p0)) {
            return;
        }
        p0 p0Var = (p0) view;
        n0 n0Var = p0Var.v;
        boolean S = this.N.S(n0Var);
        p0Var.f53069c.f(S, false);
        p0Var.f53073r.a(S, false);
        p0Var.setOnClickListener(new xh.a(9, this, n0Var));
    }
}
