package tg;

import android.view.View;
public final class u0 implements View.OnClickListener {
    public final int f48517a;
    public final y0 f48518b;

    public u0(y0 y0Var, int i10) {
        this.f48517a = i10;
        this.f48518b = y0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f48517a) {
            case 0:
                y0 y0Var = this.f48518b;
                y0Var.f48536e0.clear();
                y0Var.Y.d.b(true);
                y0Var.c0(true, false);
                return;
            default:
                this.f48518b.X(false);
                return;
        }
    }
}
