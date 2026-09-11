package yh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.yc;
public final class l2 extends zh.w3 {
    public final int f50400r1;
    public final Object f50401s1;

    public l2(m2 m2Var, Context context, int i10, long j3, f6 f6Var, int i11) {
        super(context, i10, j3, f6Var, null);
        this.f50400r1 = i11;
        this.f50401s1 = m2Var;
    }

    @Override
    public int getBottomInset() {
        switch (this.f50400r1) {
            case 3:
                return ((zh.w3) this.f50401s1).getBottomInset();
            default:
                return super.getBottomInset();
        }
    }

    @Override
    public yc getBulletinFactory() {
        switch (this.f50400r1) {
            case 0:
                return yc.a0(((m2) this.f50401s1).f50439a.f50515a);
            case 1:
                return yc.a0(((m2) this.f50401s1).f50439a.f50515a);
            case 2:
                return yc.a0(((m2) this.f50401s1).f50439a.f50515a);
            default:
                return super.getBulletinFactory();
        }
    }

    public l2(zh.w3 w3Var, Context context, int i10, long j3, f6 f6Var, View view) {
        super(context, i10, j3, f6Var, view);
        this.f50400r1 = 3;
        this.f50401s1 = w3Var;
    }
}
