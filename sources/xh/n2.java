package xh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.xc;
public final class n2 extends yh.y3 {
    public final int f46331r1;
    public final Object f46332s1;

    public n2(o2 o2Var, Context context, int i10, long j3, f6 f6Var, int i11) {
        super(context, i10, j3, f6Var, null);
        this.f46331r1 = i11;
        this.f46332s1 = o2Var;
    }

    @Override
    public int getBottomInset() {
        switch (this.f46331r1) {
            case 3:
                return ((yh.y3) this.f46332s1).getBottomInset();
            default:
                return super.getBottomInset();
        }
    }

    @Override
    public xc getBulletinFactory() {
        switch (this.f46331r1) {
            case 0:
                return xc.a0(((o2) this.f46332s1).f46347a.f46416a);
            case 1:
                return xc.a0(((o2) this.f46332s1).f46347a.f46416a);
            case 2:
                return xc.a0(((o2) this.f46332s1).f46347a.f46416a);
            default:
                return super.getBulletinFactory();
        }
    }

    public n2(yh.y3 y3Var, Context context, int i10, long j3, f6 f6Var, View view) {
        super(context, i10, j3, f6Var, view);
        this.f46331r1 = 3;
        this.f46332s1 = y3Var;
    }
}
