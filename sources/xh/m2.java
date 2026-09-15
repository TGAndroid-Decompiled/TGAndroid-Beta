package xh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.vc;
public final class m2 extends yh.a4 {
    public final int f46020r1;
    public final Object f46021s1;

    public m2(n2 n2Var, Context context, int i10, long j3, e6 e6Var, int i11) {
        super(context, i10, j3, e6Var, null);
        this.f46020r1 = i11;
        this.f46021s1 = n2Var;
    }

    @Override
    public int getBottomInset() {
        switch (this.f46020r1) {
            case 3:
                return ((yh.a4) this.f46021s1).getBottomInset();
            default:
                return super.getBottomInset();
        }
    }

    @Override
    public vc getBulletinFactory() {
        switch (this.f46020r1) {
            case 0:
                return vc.a0(((n2) this.f46021s1).f46034a.f46105a);
            case 1:
                return vc.a0(((n2) this.f46021s1).f46034a.f46105a);
            case 2:
                return vc.a0(((n2) this.f46021s1).f46034a.f46105a);
            default:
                return super.getBulletinFactory();
        }
    }

    public m2(yh.a4 a4Var, Context context, int i10, long j3, e6 e6Var, View view) {
        super(context, i10, j3, e6Var, view);
        this.f46020r1 = 3;
        this.f46021s1 = a4Var;
    }
}
