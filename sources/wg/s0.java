package wg;

import android.view.View;
public final class s0 implements View.OnClickListener {
    public final int f59820a;
    public final w0 f59821b;

    public s0(w0 w0Var, int i7) {
        this.f59820a = i7;
        this.f59821b = w0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f59820a) {
            case 0:
                w0 w0Var = this.f59821b;
                w0Var.f59834a2.clear();
                w0Var.U1.d.b(true);
                w0Var.o1(true, false);
                return;
            default:
                this.f59821b.j1(false);
                return;
        }
    }
}
