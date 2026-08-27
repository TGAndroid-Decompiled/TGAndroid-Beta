package zf;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.ys0;

public final class b0 extends yf.b1 {
    public final Bitmap A;
    public final ys0 B;

    public b0(ys0 ys0Var, Context context, yf.p0 p0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, p0Var, bitmap, null, null);
        this.B = ys0Var;
        this.A = bitmap2;
    }

    @Override
    public final void g(yf.m mVar) {
        int iIndexOf = yf.m.f49979a.indexOf(mVar);
        int i10 = iIndexOf + 1;
        if (i10 <= 1 || this.A != null) {
            iIndexOf = i10;
        }
        ys0 ys0Var = this.B;
        ys0Var.f50528p1.b(iIndexOf);
        ys0Var.l(mVar);
    }
}
