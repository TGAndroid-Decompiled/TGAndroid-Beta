package yh;

import ai.k7;
import android.content.Context;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.xc;
public final class a1 extends k7 {
    public final o1 B1;

    public a1(o1 o1Var, Context context, int i10, long j10, d6 d6Var) {
        super(context, i10, j10, d6Var, null);
        this.B1 = o1Var;
    }

    @Override
    public final xc getBulletinFactory() {
        d6 d6Var;
        o1 o1Var = this.B1;
        org.telegram.ui.ActionBar.d3 d3Var = o1Var.container;
        d6Var = o1Var.resourcesProvider;
        return new xc(d3Var, d6Var);
    }
}
