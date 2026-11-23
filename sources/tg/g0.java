package tg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.vp0;
public final class g0 extends sg.t0 {
    public final Bitmap F;
    public final vp0 G;

    public g0(vp0 vp0Var, Context context, sg.h0 h0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, h0Var, bitmap, null, null);
        this.G = vp0Var;
        this.F = bitmap2;
    }

    @Override
    public final void g(sg.h hVar) {
        int indexOf = sg.h.f57338a.indexOf(hVar);
        int i7 = indexOf + 1;
        if (i7 <= 1 || this.F != null) {
            indexOf = i7;
        }
        vp0 vp0Var = this.G;
        vp0Var.f58027d1.b(indexOf);
        vp0Var.w(hVar);
    }
}
