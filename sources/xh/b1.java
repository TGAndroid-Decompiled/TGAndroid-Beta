package xh;

import android.content.Context;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.vc;
public final class b1 extends yh.a4 {
    public final q1 f45829r1;

    public b1(q1 q1Var, Context context, int i10, long j3, f6 f6Var) {
        super(context, i10, j3, f6Var, null);
        this.f45829r1 = q1Var;
    }

    @Override
    public final vc getBulletinFactory() {
        f6 f6Var;
        q1 q1Var = this.f45829r1;
        org.telegram.ui.ActionBar.e3 e3Var = q1Var.container;
        f6Var = q1Var.resourcesProvider;
        return new vc(e3Var, f6Var);
    }
}
