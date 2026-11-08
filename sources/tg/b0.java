package tg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.up0;
public final class b0 extends sg.w0 {
    public final Bitmap E;
    public final up0 F;

    public b0(up0 up0Var, Context context, sg.j0 j0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, j0Var, bitmap, null, null);
        this.F = up0Var;
        this.E = bitmap2;
    }

    @Override
    public final void g(sg.h hVar) {
        int indexOf = sg.h.f55060a.indexOf(hVar);
        int i7 = indexOf + 1;
        if (i7 <= 1 || this.E != null) {
            indexOf = i7;
        }
        up0 up0Var = this.F;
        up0Var.f55668c1.b(indexOf);
        up0Var.w(hVar);
    }
}
