package xh;

import android.content.Context;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.zc;
public final class b1 extends y4 {
    public final q1 f51413x0;

    public b1(q1 q1Var, Context context, int i10, rg.k kVar, long j3, o0 o0Var) {
        super(context, i10, null, kVar, j3, o0Var, false, false);
        this.f51413x0 = q1Var;
    }

    @Override
    public final zc Y() {
        c6 c6Var;
        q1 q1Var = this.f51413x0;
        org.telegram.ui.ActionBar.c3 c3Var = q1Var.container;
        c6Var = q1Var.resourcesProvider;
        return new zc(c3Var, c6Var);
    }
}
