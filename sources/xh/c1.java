package xh;

import android.content.Context;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.zc;
public final class c1 extends yh.s3 {
    public final q1 f51423s1;

    public c1(q1 q1Var, Context context, int i10, long j3, c6 c6Var) {
        super(context, i10, j3, c6Var, null);
        this.f51423s1 = q1Var;
    }

    @Override
    public final zc getBulletinFactory() {
        c6 c6Var;
        q1 q1Var = this.f51423s1;
        org.telegram.ui.ActionBar.c3 c3Var = q1Var.container;
        c6Var = q1Var.resourcesProvider;
        return new zc(c3Var, c6Var);
    }
}
