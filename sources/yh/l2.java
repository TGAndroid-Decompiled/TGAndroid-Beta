package yh;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.zc;
public final class l2 extends zh.r3 {
    public final int f48980s1;
    public final Object f48981t1;

    public l2(m2 m2Var, Context context, int i10, long j10, c6 c6Var, int i11) {
        super(context, i10, j10, c6Var, null);
        this.f48980s1 = i11;
        this.f48981t1 = m2Var;
    }

    @Override
    public int getBottomInset() {
        switch (this.f48980s1) {
            case 3:
                return ((zh.r3) this.f48981t1).getBottomInset();
            default:
                return super.getBottomInset();
        }
    }

    @Override
    public zc getBulletinFactory() {
        switch (this.f48980s1) {
            case 0:
                return zc.a0(((m2) this.f48981t1).f48994a.f49089a);
            case 1:
                return zc.a0(((m2) this.f48981t1).f48994a.f49089a);
            case 2:
                return zc.a0(((m2) this.f48981t1).f48994a.f49089a);
            default:
                return super.getBulletinFactory();
        }
    }

    public l2(zh.r3 r3Var, Context context, int i10, long j10, c6 c6Var, View view) {
        super(context, i10, j10, c6Var, view);
        this.f48980s1 = 3;
        this.f48981t1 = r3Var;
    }
}
