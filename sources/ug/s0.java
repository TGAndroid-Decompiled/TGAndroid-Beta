package ug;

import androidx.recyclerview.widget.RecyclerView;
public final class s0 extends v4.t0 {
    public final int f58328a;
    public final x0 f58329b;

    public s0(x0 x0Var, int i7) {
        this.f58328a = i7;
        this.f58329b = x0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.f58328a) {
            case 0:
                x0 x0Var = this.f58329b;
                x0Var.f29682b.invalidate();
                x0Var.I0();
                return;
            default:
                x0 x0Var2 = this.f58329b;
                x0Var2.f29682b.invalidate();
                x0Var2.I0();
                return;
        }
    }
}
