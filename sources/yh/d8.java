package yh;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class d8 extends m8 {
    public final boolean m0;
    public final int f47027n0;
    public final p8 f47028o0;

    public d8(p8 p8Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, int i10) {
        super(context, e6Var);
        this.f47028o0 = p8Var;
        this.m0 = z10;
        this.f47027n0 = i10;
    }

    @Override
    public final void e(int i10) {
        long j3 = i10;
        p8 p8Var = this.f47028o0;
        p8Var.s(j3);
        ci.d dVar = p8Var.f47587x;
        if (dVar != null) {
            dVar.g(x7.V0(false, LocaleController.formatString(R.string.StarsReactionSend, LocaleController.formatNumber(j3, ',')), p8Var.Q), true, true);
        }
        if (this.m0) {
            ai.m1 m1Var = p8Var.G;
            m1Var.f1228g = j3;
            p8Var.H.set(m1Var);
            int i11 = this.f47027n0;
            f(ai.g0.b(i11, i10, 3), ai.g0.b(i11, i10, 4), true);
        }
    }

    @Override
    public final void setValue(int i10) {
        super.setValue(i10);
        if (this.m0) {
            int i11 = this.f47027n0;
            f(ai.g0.b(i11, i10, 3), ai.g0.b(i11, i10, 4), true);
        }
    }
}
