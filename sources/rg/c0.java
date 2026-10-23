package rg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.jt0;
public final class c0 extends qg.e1 {
    public final Bitmap E;
    public final jt0 F;

    public c0(jt0 jt0Var, Context context, qg.s0 s0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, s0Var, bitmap, null, null);
        this.F = jt0Var;
        this.E = bitmap2;
    }

    @Override
    public final void g(qg.m mVar) {
        int indexOf = qg.m.f44984a.indexOf(mVar);
        int i10 = indexOf + 1;
        if (i10 <= 1 || this.E != null) {
            indexOf = i10;
        }
        jt0 jt0Var = this.F;
        jt0Var.f45914t1.b(indexOf);
        jt0Var.n(mVar);
    }
}
