package zh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z61;
public final class m0 extends z61 {
    public final r0 N;

    public m0(r0 r0Var, mm0 mm0Var, Context context, int i10, ii.a aVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(mm0Var, context, i10, 0, true, aVar, c6Var);
        this.N = r0Var;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        super.v(b1Var, i10);
        View view = b1Var.f44838a;
        if (!(view instanceof p0)) {
            return;
        }
        p0 p0Var = (p0) view;
        n0 n0Var = p0Var.v;
        boolean S = this.N.S(n0Var);
        p0Var.f50969c.f(S, false);
        p0Var.f50972r.a(S, false);
        p0Var.setOnClickListener(new yh.a(9, this, n0Var));
    }
}
