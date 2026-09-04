package yh;

import android.content.Context;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.yc;
public final class b1 extends zh.w3 {
    public final p1 f50210r1;

    public b1(p1 p1Var, Context context, int i10, long j3, f6 f6Var) {
        super(context, i10, j3, f6Var, null);
        this.f50210r1 = p1Var;
    }

    @Override
    public final yc getBulletinFactory() {
        f6 f6Var;
        p1 p1Var = this.f50210r1;
        org.telegram.ui.ActionBar.d3 d3Var = p1Var.container;
        f6Var = p1Var.resourcesProvider;
        return new yc(d3Var, f6Var);
    }
}
