package yh;

import android.content.Context;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.xc;
public final class z0 extends x4 {
    public final o1 f51084z0;

    public z0(o1 o1Var, Context context, int i10, sg.k kVar, long j10, l0 l0Var) {
        super(context, i10, null, kVar, j10, l0Var, false, false);
        this.f51084z0 = o1Var;
    }

    @Override
    public final xc X() {
        g6 g6Var;
        o1 o1Var = this.f51084z0;
        org.telegram.ui.ActionBar.e3 e3Var = o1Var.container;
        g6Var = o1Var.resourcesProvider;
        return new xc(e3Var, g6Var);
    }
}
