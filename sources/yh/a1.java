package yh;

import ai.l7;
import android.content.Context;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.xc;
public final class a1 extends l7 {
    public final o1 B1;

    public a1(o1 o1Var, Context context, int i10, long j10, g6 g6Var) {
        super(context, i10, j10, g6Var, null);
        this.B1 = o1Var;
    }

    @Override
    public final xc getBulletinFactory() {
        g6 g6Var;
        o1 o1Var = this.B1;
        org.telegram.ui.ActionBar.e3 e3Var = o1Var.container;
        g6Var = o1Var.resourcesProvider;
        return new xc(e3Var, g6Var);
    }
}
