package rh;

import android.content.Context;
import org.telegram.messenger.j20;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
public final class t extends p51 {
    public final int P;

    public t(tk0 tk0Var, Context context, int i10, int i11, boolean z10, j20 j20Var, org.telegram.ui.ActionBar.p6 p6Var, int i12) {
        super(tk0Var, context, i10, i11, z10, j20Var, p6Var);
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
                if (i10 == org.telegram.ui.ActionBar.t6.f21019i5) {
                    return -15921907;
                }
                return org.telegram.ui.ActionBar.t6.w0(i10, this.f29298x);
            default:
                return super.I(i10);
        }
    }
}
