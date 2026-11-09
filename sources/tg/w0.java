package tg;

import android.content.Context;
import android.view.ViewGroup;
public final class w0 extends v4.g0 {
    public final Context f55995c;
    public final y0 d;

    public w0(y0 y0Var, Context context) {
        this.d = y0Var;
        this.f55995c = context;
    }

    @Override
    public final int b() {
        return 14;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        float f10;
        x0 x0Var = (x0) d1Var.f57056a;
        ViewGroup.LayoutParams layoutParams = x0Var.getLayoutParams();
        y0 y0Var = this.d;
        layoutParams.height = ((y0Var.getHeight() - y0Var.getPaddingTop()) - y0Var.getPaddingBottom()) / 2;
        sg.l0 l0Var = y0Var.f56022h3;
        if (l0Var != null) {
            x0Var.f56000a = l0Var.b(i7);
            x0Var.invalidate();
            if (y0Var.f56021g3 == i7) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            x0Var.f56001b = f10;
            x0Var.invalidate();
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        return new v4.d1(new x0(this.d, this.f55995c));
    }
}
