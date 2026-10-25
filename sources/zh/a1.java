package zh;

import android.content.Context;
import bi.h7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.wc;
public final class a1 extends h7 {
    public final p1 B1;

    public a1(p1 p1Var, Context context, int i10, long j10, u6 u6Var) {
        super(context, i10, j10, u6Var, null);
        this.B1 = p1Var;
    }

    @Override
    public final wc getBulletinFactory() {
        u6 u6Var;
        p1 p1Var = this.B1;
        org.telegram.ui.ActionBar.h3 h3Var = p1Var.container;
        u6Var = p1Var.resourcesProvider;
        return new wc(h3Var, u6Var);
    }
}
