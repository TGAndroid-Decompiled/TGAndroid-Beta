package qg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.cu0;
public final class c0 extends pg.d1 {
    public final Bitmap E;
    public final cu0 F;

    public c0(cu0 cu0Var, Context context, pg.r0 r0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, r0Var, bitmap, null, null);
        this.F = cu0Var;
        this.E = bitmap2;
    }

    @Override
    public final void g(pg.m mVar) {
        int indexOf = pg.m.f45582a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1 || this.E != null) {
            indexOf = i10;
        }
        cu0 cu0Var = this.F;
        cu0Var.f46328t1.b(indexOf);
        cu0Var.b(mVar);
    }
}
