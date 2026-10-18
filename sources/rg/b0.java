package rg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.it0;
public final class b0 extends qg.e1 {
    public final Bitmap E;
    public final it0 F;

    public b0(it0 it0Var, Context context, qg.s0 s0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, s0Var, bitmap, null, null);
        this.F = it0Var;
        this.E = bitmap2;
    }

    @Override
    public final void g(qg.m mVar) {
        int indexOf = qg.m.f44605a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1 || this.E != null) {
            indexOf = i10;
        }
        it0 it0Var = this.F;
        it0Var.f45543t1.b(indexOf);
        it0Var.o(mVar);
    }
}
