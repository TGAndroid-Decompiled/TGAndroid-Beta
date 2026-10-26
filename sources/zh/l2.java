package zh;

import android.content.Context;
import android.view.View;
import bi.h7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.wc;
public final class l2 extends h7 {
    public final int B1;
    public final Object C1;

    public l2(m2 m2Var, Context context, int i10, long j10, u6 u6Var, int i11) {
        super(context, i10, j10, u6Var, null);
        this.B1 = i11;
        this.C1 = m2Var;
    }

    @Override
    public int getBottomInset() {
        switch (this.B1) {
            case 3:
                return ((h7) this.C1).getBottomInset();
            default:
                return super.getBottomInset();
        }
    }

    @Override
    public wc getBulletinFactory() {
        switch (this.B1) {
            case 0:
                return wc.b0(((m2) this.C1).f53143a.f53230a);
            case 1:
                return wc.b0(((m2) this.C1).f53143a.f53230a);
            case 2:
                return wc.b0(((m2) this.C1).f53143a.f53230a);
            default:
                return super.getBulletinFactory();
        }
    }

    public l2(h7 h7Var, Context context, int i10, long j10, u6 u6Var, View view) {
        super(context, i10, j10, u6Var, view);
        this.B1 = 3;
        this.C1 = h7Var;
    }
}
