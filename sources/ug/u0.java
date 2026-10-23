package ug;

import android.view.View;
public final class u0 implements View.OnClickListener {
    public final int f47772a;
    public final y0 f47773b;

    public u0(y0 y0Var, int i10) {
        this.f47772a = i10;
        this.f47773b = y0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f47772a) {
            case 0:
                y0 y0Var = this.f47773b;
                y0Var.f47790e0.clear();
                y0Var.Y.d.b(true);
                y0Var.c0(true, false);
                return;
            default:
                this.f47773b.X(false);
                return;
        }
    }
}
