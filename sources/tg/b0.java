package tg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.tp0;
public final class b0 extends sg.u0 {
    public final Bitmap F;
    public final tp0 G;

    public b0(tp0 tp0Var, Context context, sg.i0 i0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, i0Var, bitmap, null, null);
        this.G = tp0Var;
        this.F = bitmap2;
    }

    @Override
    public final void g(sg.h hVar) {
        int indexOf = sg.h.f56640a.indexOf(hVar);
        int i7 = indexOf + 1;
        if (i7 <= 1 || this.F != null) {
            indexOf = i7;
        }
        tp0 tp0Var = this.G;
        tp0Var.f57281d1.b(indexOf);
        tp0Var.w(hVar);
    }
}
