package wh;

import android.content.Context;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.wc;
public final class b1 extends xh.x3 {
    public final p1 f44033r1;

    public b1(p1 p1Var, Context context, int i10, long j3, f6 f6Var) {
        super(context, i10, j3, f6Var, null);
        this.f44033r1 = p1Var;
    }

    @Override
    public final wc getBulletinFactory() {
        f6 f6Var;
        p1 p1Var = this.f44033r1;
        org.telegram.ui.ActionBar.f3 f3Var = p1Var.container;
        f6Var = p1Var.resourcesProvider;
        return new wc(f3Var, f6Var);
    }
}
