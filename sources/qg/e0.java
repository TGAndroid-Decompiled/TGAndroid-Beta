package qg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.tt0;
public final class e0 extends pg.d1 {
    public final Bitmap E;
    public final tt0 F;

    public e0(tt0 tt0Var, Context context, pg.r0 r0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, r0Var, bitmap, null, null);
        this.F = tt0Var;
        this.E = bitmap2;
    }

    @Override
    public final void g(pg.m mVar) {
        int indexOf = pg.m.f40862a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1 || this.E != null) {
            indexOf = i10;
        }
        tt0 tt0Var = this.F;
        tt0Var.f41498t1.b(indexOf);
        tt0Var.b(mVar);
    }
}
