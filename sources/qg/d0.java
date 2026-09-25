package qg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.st0;
public final class d0 extends pg.f1 {
    public final Bitmap E;
    public final st0 F;

    public d0(st0 st0Var, Context context, pg.s0 s0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, s0Var, bitmap, null, null);
        this.F = st0Var;
        this.E = bitmap2;
    }

    @Override
    public final void g(pg.m mVar) {
        int indexOf = pg.m.f41170a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1 || this.E != null) {
            indexOf = i10;
        }
        st0 st0Var = this.F;
        st0Var.f41802t1.b(indexOf);
        st0Var.b(mVar);
    }
}
