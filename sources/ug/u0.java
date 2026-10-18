package ug;

import android.view.View;
public final class u0 implements View.OnClickListener {
    public final int f47808a;
    public final y0 f47809b;

    public u0(y0 y0Var, int i10) {
        this.f47808a = i10;
        this.f47809b = y0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f47808a) {
            case 0:
                y0 y0Var = this.f47809b;
                y0Var.f47826e0.clear();
                y0Var.Y.d.b(true);
                y0Var.c0(true, false);
                return;
            default:
                this.f47809b.X(false);
                return;
        }
    }
}
