package xh;

import android.content.Context;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.yc;
public final class b1 extends z4 {
    public final q1 f49887x0;

    public b1(q1 q1Var, Context context, int i10, rg.k kVar, long j3, m0 m0Var) {
        super(context, i10, null, kVar, j3, m0Var, false, false);
        this.f49887x0 = q1Var;
    }

    @Override
    public final yc W() {
        d6 d6Var;
        q1 q1Var = this.f49887x0;
        org.telegram.ui.ActionBar.d3 d3Var = q1Var.container;
        d6Var = q1Var.resourcesProvider;
        return new yc(d3Var, d6Var);
    }
}
