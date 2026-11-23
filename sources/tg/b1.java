package tg;

import android.content.Context;
import android.view.ViewGroup;
public final class b1 extends v4.i0 {
    public final Context f57856c;
    public final d1 d;

    public b1(d1 d1Var, Context context) {
        this.d = d1Var;
        this.f57856c = context;
    }

    @Override
    public final int b() {
        return 14;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        float f10;
        c1 c1Var = (c1) f1Var.f59245a;
        ViewGroup.LayoutParams layoutParams = c1Var.getLayoutParams();
        d1 d1Var = this.d;
        layoutParams.height = ((d1Var.getHeight() - d1Var.getPaddingTop()) - d1Var.getPaddingBottom()) / 2;
        sg.j0 j0Var = d1Var.f57873i3;
        if (j0Var != null) {
            c1Var.f57861a = j0Var.b(i7);
            c1Var.invalidate();
            if (d1Var.f57872h3 == i7) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            c1Var.f57862b = f10;
            c1Var.invalidate();
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        return new v4.f1(new c1(this.d, this.f57856c));
    }
}
