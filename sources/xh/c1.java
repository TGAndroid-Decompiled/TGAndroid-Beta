package xh;

import android.content.Context;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.xc;
public final class c1 extends yh.y3 {
    public final r1 f46073r1;

    public c1(r1 r1Var, Context context, int i10, long j3, e6 e6Var) {
        super(context, i10, j3, e6Var, null);
        this.f46073r1 = r1Var;
    }

    @Override
    public final xc getBulletinFactory() {
        e6 e6Var;
        r1 r1Var = this.f46073r1;
        org.telegram.ui.ActionBar.d3 d3Var = r1Var.container;
        e6Var = r1Var.resourcesProvider;
        return new xc(d3Var, e6Var);
    }
}
