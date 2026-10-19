package ug;

import android.view.View;
public final class u0 implements View.OnClickListener {
    public final int f47763a;
    public final y0 f47764b;

    public u0(y0 y0Var, int i10) {
        this.f47763a = i10;
        this.f47764b = y0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f47763a) {
            case 0:
                y0 y0Var = this.f47764b;
                y0Var.f47781e0.clear();
                y0Var.Y.d.b(true);
                y0Var.c0(true, false);
                return;
            default:
                this.f47764b.X(false);
                return;
        }
    }
}
