package tg;

import android.content.Context;
import android.view.ViewGroup;
public final class w0 extends v4.h0 {
    public final Context f57592c;
    public final y0 d;

    public w0(y0 y0Var, Context context) {
        this.d = y0Var;
        this.f57592c = context;
    }

    @Override
    public final int b() {
        return 14;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        float f10;
        x0 x0Var = (x0) e1Var.f58535a;
        ViewGroup.LayoutParams layoutParams = x0Var.getLayoutParams();
        y0 y0Var = this.d;
        layoutParams.height = ((y0Var.getHeight() - y0Var.getPaddingTop()) - y0Var.getPaddingBottom()) / 2;
        sg.k0 k0Var = y0Var.f57612i3;
        if (k0Var != null) {
            x0Var.f57599a = k0Var.b(i7);
            x0Var.invalidate();
            if (y0Var.f57611h3 == i7) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            x0Var.f57600b = f10;
            x0Var.invalidate();
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        return new v4.e1(new x0(this.d, this.f57592c));
    }
}
