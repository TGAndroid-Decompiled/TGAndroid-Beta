package xh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.xc;
public final class n2 extends yh.y3 {
    public final int f46284r1;
    public final Object f46285s1;

    public n2(o2 o2Var, Context context, int i10, long j3, e6 e6Var, int i11) {
        super(context, i10, j3, e6Var, null);
        this.f46284r1 = i11;
        this.f46285s1 = o2Var;
    }

    @Override
    public int getBottomInset() {
        switch (this.f46284r1) {
            case 3:
                return ((yh.y3) this.f46285s1).getBottomInset();
            default:
                return super.getBottomInset();
        }
    }

    @Override
    public xc getBulletinFactory() {
        switch (this.f46284r1) {
            case 0:
                return xc.a0(((o2) this.f46285s1).f46300a.f46369a);
            case 1:
                return xc.a0(((o2) this.f46285s1).f46300a.f46369a);
            case 2:
                return xc.a0(((o2) this.f46285s1).f46300a.f46369a);
            default:
                return super.getBulletinFactory();
        }
    }

    public n2(yh.y3 y3Var, Context context, int i10, long j3, e6 e6Var, View view) {
        super(context, i10, j3, e6Var, view);
        this.f46284r1 = 3;
        this.f46285s1 = y3Var;
    }
}
