package yh;

import android.content.Context;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.yc;
public final class a1 extends x4 {
    public final p1 f50229x0;

    public a1(p1 p1Var, Context context, int i10, sg.k kVar, long j3, m0 m0Var) {
        super(context, i10, null, kVar, j3, m0Var, false, false);
        this.f50229x0 = p1Var;
    }

    @Override
    public final yc X() {
        f6 f6Var;
        p1 p1Var = this.f50229x0;
        org.telegram.ui.ActionBar.d3 d3Var = p1Var.container;
        f6Var = p1Var.resourcesProvider;
        return new yc(d3Var, f6Var);
    }
}
