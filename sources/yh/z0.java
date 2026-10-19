package yh;

import android.content.Context;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.xc;
public final class z0 extends x4 {
    public final o1 f50616x0;

    public z0(o1 o1Var, Context context, int i10, sg.k kVar, long j10, l0 l0Var) {
        super(context, i10, null, kVar, j10, l0Var, false, false);
        this.f50616x0 = o1Var;
    }

    @Override
    public final xc Y() {
        d6 d6Var;
        o1 o1Var = this.f50616x0;
        org.telegram.ui.ActionBar.d3 d3Var = o1Var.container;
        d6Var = o1Var.resourcesProvider;
        return new xc(d3Var, d6Var);
    }
}
