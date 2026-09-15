package yh;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class e8 extends n8 {
    public final boolean m0;
    public final int f47127n0;
    public final q8 f47128o0;

    public e8(q8 q8Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, int i10) {
        super(context, e6Var);
        this.f47128o0 = q8Var;
        this.m0 = z10;
        this.f47127n0 = i10;
    }

    @Override
    public final void e(int i10) {
        long j3 = i10;
        q8 q8Var = this.f47128o0;
        q8Var.s(j3);
        ci.d dVar = q8Var.f47684x;
        if (dVar != null) {
            dVar.g(y7.V0(false, LocaleController.formatString(R.string.StarsReactionSend, LocaleController.formatNumber(j3, ',')), q8Var.Q), true, true);
        }
        if (this.m0) {
            ai.m1 m1Var = q8Var.G;
            m1Var.f1226g = j3;
            q8Var.H.set(m1Var);
            int i11 = this.f47127n0;
            f(ai.g0.b(i11, i10, 3), ai.g0.b(i11, i10, 4), true);
        }
    }

    @Override
    public final void setValue(int i10) {
        super.setValue(i10);
        if (this.m0) {
            int i11 = this.f47127n0;
            f(ai.g0.b(i11, i10, 3), ai.g0.b(i11, i10, 4), true);
        }
    }
}
