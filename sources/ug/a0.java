package ug;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.lp0;
public final class a0 extends tg.u0 {
    public final Bitmap F;
    public final lp0 G;

    public a0(lp0 lp0Var, Context context, tg.i0 i0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, i0Var, bitmap, null, null);
        this.G = lp0Var;
        this.F = bitmap2;
    }

    @Override
    public final void g(tg.h hVar) {
        int indexOf = tg.h.f55183a.indexOf(hVar);
        int i3 = indexOf + 1;
        if (i3 <= 1 || this.F != null) {
            indexOf = i3;
        }
        lp0 lp0Var = this.G;
        lp0Var.f55967d1.b(indexOf);
        lp0Var.C(hVar);
    }
}
