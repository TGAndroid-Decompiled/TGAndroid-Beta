package wg;

import android.view.View;
public final class s0 implements View.OnClickListener {
    public final int f59865a;
    public final w0 f59866b;

    public s0(w0 w0Var, int i7) {
        this.f59865a = i7;
        this.f59866b = w0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f59865a) {
            case 0:
                w0 w0Var = this.f59866b;
                w0Var.f59879a2.clear();
                w0Var.U1.d.b(true);
                w0Var.o1(true, false);
                return;
            default:
                this.f59866b.j1(false);
                return;
        }
    }
}
