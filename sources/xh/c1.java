package xh;

import android.content.Context;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.ad;
public final class c1 extends z4 {
    public final r1 f51314x0;

    public c1(r1 r1Var, Context context, int i10, rg.k kVar, long j3, o0 o0Var) {
        super(context, i10, null, kVar, j3, o0Var, false, false);
        this.f51314x0 = r1Var;
    }

    @Override
    public final ad Y() {
        d6 d6Var;
        r1 r1Var = this.f51314x0;
        org.telegram.ui.ActionBar.c3 c3Var = r1Var.container;
        d6Var = r1Var.resourcesProvider;
        return new ad(c3Var, d6Var);
    }
}
