package xh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.xc;
public final class o2 extends yh.x3 {
    public final int f46394r1;
    public final Object f46395s1;

    public o2(p2 p2Var, Context context, int i10, long j3, e6 e6Var, int i11) {
        super(context, i10, j3, e6Var, null);
        this.f46394r1 = i11;
        this.f46395s1 = p2Var;
    }

    @Override
    public int getBottomInset() {
        switch (this.f46394r1) {
            case 3:
                return ((yh.x3) this.f46395s1).getBottomInset();
            default:
                return super.getBottomInset();
        }
    }

    @Override
    public xc getBulletinFactory() {
        switch (this.f46394r1) {
            case 0:
                return xc.a0(((p2) this.f46395s1).f46405a.f46469a);
            case 1:
                return xc.a0(((p2) this.f46395s1).f46405a.f46469a);
            case 2:
                return xc.a0(((p2) this.f46395s1).f46405a.f46469a);
            default:
                return super.getBulletinFactory();
        }
    }

    public o2(yh.x3 x3Var, Context context, int i10, long j3, e6 e6Var, View view) {
        super(context, i10, j3, e6Var, view);
        this.f46394r1 = 3;
        this.f46395s1 = x3Var;
    }
}
