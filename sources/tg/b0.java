package tg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.wp0;
public final class b0 extends sg.v0 {
    public final Bitmap E;
    public final wp0 F;

    public b0(wp0 wp0Var, Context context, sg.j0 j0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, j0Var, bitmap, null, null);
        this.F = wp0Var;
        this.E = bitmap2;
    }

    @Override
    public final void g(sg.h hVar) {
        int indexOf = sg.h.f55074a.indexOf(hVar);
        int i7 = indexOf + 1;
        if (i7 <= 1 || this.E != null) {
            indexOf = i7;
        }
        wp0 wp0Var = this.F;
        wp0Var.f55680c1.b(indexOf);
        wp0Var.w(hVar);
    }
}
