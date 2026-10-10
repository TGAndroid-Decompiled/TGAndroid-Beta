package xh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.ad;
public final class n2 extends yh.s3 {
    public final int f51440s1;
    public final Object f51441t1;

    public n2(o2 o2Var, Context context, int i10, long j3, e6 e6Var, int i11) {
        super(context, i10, j3, e6Var, null);
        this.f51440s1 = i11;
        this.f51441t1 = o2Var;
    }

    @Override
    public int getBottomInset() {
        switch (this.f51440s1) {
            case 3:
                return ((yh.s3) this.f51441t1).getBottomInset();
            default:
                return super.getBottomInset();
        }
    }

    @Override
    public ad getBulletinFactory() {
        switch (this.f51440s1) {
            case 0:
                return ad.a0(((o2) this.f51441t1).f51479a.f51555a);
            case 1:
                return ad.a0(((o2) this.f51441t1).f51479a.f51555a);
            case 2:
                return ad.a0(((o2) this.f51441t1).f51479a.f51555a);
            default:
                return super.getBulletinFactory();
        }
    }

    public n2(yh.s3 s3Var, Context context, int i10, long j3, e6 e6Var, View view) {
        super(context, i10, j3, e6Var, view);
        this.f51440s1 = 3;
        this.f51441t1 = s3Var;
    }
}
