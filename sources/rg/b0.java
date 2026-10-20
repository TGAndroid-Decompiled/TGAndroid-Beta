package rg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.gt0;
public final class b0 extends qg.f1 {
    public final Bitmap E;
    public final gt0 F;

    public b0(gt0 gt0Var, Context context, qg.t0 t0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, t0Var, bitmap, null, null);
        this.F = gt0Var;
        this.E = bitmap2;
    }

    @Override
    public final void g(qg.m mVar) {
        int indexOf = qg.m.f44561a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1 || this.E != null) {
            indexOf = i10;
        }
        gt0 gt0Var = this.F;
        gt0Var.f45504t1.b(indexOf);
        gt0Var.o(mVar);
    }
}
