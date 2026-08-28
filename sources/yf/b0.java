package yf;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.xs0;
public final class b0 extends xf.c1 {
    public final Bitmap A;
    public final xs0 B;

    public b0(xs0 xs0Var, Context context, xf.q0 q0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, q0Var, bitmap, null, null);
        this.B = xs0Var;
        this.A = bitmap2;
    }

    @Override
    public final void g(xf.m mVar) {
        int indexOf = xf.m.f49272a.indexOf(mVar);
        int i9 = indexOf + 1;
        if (i9 <= 1 || this.A != null) {
            indexOf = i9;
        }
        xs0 xs0Var = this.B;
        xs0Var.f49950p1.b(indexOf);
        xs0Var.n(mVar);
    }
}
