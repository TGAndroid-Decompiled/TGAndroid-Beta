package xh;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class f8 extends o8 {
    public final boolean m0;
    public final int f45425n0;
    public final r8 f45426o0;

    public f8(r8 r8Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, int i10) {
        super(context, f6Var);
        this.f45426o0 = r8Var;
        this.m0 = z10;
        this.f45425n0 = i10;
    }

    @Override
    public final void e(int i10) {
        long j3 = i10;
        r8 r8Var = this.f45426o0;
        r8Var.s(j3);
        bi.d dVar = r8Var.f45995x;
        if (dVar != null) {
            dVar.g(z7.V0(false, LocaleController.formatString(R.string.StarsReactionSend, LocaleController.formatNumber(j3, ',')), r8Var.Q), true, true);
        }
        if (this.m0) {
            zh.k0 k0Var = r8Var.G;
            k0Var.f48579g = j3;
            r8Var.H.set(k0Var);
            int i11 = this.f45425n0;
            f(zh.o.b(i11, i10, 3), zh.o.b(i11, i10, 4), true);
        }
    }

    @Override
    public final void setValue(int i10) {
        super.setValue(i10);
        if (this.m0) {
            int i11 = this.f45425n0;
            f(zh.o.b(i11, i10, 3), zh.o.b(i11, i10, 4), true);
        }
    }
}
