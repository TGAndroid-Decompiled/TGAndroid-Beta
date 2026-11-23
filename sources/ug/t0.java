package ug;

import androidx.recyclerview.widget.RecyclerView;
public final class t0 extends v4.t0 {
    public final int f58921a;
    public final y0 f58922b;

    public t0(y0 y0Var, int i7) {
        this.f58921a = i7;
        this.f58922b = y0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.f58921a) {
            case 0:
                y0 y0Var = this.f58922b;
                y0Var.f30142b.invalidate();
                y0Var.J0();
                return;
            default:
                y0 y0Var2 = this.f58922b;
                y0Var2.f30142b.invalidate();
                y0Var2.J0();
                return;
        }
    }
}
