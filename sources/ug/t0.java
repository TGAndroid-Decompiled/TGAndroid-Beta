package ug;

import androidx.recyclerview.widget.RecyclerView;
public final class t0 extends v4.u0 {
    public final int f58956a;
    public final y0 f58957b;

    public t0(y0 y0Var, int i7) {
        this.f58956a = i7;
        this.f58957b = y0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.f58956a) {
            case 0:
                y0 y0Var = this.f58957b;
                y0Var.f30176b.invalidate();
                y0Var.J0();
                return;
            default:
                y0 y0Var2 = this.f58957b;
                y0Var2.f30176b.invalidate();
                y0Var2.J0();
                return;
        }
    }
}
