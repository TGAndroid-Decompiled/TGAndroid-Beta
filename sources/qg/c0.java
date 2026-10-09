package qg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.bu0;
public final class c0 extends pg.e1 {
    public final Bitmap E;
    public final bu0 F;

    public c0(bu0 bu0Var, Context context, pg.s0 s0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, s0Var, bitmap, null, null);
        this.F = bu0Var;
        this.E = bitmap2;
    }

    @Override
    public final void g(pg.m mVar) {
        int indexOf = pg.m.f45686a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1 || this.E != null) {
            indexOf = i10;
        }
        bu0 bu0Var = this.F;
        bu0Var.f46389t1.b(indexOf);
        bu0Var.b(mVar);
    }
}
