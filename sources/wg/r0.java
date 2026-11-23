package wg;

import android.view.View;
public final class r0 implements View.OnClickListener {
    public final int f59925a;
    public final v0 f59926b;

    public r0(v0 v0Var, int i7) {
        this.f59925a = i7;
        this.f59926b = v0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f59925a) {
            case 0:
                v0 v0Var = this.f59926b;
                v0Var.f59939a2.clear();
                v0Var.U1.d.b(true);
                v0Var.o1(true, false);
                return;
            default:
                this.f59926b.j1(false);
                return;
        }
    }
}
