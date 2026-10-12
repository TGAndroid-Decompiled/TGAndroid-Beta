package rg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.hu0;
public final class d0 extends qg.c1 {
    public final Bitmap E;
    public final hu0 F;

    public d0(hu0 hu0Var, Context context, qg.q0 q0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, q0Var, bitmap, null, null);
        this.F = hu0Var;
        this.E = bitmap2;
    }

    @Override
    public final void g(qg.m mVar) {
        int indexOf = qg.m.f43485a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1 || this.E != null) {
            indexOf = i10;
        }
        hu0 hu0Var = this.F;
        hu0Var.f44431t1.b(indexOf);
        hu0Var.o(mVar);
    }
}
