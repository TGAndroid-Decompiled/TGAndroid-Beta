package xh;

import android.content.Context;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.vc;
public final class b1 extends yh.z3 {
    public final q1 f45802r1;

    public b1(q1 q1Var, Context context, int i10, long j3, e6 e6Var) {
        super(context, i10, j3, e6Var, null);
        this.f45802r1 = q1Var;
    }

    @Override
    public final vc getBulletinFactory() {
        e6 e6Var;
        q1 q1Var = this.f45802r1;
        org.telegram.ui.ActionBar.d3 d3Var = q1Var.container;
        e6Var = q1Var.resourcesProvider;
        return new vc(d3Var, e6Var);
    }
}
