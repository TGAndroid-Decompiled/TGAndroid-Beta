package wg;

import android.view.View;
public final class s0 implements View.OnClickListener {
    public final int f59819a;
    public final w0 f59820b;

    public s0(w0 w0Var, int i7) {
        this.f59819a = i7;
        this.f59820b = w0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f59819a) {
            case 0:
                w0 w0Var = this.f59820b;
                w0Var.f59833a2.clear();
                w0Var.U1.d.b(true);
                w0Var.o1(true, false);
                return;
            default:
                this.f59820b.j1(false);
                return;
        }
    }
}
