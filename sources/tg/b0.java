package tg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.tp0;
public final class b0 extends sg.w0 {
    public final Bitmap E;
    public final tp0 F;

    public b0(tp0 tp0Var, Context context, sg.j0 j0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, j0Var, bitmap, null, null);
        this.F = tp0Var;
        this.E = bitmap2;
    }

    @Override
    public final void g(sg.h hVar) {
        int indexOf = sg.h.f54943a.indexOf(hVar);
        int i7 = indexOf + 1;
        if (i7 <= 1 || this.E != null) {
            indexOf = i7;
        }
        tp0 tp0Var = this.F;
        tp0Var.f55551c1.b(indexOf);
        tp0Var.w(hVar);
    }
}
