package xh;

import android.content.Context;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.vc;
public final class a1 extends y4 {
    public final q1 f45815x0;

    public a1(q1 q1Var, Context context, int i10, rg.k kVar, long j3, m0 m0Var) {
        super(context, i10, null, kVar, j3, m0Var, false, false);
        this.f45815x0 = q1Var;
    }

    @Override
    public final vc X() {
        f6 f6Var;
        q1 q1Var = this.f45815x0;
        org.telegram.ui.ActionBar.e3 e3Var = q1Var.container;
        f6Var = q1Var.resourcesProvider;
        return new vc(e3Var, f6Var);
    }
}
