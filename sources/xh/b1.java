package xh;

import android.content.Context;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.yc;
public final class b1 extends z4 {
    public final r1 f46069x0;

    public b1(r1 r1Var, Context context, int i10, rg.k kVar, long j3, m0 m0Var) {
        super(context, i10, null, kVar, j3, m0Var, false, false);
        this.f46069x0 = r1Var;
    }

    @Override
    public final yc X() {
        d6 d6Var;
        r1 r1Var = this.f46069x0;
        org.telegram.ui.ActionBar.c3 c3Var = r1Var.container;
        d6Var = r1Var.resourcesProvider;
        return new yc(c3Var, d6Var);
    }
}
