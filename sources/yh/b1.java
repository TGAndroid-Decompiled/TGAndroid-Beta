package yh;

import android.content.Context;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.zc;
public final class b1 extends zh.r3 {
    public final p1 f48797s1;

    public b1(p1 p1Var, Context context, int i10, long j10, c6 c6Var) {
        super(context, i10, j10, c6Var, null);
        this.f48797s1 = p1Var;
    }

    @Override
    public final zc getBulletinFactory() {
        c6 c6Var;
        p1 p1Var = this.f48797s1;
        org.telegram.ui.ActionBar.c3 c3Var = p1Var.container;
        c6Var = p1Var.resourcesProvider;
        return new zc(c3Var, c6Var);
    }
}
