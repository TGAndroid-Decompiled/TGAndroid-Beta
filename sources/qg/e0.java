package qg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.cu0;
public final class e0 extends pg.c1 {
    public final Bitmap E;
    public final cu0 F;

    public e0(cu0 cu0Var, Context context, pg.q0 q0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, q0Var, bitmap, null, null);
        this.F = cu0Var;
        this.E = bitmap2;
    }

    @Override
    public final void g(pg.m mVar) {
        int indexOf = pg.m.f40934a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1 || this.E != null) {
            indexOf = i10;
        }
        cu0 cu0Var = this.F;
        cu0Var.f41568t1.b(indexOf);
        cu0Var.b(mVar);
    }
}
