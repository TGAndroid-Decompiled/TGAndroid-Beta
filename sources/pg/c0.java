package pg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.zt0;
public final class c0 extends og.h1 {
    public final Bitmap E;
    public final zt0 F;

    public c0(zt0 zt0Var, Context context, og.v0 v0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, v0Var, bitmap, null, null);
        this.F = zt0Var;
        this.E = bitmap2;
    }

    @Override
    public final void g(og.m mVar) {
        int indexOf = og.m.f14420a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1 || this.E != null) {
            indexOf = i10;
        }
        zt0 zt0Var = this.F;
        zt0Var.f40154t1.b(indexOf);
        zt0Var.B(mVar);
    }
}
