package xg;

import android.view.View;
public final class s0 implements View.OnClickListener {
    public final int f58757a;
    public final w0 f58758b;

    public s0(w0 w0Var, int i3) {
        this.f58757a = i3;
        this.f58758b = w0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f58757a) {
            case 0:
                w0 w0Var = this.f58758b;
                w0Var.X1.clear();
                w0Var.R1.d.b(true);
                w0Var.n1(true, false);
                return;
            default:
                this.f58758b.i1(false);
                return;
        }
    }
}
