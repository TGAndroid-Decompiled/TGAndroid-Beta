package xh;

import android.content.Context;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.xc;
public final class c1 extends yh.y3 {
    public final r1 f45772r1;

    public c1(r1 r1Var, Context context, int i10, long j3, d6 d6Var) {
        super(context, i10, j3, d6Var, null);
        this.f45772r1 = r1Var;
    }

    @Override
    public final xc getBulletinFactory() {
        d6 d6Var;
        r1 r1Var = this.f45772r1;
        org.telegram.ui.ActionBar.d3 d3Var = r1Var.container;
        d6Var = r1Var.resourcesProvider;
        return new xc(d3Var, d6Var);
    }
}
