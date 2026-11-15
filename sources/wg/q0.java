package wg;

import android.view.View;
public final class q0 implements View.OnClickListener {
    public final int f59229a;
    public final u0 f59230b;

    public q0(u0 u0Var, int i7) {
        this.f59229a = i7;
        this.f59230b = u0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f59229a) {
            case 0:
                u0 u0Var = this.f59230b;
                u0Var.f59243a2.clear();
                u0Var.U1.d.b(true);
                u0Var.n1(true, false);
                return;
            default:
                this.f59230b.i1(false);
                return;
        }
    }
}
