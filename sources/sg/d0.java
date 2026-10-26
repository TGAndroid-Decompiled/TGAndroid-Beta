package sg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.nt0;
public final class d0 extends rg.c1 {
    public final Bitmap E;
    public final nt0 F;

    public d0(nt0 nt0Var, Context context, rg.q0 q0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, q0Var, bitmap, null, null);
        this.F = nt0Var;
        this.E = bitmap2;
    }

    @Override
    public final void g(rg.m mVar) {
        int indexOf = rg.m.f47465a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1 || this.E != null) {
            indexOf = i10;
        }
        nt0 nt0Var = this.F;
        nt0Var.f48342i1.b(indexOf);
        nt0Var.i(mVar);
    }
}
