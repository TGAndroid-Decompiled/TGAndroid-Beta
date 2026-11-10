package tg;

import android.content.Context;
import android.graphics.Bitmap;
import org.telegram.ui.xp0;
public final class b0 extends sg.v0 {
    public final Bitmap E;
    public final xp0 F;

    public b0(xp0 xp0Var, Context context, sg.j0 j0Var, Bitmap bitmap, Bitmap bitmap2) {
        super(context, j0Var, bitmap, null, null);
        this.F = xp0Var;
        this.E = bitmap2;
    }

    @Override
    public final void g(sg.h hVar) {
        int indexOf = sg.h.f55073a.indexOf(hVar);
        int i7 = indexOf + 1;
        if (i7 <= 1 || this.E != null) {
            indexOf = i7;
        }
        xp0 xp0Var = this.F;
        xp0Var.f55679c1.b(indexOf);
        xp0Var.w(hVar);
    }
}
