package xh;

import android.content.Context;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.ad;
public final class d1 extends yh.s3 {
    public final r1 f51322s1;

    public d1(r1 r1Var, Context context, int i10, long j3, d6 d6Var) {
        super(context, i10, j3, d6Var, null);
        this.f51322s1 = r1Var;
    }

    @Override
    public final ad getBulletinFactory() {
        d6 d6Var;
        r1 r1Var = this.f51322s1;
        org.telegram.ui.ActionBar.c3 c3Var = r1Var.container;
        d6Var = r1Var.resourcesProvider;
        return new ad(c3Var, d6Var);
    }
}
