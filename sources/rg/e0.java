package rg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.zt0;
public final class e0 extends qg.c1 {
    public final Bitmap E;
    public final zt0 F;

    public e0(zt0 zt0Var, Context context, qg.q0 q0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, q0Var, bitmap, null, null);
        this.F = zt0Var;
        this.E = bitmap2;
    }

    @Override
    public final void g(qg.m mVar) {
        int indexOf = qg.m.f44480a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1 || this.E != null) {
            indexOf = i10;
        }
        zt0 zt0Var = this.F;
        zt0Var.f45369t1.b(indexOf);
        zt0Var.o(mVar);
    }
}
