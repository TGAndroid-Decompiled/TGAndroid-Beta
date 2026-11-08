package wg;

import android.view.View;
public final class s0 implements View.OnClickListener {
    public final int f57806a;
    public final w0 f57807b;

    public s0(w0 w0Var, int i7) {
        this.f57806a = i7;
        this.f57807b = w0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f57806a) {
            case 0:
                w0 w0Var = this.f57807b;
                w0Var.W1.clear();
                w0Var.Q1.d.b(true);
                w0Var.n1(true, false);
                return;
            default:
                this.f57807b.i1(false);
                return;
        }
    }
}
