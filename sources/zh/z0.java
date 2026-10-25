package zh;

import android.content.Context;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.wc;
public final class z0 extends y4 {
    public final p1 f53360z0;

    public z0(p1 p1Var, Context context, int i10, tg.k kVar, long j10, l0 l0Var) {
        super(context, i10, null, kVar, j10, l0Var, false, false);
        this.f53360z0 = p1Var;
    }

    @Override
    public final wc X() {
        u6 u6Var;
        p1 p1Var = this.f53360z0;
        org.telegram.ui.ActionBar.h3 h3Var = p1Var.container;
        u6Var = p1Var.resourcesProvider;
        return new wc(h3Var, u6Var);
    }
}
