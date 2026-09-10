package wh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.wc;
public final class l2 extends xh.x3 {
    public final int f44206r1;
    public final Object f44207s1;

    public l2(m2 m2Var, Context context, int i10, long j3, f6 f6Var, int i11) {
        super(context, i10, j3, f6Var, null);
        this.f44206r1 = i11;
        this.f44207s1 = m2Var;
    }

    @Override
    public int getBottomInset() {
        switch (this.f44206r1) {
            case 3:
                return ((xh.x3) this.f44207s1).getBottomInset();
            default:
                return super.getBottomInset();
        }
    }

    @Override
    public wc getBulletinFactory() {
        switch (this.f44206r1) {
            case 0:
                return wc.a0(((m2) this.f44207s1).f44246a.f44317a);
            case 1:
                return wc.a0(((m2) this.f44207s1).f44246a.f44317a);
            case 2:
                return wc.a0(((m2) this.f44207s1).f44246a.f44317a);
            default:
                return super.getBulletinFactory();
        }
    }

    public l2(xh.x3 x3Var, Context context, int i10, long j3, f6 f6Var, View view) {
        super(context, i10, j3, f6Var, view);
        this.f44206r1 = 3;
        this.f44207s1 = x3Var;
    }
}
