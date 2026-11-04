package ug;

import android.content.Context;
import android.view.ViewGroup;
public final class v0 extends u4.h0 {
    public final Context f56280c;
    public final x0 d;

    public v0(x0 x0Var, Context context) {
        this.d = x0Var;
        this.f56280c = context;
    }

    @Override
    public final int b() {
        return 14;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        float f10;
        w0 w0Var = (w0) d1Var.f55540a;
        ViewGroup.LayoutParams layoutParams = w0Var.getLayoutParams();
        x0 x0Var = this.d;
        layoutParams.height = ((x0Var.getHeight() - x0Var.getPaddingTop()) - x0Var.getPaddingBottom()) / 2;
        tg.k0 k0Var = x0Var.i3;
        if (k0Var != null) {
            w0Var.f56287a = k0Var.b(i3);
            w0Var.invalidate();
            if (x0Var.f56300h3 == i3) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            w0Var.f56288b = f10;
            w0Var.invalidate();
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        return new u4.d1(new w0(this.d, this.f56280c));
    }
}
