package tg;

import android.content.Context;
import android.view.ViewGroup;
public final class x0 extends v4.i0 {
    public final Context f58217c;
    public final z0 d;

    public x0(z0 z0Var, Context context) {
        this.d = z0Var;
        this.f58217c = context;
    }

    @Override
    public final int b() {
        return 14;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        float f10;
        y0 y0Var = (y0) f1Var.f59165a;
        ViewGroup.LayoutParams layoutParams = y0Var.getLayoutParams();
        z0 z0Var = this.d;
        layoutParams.height = ((z0Var.getHeight() - z0Var.getPaddingTop()) - z0Var.getPaddingBottom()) / 2;
        sg.k0 k0Var = z0Var.f58240i3;
        if (k0Var != null) {
            y0Var.f58226a = k0Var.b(i7);
            y0Var.invalidate();
            if (z0Var.f58239h3 == i7) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            y0Var.f58227b = f10;
            y0Var.invalidate();
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        return new v4.f1(new y0(this.d, this.f58217c));
    }
}
