package rh;

import android.content.Context;
import org.telegram.messenger.cd;
public final class n8 extends v8 {
    public final boolean m0;
    public final int f47267n0;
    public final y8 f47268o0;

    public n8(y8 y8Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10, int i10) {
        super(context, p6Var);
        this.f47268o0 = y8Var;
        this.m0 = z10;
        this.f47267n0 = i10;
    }

    @Override
    public final void e(int i10) {
        long j10 = i10;
        y8 y8Var = this.f47268o0;
        y8Var.N0(j10);
        vh.d dVar = y8Var.f47778t1;
        if (dVar != null) {
            dVar.i(h8.X0(false, cd.a0(null, null, 2131745065, cd.E(j10, ',')), y8Var.J1), true, true);
        }
        if (this.m0) {
            th.h0 h0Var = y8Var.f47782x1;
            h0Var.f49010g = j10;
            y8Var.f47783y1.set(h0Var);
            int i11 = this.f47267n0;
            f(th.o.b(i11, i10, 3), th.o.b(i11, i10, 4), true);
        }
    }

    @Override
    public final void setValue(int i10) {
        super.setValue(i10);
        if (this.m0) {
            int i11 = this.f47267n0;
            f(th.o.b(i11, i10, 3), th.o.b(i11, i10, 4), true);
        }
    }
}
