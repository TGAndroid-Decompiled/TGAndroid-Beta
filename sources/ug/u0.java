package ug;

import android.view.View;
public final class u0 implements View.OnClickListener {
    public final int f47761a;
    public final y0 f47762b;

    public u0(y0 y0Var, int i10) {
        this.f47761a = i10;
        this.f47762b = y0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f47761a) {
            case 0:
                y0 y0Var = this.f47762b;
                y0Var.f47779e0.clear();
                y0Var.Y.d.b(true);
                y0Var.c0(true, false);
                return;
            default:
                this.f47762b.X(false);
                return;
        }
    }
}
