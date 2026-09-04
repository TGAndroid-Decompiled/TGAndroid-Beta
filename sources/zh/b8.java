package zh;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class b8 extends k8 {
    public final boolean m0;
    public final int f51724n0;
    public final n8 f51725o0;

    public b8(n8 n8Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10, int i10) {
        super(context, f6Var);
        this.f51725o0 = n8Var;
        this.m0 = z10;
        this.f51724n0 = i10;
    }

    @Override
    public final void e(int i10) {
        long j3 = i10;
        n8 n8Var = this.f51725o0;
        n8Var.s(j3);
        di.d dVar = n8Var.f52344x;
        if (dVar != null) {
            dVar.g(v7.V0(false, LocaleController.formatString(R.string.StarsReactionSend, LocaleController.formatNumber(j3, ',')), n8Var.Q), true, true);
        }
        if (this.m0) {
            bi.e1 e1Var = n8Var.G;
            e1Var.f2903g = j3;
            n8Var.H.set(e1Var);
            int i11 = this.f51724n0;
            f(bi.z.b(i11, i10, 3), bi.z.b(i11, i10, 4), true);
        }
    }

    @Override
    public final void setValue(int i10) {
        super.setValue(i10);
        if (this.m0) {
            int i11 = this.f51724n0;
            f(bi.z.b(i11, i10, 3), bi.z.b(i11, i10, 4), true);
        }
    }
}
