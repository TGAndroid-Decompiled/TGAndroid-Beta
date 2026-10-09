package xh;

import android.content.Context;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.ad;
public final class d1 extends yh.s3 {
    public final r1 f51201s1;

    public d1(r1 r1Var, Context context, int i10, long j3, e6 e6Var) {
        super(context, i10, j3, e6Var, null);
        this.f51201s1 = r1Var;
    }

    @Override
    public final ad getBulletinFactory() {
        e6 e6Var;
        r1 r1Var = this.f51201s1;
        org.telegram.ui.ActionBar.d3 d3Var = r1Var.container;
        e6Var = r1Var.resourcesProvider;
        return new ad(d3Var, e6Var);
    }
}
