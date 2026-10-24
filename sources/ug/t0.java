package ug;

import android.view.View;
public final class t0 implements View.OnClickListener {
    public final int f48204a;
    public final x0 f48205b;

    public t0(x0 x0Var, int i10) {
        this.f48204a = i10;
        this.f48205b = x0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f48204a) {
            case 0:
                x0 x0Var = this.f48205b;
                x0Var.f48222e0.clear();
                x0Var.Y.d.b(true);
                x0Var.b0(true, false);
                return;
            default:
                this.f48205b.W(false);
                return;
        }
    }
}
