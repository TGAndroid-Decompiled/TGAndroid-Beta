package yh;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class v7 extends e8 {
    public final boolean m0;
    public final int f53321n0;
    public final h8 f53322o0;

    public v7(h8 h8Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, int i10) {
        super(context, e6Var);
        this.f53322o0 = h8Var;
        this.m0 = z10;
        this.f53321n0 = i10;
    }

    @Override
    public final void e(int i10) {
        long j3 = i10;
        h8 h8Var = this.f53322o0;
        h8Var.u(j3);
        ci.d dVar = h8Var.f52656x;
        if (dVar != null) {
            dVar.g(p7.W0(false, LocaleController.formatString(R.string.StarsReactionSend, LocaleController.formatNumber(j3, ',')), h8Var.R), true, true);
        }
        if (this.m0) {
            ai.m1 m1Var = h8Var.G;
            m1Var.f1385g = j3;
            h8Var.H.set(m1Var);
            int i11 = this.f53321n0;
            f(ai.g0.b(i11, i10, 3), ai.g0.b(i11, i10, 4), true);
        }
    }

    @Override
    public final void setValue(int i10) {
        super.setValue(i10);
        if (this.m0) {
            int i11 = this.f53321n0;
            f(ai.g0.b(i11, i10, 3), ai.g0.b(i11, i10, 4), true);
        }
    }
}
