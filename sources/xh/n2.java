package xh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.ad;
public final class n2 extends yh.s3 {
    public final int f51483s1;
    public final Object f51484t1;

    public n2(o2 o2Var, Context context, int i10, long j3, d6 d6Var, int i11) {
        super(context, i10, j3, d6Var, null);
        this.f51483s1 = i11;
        this.f51484t1 = o2Var;
    }

    @Override
    public int getBottomInset() {
        switch (this.f51483s1) {
            case 3:
                return ((yh.s3) this.f51484t1).getBottomInset();
            default:
                return super.getBottomInset();
        }
    }

    @Override
    public ad getBulletinFactory() {
        switch (this.f51483s1) {
            case 0:
                return ad.a0(((o2) this.f51484t1).f51522a.f51598a);
            case 1:
                return ad.a0(((o2) this.f51484t1).f51522a.f51598a);
            case 2:
                return ad.a0(((o2) this.f51484t1).f51522a.f51598a);
            default:
                return super.getBulletinFactory();
        }
    }

    public n2(yh.s3 s3Var, Context context, int i10, long j3, d6 d6Var, View view) {
        super(context, i10, j3, d6Var, view);
        this.f51483s1 = 3;
        this.f51484t1 = s3Var;
    }
}
