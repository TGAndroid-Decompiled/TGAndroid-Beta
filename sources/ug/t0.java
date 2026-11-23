package ug;

import androidx.recyclerview.widget.RecyclerView;
public final class t0 extends v4.u0 {
    public final int f59036a;
    public final y0 f59037b;

    public t0(y0 y0Var, int i7) {
        this.f59036a = i7;
        this.f59037b = y0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.f59036a) {
            case 0:
                y0 y0Var = this.f59037b;
                y0Var.f30226b.invalidate();
                y0Var.J0();
                return;
            default:
                y0 y0Var2 = this.f59037b;
                y0Var2.f30226b.invalidate();
                y0Var2.J0();
                return;
        }
    }
}
