package tg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.vp0;
public final class c0 extends sg.u0 {
    public final Bitmap F;
    public final vp0 G;

    public c0(vp0 vp0Var, Context context, sg.i0 i0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, i0Var, bitmap, null, null);
        this.G = vp0Var;
        this.F = bitmap2;
    }

    @Override
    public final void g(sg.h hVar) {
        int indexOf = sg.h.f57255a.indexOf(hVar);
        int i7 = indexOf + 1;
        if (i7 <= 1 || this.F != null) {
            indexOf = i7;
        }
        vp0 vp0Var = this.G;
        vp0Var.f57907d1.b(indexOf);
        vp0Var.w(hVar);
    }
}
