package xh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.zc;
public final class m2 extends yh.s3 {
    public final int f51615s1;
    public final Object f51616t1;

    public m2(n2 n2Var, Context context, int i10, long j3, c6 c6Var, int i11) {
        super(context, i10, j3, c6Var, null);
        this.f51615s1 = i11;
        this.f51616t1 = n2Var;
    }

    @Override
    public int getBottomInset() {
        switch (this.f51615s1) {
            case 3:
                return ((yh.s3) this.f51616t1).getBottomInset();
            default:
                return super.getBottomInset();
        }
    }

    @Override
    public zc getBulletinFactory() {
        switch (this.f51615s1) {
            case 0:
                return zc.a0(((n2) this.f51616t1).f51630a.f51729a);
            case 1:
                return zc.a0(((n2) this.f51616t1).f51630a.f51729a);
            case 2:
                return zc.a0(((n2) this.f51616t1).f51630a.f51729a);
            default:
                return super.getBulletinFactory();
        }
    }

    public m2(yh.s3 s3Var, Context context, int i10, long j3, c6 c6Var, View view) {
        super(context, i10, j3, c6Var, view);
        this.f51615s1 = 3;
        this.f51616t1 = s3Var;
    }
}
