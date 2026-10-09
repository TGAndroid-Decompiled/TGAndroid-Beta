package xh;

import android.content.Context;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.ad;
public final class c1 extends z4 {
    public final r1 f51191x0;

    public c1(r1 r1Var, Context context, int i10, rg.k kVar, long j3, o0 o0Var) {
        super(context, i10, null, kVar, j3, o0Var, false, false);
        this.f51191x0 = r1Var;
    }

    @Override
    public final ad Y() {
        e6 e6Var;
        r1 r1Var = this.f51191x0;
        org.telegram.ui.ActionBar.d3 d3Var = r1Var.container;
        e6Var = r1Var.resourcesProvider;
        return new ad(d3Var, e6Var);
    }
}
