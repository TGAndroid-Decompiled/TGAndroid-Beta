package zh;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class v7 extends e8 {
    public final boolean m0;
    public final int f51257n0;
    public final h8 f51258o0;

    public v7(h8 h8Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, int i10) {
        super(context, c6Var);
        this.f51258o0 = h8Var;
        this.m0 = z10;
        this.f51257n0 = i10;
    }

    @Override
    public final void e(int i10) {
        long j10 = i10;
        h8 h8Var = this.f51258o0;
        h8Var.u(j10);
        di.d dVar = h8Var.f50648x;
        if (dVar != null) {
            dVar.g(p7.W0(false, LocaleController.formatString(R.string.StarsReactionSend, LocaleController.formatNumber(j10, ',')), h8Var.R), true, true);
        }
        if (this.m0) {
            bi.e1 e1Var = h8Var.G;
            e1Var.f2978g = j10;
            h8Var.H.set(e1Var);
            int i11 = this.f51257n0;
            f(bi.z.b(i11, i10, 3), bi.z.b(i11, i10, 4), true);
        }
    }

    @Override
    public final void setValue(int i10) {
        super.setValue(i10);
        if (this.m0) {
            int i11 = this.f51257n0;
            f(bi.z.b(i11, i10, 3), bi.z.b(i11, i10, 4), true);
        }
    }
}
