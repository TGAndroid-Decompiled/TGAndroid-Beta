package wg;

import android.view.View;
public final class s0 implements View.OnClickListener {
    public final int f59861a;
    public final w0 f59862b;

    public s0(w0 w0Var, int i7) {
        this.f59861a = i7;
        this.f59862b = w0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f59861a) {
            case 0:
                w0 w0Var = this.f59862b;
                w0Var.f59875a2.clear();
                w0Var.U1.d.b(true);
                w0Var.o1(true, false);
                return;
            default:
                this.f59862b.j1(false);
                return;
        }
    }
}
