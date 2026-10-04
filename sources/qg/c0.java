package qg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.vt0;
public final class c0 extends pg.f1 {
    public final Bitmap E;
    public final vt0 F;

    public c0(vt0 vt0Var, Context context, pg.s0 s0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, s0Var, bitmap, null, null);
        this.F = vt0Var;
        this.E = bitmap2;
    }

    @Override
    public final void g(pg.m mVar) {
        int indexOf = pg.m.f44526a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1 || this.E != null) {
            indexOf = i10;
        }
        vt0 vt0Var = this.F;
        vt0Var.f45186t1.b(indexOf);
        vt0Var.b(mVar);
    }
}
