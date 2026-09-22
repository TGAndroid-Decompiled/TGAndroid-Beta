package qg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.au0;
public final class d0 extends pg.f1 {
    public final Bitmap E;
    public final au0 F;

    public d0(au0 au0Var, Context context, pg.s0 s0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, s0Var, bitmap, null, null);
        this.F = au0Var;
        this.E = bitmap2;
    }

    @Override
    public final void g(pg.m mVar) {
        int indexOf = pg.m.f41218a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1 || this.E != null) {
            indexOf = i10;
        }
        au0 au0Var = this.F;
        au0Var.f41836t1.b(indexOf);
        au0Var.b(mVar);
    }
}
