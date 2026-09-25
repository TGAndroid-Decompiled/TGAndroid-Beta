package yh;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class c8 extends l8 {
    public final boolean m0;
    public final int f47281n0;
    public final o8 f47282o0;

    public c8(o8 o8Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, int i10) {
        super(context, d6Var);
        this.f47282o0 = o8Var;
        this.m0 = z10;
        this.f47281n0 = i10;
    }

    @Override
    public final void e(int i10) {
        long j3 = i10;
        o8 o8Var = this.f47282o0;
        o8Var.s(j3);
        ci.d dVar = o8Var.f47853x;
        if (dVar != null) {
            dVar.g(w7.V0(false, LocaleController.formatString(R.string.StarsReactionSend, LocaleController.formatNumber(j3, ',')), o8Var.Q), true, true);
        }
        if (this.m0) {
            ai.m1 m1Var = o8Var.G;
            m1Var.f1230g = j3;
            o8Var.H.set(m1Var);
            int i11 = this.f47281n0;
            f(ai.g0.b(i11, i10, 3), ai.g0.b(i11, i10, 4), true);
        }
    }

    @Override
    public final void setValue(int i10) {
        super.setValue(i10);
        if (this.m0) {
            int i11 = this.f47281n0;
            f(ai.g0.b(i11, i10, 3), ai.g0.b(i11, i10, 4), true);
        }
    }
}
