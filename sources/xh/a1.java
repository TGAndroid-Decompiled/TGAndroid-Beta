package xh;

import android.content.Context;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.vc;
public final class a1 extends y4 {
    public final q1 f45788x0;

    public a1(q1 q1Var, Context context, int i10, rg.k kVar, long j3, m0 m0Var) {
        super(context, i10, null, kVar, j3, m0Var, false, false);
        this.f45788x0 = q1Var;
    }

    @Override
    public final vc X() {
        e6 e6Var;
        q1 q1Var = this.f45788x0;
        org.telegram.ui.ActionBar.d3 d3Var = q1Var.container;
        e6Var = q1Var.resourcesProvider;
        return new vc(d3Var, e6Var);
    }
}
