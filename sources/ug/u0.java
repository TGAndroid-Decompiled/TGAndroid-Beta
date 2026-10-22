package ug;

import android.view.View;
public final class u0 implements View.OnClickListener {
    public final int f47771a;
    public final y0 f47772b;

    public u0(y0 y0Var, int i10) {
        this.f47771a = i10;
        this.f47772b = y0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f47771a) {
            case 0:
                y0 y0Var = this.f47772b;
                y0Var.f47789e0.clear();
                y0Var.Y.d.b(true);
                y0Var.c0(true, false);
                return;
            default:
                this.f47772b.X(false);
                return;
        }
    }
}
