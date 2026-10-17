package yh;

import android.content.Context;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.xc;
public final class a1 extends y4 {
    public final p1 f50190x0;

    public a1(p1 p1Var, Context context, int i10, sg.k kVar, long j10, m0 m0Var) {
        super(context, i10, null, kVar, j10, m0Var, false, false);
        this.f50190x0 = p1Var;
    }

    @Override
    public final xc Y() {
        d6 d6Var;
        p1 p1Var = this.f50190x0;
        org.telegram.ui.ActionBar.d3 d3Var = p1Var.container;
        d6Var = p1Var.resourcesProvider;
        return new xc(d3Var, d6Var);
    }
}
