package tg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.wp0;
public final class c0 extends sg.u0 {
    public final Bitmap F;
    public final wp0 G;

    public c0(wp0 wp0Var, Context context, sg.i0 i0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, i0Var, bitmap, null, null);
        this.G = wp0Var;
        this.F = bitmap2;
    }

    @Override
    public final void g(sg.h hVar) {
        int indexOf = sg.h.f57224a.indexOf(hVar);
        int i7 = indexOf + 1;
        if (i7 <= 1 || this.F != null) {
            indexOf = i7;
        }
        wp0 wp0Var = this.G;
        wp0Var.f57876d1.b(indexOf);
        wp0Var.w(hVar);
    }
}
