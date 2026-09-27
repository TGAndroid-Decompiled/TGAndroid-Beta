package yh;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class b8 extends k8 {
    public final boolean m0;
    public final int f47295n0;
    public final n8 f47296o0;

    public b8(n8 n8Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, int i10) {
        super(context, e6Var);
        this.f47296o0 = n8Var;
        this.m0 = z10;
        this.f47295n0 = i10;
    }

    @Override
    public final void e(int i10) {
        long j3 = i10;
        n8 n8Var = this.f47296o0;
        n8Var.s(j3);
        ci.d dVar = n8Var.f47843x;
        if (dVar != null) {
            dVar.g(v7.V0(false, LocaleController.formatString(R.string.StarsReactionSend, LocaleController.formatNumber(j3, ',')), n8Var.Q), true, true);
        }
        if (this.m0) {
            ai.m1 m1Var = n8Var.G;
            m1Var.f1232g = j3;
            n8Var.H.set(m1Var);
            int i11 = this.f47295n0;
            f(ai.g0.b(i11, i10, 3), ai.g0.b(i11, i10, 4), true);
        }
    }

    @Override
    public final void setValue(int i10) {
        super.setValue(i10);
        if (this.m0) {
            int i11 = this.f47295n0;
            f(ai.g0.b(i11, i10, 3), ai.g0.b(i11, i10, 4), true);
        }
    }
}
