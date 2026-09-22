package qg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.au0;
public final class e0 extends pg.c1 {
    public final Bitmap E;
    public final au0 F;

    public e0(au0 au0Var, Context context, pg.q0 q0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, q0Var, bitmap, null, null);
        this.F = au0Var;
        this.E = bitmap2;
    }

    @Override
    public final void g(pg.m mVar) {
        int indexOf = pg.m.f40908a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1 || this.E != null) {
            indexOf = i10;
        }
        au0 au0Var = this.F;
        au0Var.f41542t1.b(indexOf);
        au0Var.b(mVar);
    }
}
