package rg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.gu0;
public final class d0 extends qg.c1 {
    public final Bitmap E;
    public final gu0 F;

    public d0(gu0 gu0Var, Context context, qg.q0 q0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, q0Var, bitmap, null, null);
        this.F = gu0Var;
        this.E = bitmap2;
    }

    @Override
    public final void g(qg.m mVar) {
        int indexOf = qg.m.f43227a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1 || this.E != null) {
            indexOf = i10;
        }
        gu0 gu0Var = this.F;
        gu0Var.f44190t1.b(indexOf);
        gu0Var.o(mVar);
    }
}
