package xh;

import android.content.Context;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.xc;
public final class b1 extends z4 {
    public final r1 f46056x0;

    public b1(r1 r1Var, Context context, int i10, rg.k kVar, long j3, m0 m0Var) {
        super(context, i10, null, kVar, j3, m0Var, false, false);
        this.f46056x0 = r1Var;
    }

    @Override
    public final xc X() {
        e6 e6Var;
        r1 r1Var = this.f46056x0;
        org.telegram.ui.ActionBar.d3 d3Var = r1Var.container;
        e6Var = r1Var.resourcesProvider;
        return new xc(d3Var, e6Var);
    }
}
