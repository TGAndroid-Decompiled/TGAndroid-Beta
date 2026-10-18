package yh;

import ai.k7;
import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.xc;
public final class k2 extends k7 {
    public final int B1;
    public final Object C1;

    public k2(l2 l2Var, Context context, int i10, long j10, d6 d6Var, int i11) {
        super(context, i10, j10, d6Var, null);
        this.B1 = i11;
        this.C1 = l2Var;
    }

    @Override
    public int getBottomInset() {
        switch (this.B1) {
            case 3:
                return ((k7) this.C1).getBottomInset();
            default:
                return super.getBottomInset();
        }
    }

    @Override
    public xc getBulletinFactory() {
        switch (this.B1) {
            case 0:
                return xc.a0(((l2) this.C1).f50359a.f50457a);
            case 1:
                return xc.a0(((l2) this.C1).f50359a.f50457a);
            case 2:
                return xc.a0(((l2) this.C1).f50359a.f50457a);
            default:
                return super.getBulletinFactory();
        }
    }

    public k2(k7 k7Var, Context context, int i10, long j10, d6 d6Var, View view) {
        super(context, i10, j10, d6Var, view);
        this.B1 = 3;
        this.C1 = k7Var;
    }
}
