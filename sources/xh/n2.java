package xh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.xc;
public final class n2 extends yh.x3 {
    public final int f46312r1;
    public final Object f46313s1;

    public n2(o2 o2Var, Context context, int i10, long j3, d6 d6Var, int i11) {
        super(context, i10, j3, d6Var, null);
        this.f46312r1 = i11;
        this.f46313s1 = o2Var;
    }

    @Override
    public int getBottomInset() {
        switch (this.f46312r1) {
            case 3:
                return ((yh.x3) this.f46313s1).getBottomInset();
            default:
                return super.getBottomInset();
        }
    }

    @Override
    public xc getBulletinFactory() {
        switch (this.f46312r1) {
            case 0:
                return xc.a0(((o2) this.f46313s1).f46328a.f46397a);
            case 1:
                return xc.a0(((o2) this.f46313s1).f46328a.f46397a);
            case 2:
                return xc.a0(((o2) this.f46313s1).f46328a.f46397a);
            default:
                return super.getBulletinFactory();
        }
    }

    public n2(yh.x3 x3Var, Context context, int i10, long j3, d6 d6Var, View view) {
        super(context, i10, j3, d6Var, view);
        this.f46312r1 = 3;
        this.f46313s1 = x3Var;
    }
}
