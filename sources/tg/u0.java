package tg;

import android.view.View;
public final class u0 implements View.OnClickListener {
    public final int f48483a;
    public final y0 f48484b;

    public u0(y0 y0Var, int i10) {
        this.f48483a = i10;
        this.f48484b = y0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f48483a) {
            case 0:
                y0 y0Var = this.f48484b;
                y0Var.f48502e0.clear();
                y0Var.Y.d.b(true);
                y0Var.c0(true, false);
                return;
            default:
                this.f48484b.X(false);
                return;
        }
    }
}
