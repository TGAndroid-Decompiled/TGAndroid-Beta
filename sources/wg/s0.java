package wg;

import android.view.View;
public final class s0 implements View.OnClickListener {
    public final int f59830a;
    public final w0 f59831b;

    public s0(w0 w0Var, int i7) {
        this.f59830a = i7;
        this.f59831b = w0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f59830a) {
            case 0:
                w0 w0Var = this.f59831b;
                w0Var.f59844a2.clear();
                w0Var.U1.d.b(true);
                w0Var.o1(true, false);
                return;
            default:
                this.f59831b.j1(false);
                return;
        }
    }
}
