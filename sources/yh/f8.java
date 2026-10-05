package yh;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class f8 extends o8 {
    public final boolean m0;
    public final int f51308n0;
    public final r8 f51309o0;

    public f8(r8 r8Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, int i10) {
        super(context, d6Var);
        this.f51309o0 = r8Var;
        this.m0 = z10;
        this.f51308n0 = i10;
    }

    @Override
    public final void e(int i10) {
        long j3 = i10;
        r8 r8Var = this.f51309o0;
        r8Var.s(j3);
        ci.d dVar = r8Var.f51946x;
        if (dVar != null) {
            dVar.g(z7.b1(false, LocaleController.formatString(R.string.StarsReactionSend, LocaleController.formatNumber(j3, ',')), r8Var.Q), true, true);
        }
        if (this.m0) {
            ai.m1 m1Var = r8Var.G;
            m1Var.f1330g = j3;
            r8Var.H.set(m1Var);
            int i11 = this.f51308n0;
            f(ai.g0.b(i11, i10, 3), ai.g0.b(i11, i10, 4), true);
        }
    }

    @Override
    public final void setValue(int i10) {
        super.setValue(i10);
        if (this.m0) {
            int i11 = this.f51308n0;
            f(ai.g0.b(i11, i10, 3), ai.g0.b(i11, i10, 4), true);
        }
    }
}
