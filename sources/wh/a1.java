package wh;

import android.content.Context;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.wc;
public final class a1 extends y4 {
    public final p1 f44020x0;

    public a1(p1 p1Var, Context context, int i10, qg.k kVar, long j3, n0 n0Var) {
        super(context, i10, null, kVar, j3, n0Var, false, false);
        this.f44020x0 = p1Var;
    }

    @Override
    public final wc X() {
        f6 f6Var;
        p1 p1Var = this.f44020x0;
        org.telegram.ui.ActionBar.f3 f3Var = p1Var.container;
        f6Var = p1Var.resourcesProvider;
        return new wc(f3Var, f6Var);
    }
}
