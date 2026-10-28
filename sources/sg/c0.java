package sg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.pt0;
public final class c0 extends rg.c1 {
    public final Bitmap E;
    public final pt0 F;

    public c0(pt0 pt0Var, Context context, rg.q0 q0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, q0Var, bitmap, null, null);
        this.F = pt0Var;
        this.E = bitmap2;
    }

    @Override
    public final void g(rg.m mVar) {
        int indexOf = rg.m.f47500a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1 || this.E != null) {
            indexOf = i10;
        }
        pt0 pt0Var = this.F;
        pt0Var.f48368i1.b(indexOf);
        pt0Var.i(mVar);
    }
}
