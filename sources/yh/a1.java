package yh;

import android.content.Context;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.zc;
public final class a1 extends x4 {
    public final p1 f48789x0;

    public a1(p1 p1Var, Context context, int i10, sg.k kVar, long j10, n0 n0Var) {
        super(context, i10, null, kVar, j10, n0Var, false, false);
        this.f48789x0 = p1Var;
    }

    @Override
    public final zc Y() {
        c6 c6Var;
        p1 p1Var = this.f48789x0;
        org.telegram.ui.ActionBar.c3 c3Var = p1Var.container;
        c6Var = p1Var.resourcesProvider;
        return new zc(c3Var, c6Var);
    }
}
