package xh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.yc;
public final class n2 extends yh.x3 {
    public final int f50132r1;
    public final Object f50133s1;

    public n2(o2 o2Var, Context context, int i10, long j3, d6 d6Var, int i11) {
        super(context, i10, j3, d6Var, null);
        this.f50132r1 = i11;
        this.f50133s1 = o2Var;
    }

    @Override
    public int getBottomInset() {
        switch (this.f50132r1) {
            case 3:
                return ((yh.x3) this.f50133s1).getBottomInset();
            default:
                return super.getBottomInset();
        }
    }

    @Override
    public yc getBulletinFactory() {
        switch (this.f50132r1) {
            case 0:
                return yc.a0(((o2) this.f50133s1).f50144a.f50217a);
            case 1:
                return yc.a0(((o2) this.f50133s1).f50144a.f50217a);
            case 2:
                return yc.a0(((o2) this.f50133s1).f50144a.f50217a);
            default:
                return super.getBulletinFactory();
        }
    }

    public n2(yh.x3 x3Var, Context context, int i10, long j3, d6 d6Var, View view) {
        super(context, i10, j3, d6Var, view);
        this.f50132r1 = 3;
        this.f50133s1 = x3Var;
    }
}
