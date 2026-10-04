package xh;

import android.content.Context;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.yc;
public final class c1 extends yh.x3 {
    public final q1 f49903r1;

    public c1(q1 q1Var, Context context, int i10, long j3, d6 d6Var) {
        super(context, i10, j3, d6Var, null);
        this.f49903r1 = q1Var;
    }

    @Override
    public final yc getBulletinFactory() {
        d6 d6Var;
        q1 q1Var = this.f49903r1;
        org.telegram.ui.ActionBar.d3 d3Var = q1Var.container;
        d6Var = q1Var.resourcesProvider;
        return new yc(d3Var, d6Var);
    }
}
