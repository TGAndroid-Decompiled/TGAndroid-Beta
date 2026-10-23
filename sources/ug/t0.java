package ug;

import android.view.View;
public final class t0 implements View.OnClickListener {
    public final int f48205a;
    public final x0 f48206b;

    public t0(x0 x0Var, int i10) {
        this.f48205a = i10;
        this.f48206b = x0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f48205a) {
            case 0:
                x0 x0Var = this.f48206b;
                x0Var.f48223e0.clear();
                x0Var.Y.d.b(true);
                x0Var.b0(true, false);
                return;
            default:
                this.f48206b.W(false);
                return;
        }
    }
}
