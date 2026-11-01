package rh;

import android.content.Context;
import org.telegram.messenger.k20;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
public final class t extends q51 {
    public final int P;

    public t(uk0 uk0Var, Context context, int i10, int i11, boolean z10, k20 k20Var, org.telegram.ui.ActionBar.p6 p6Var, int i12) {
        super(uk0Var, context, i10, i11, z10, k20Var, p6Var);
        this.P = i12;
    }

    @Override
    public boolean D(s4.c1 c1Var) {
        switch (this.P) {
            case 0:
                return false;
            default:
                return super.D(c1Var);
        }
    }

    @Override
    public int I(int i10) {
        switch (this.P) {
            case 1:
                if (i10 == org.telegram.ui.ActionBar.t6.f21020i5) {
                    return -15921907;
                }
                return org.telegram.ui.ActionBar.t6.w0(i10, this.f29641x);
            default:
                return super.I(i10);
        }
    }
}
