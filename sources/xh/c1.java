package xh;

import android.content.Context;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.xc;
public final class c1 extends yh.x3 {
    public final r1 f46162r1;

    public c1(r1 r1Var, Context context, int i10, long j3, e6 e6Var) {
        super(context, i10, j3, e6Var, null);
        this.f46162r1 = r1Var;
    }

    @Override
    public final xc getBulletinFactory() {
        e6 e6Var;
        r1 r1Var = this.f46162r1;
        org.telegram.ui.ActionBar.e3 e3Var = r1Var.container;
        e6Var = r1Var.resourcesProvider;
        return new xc(e3Var, e6Var);
    }
}
