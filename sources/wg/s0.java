package wg;

import android.view.View;
public final class s0 implements View.OnClickListener {
    public final int f57803a;
    public final w0 f57804b;

    public s0(w0 w0Var, int i7) {
        this.f57803a = i7;
        this.f57804b = w0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f57803a) {
            case 0:
                w0 w0Var = this.f57804b;
                w0Var.Z1.clear();
                w0Var.T1.d.b(true);
                w0Var.n1(true, false);
                return;
            default:
                this.f57804b.i1(false);
                return;
        }
    }
}
