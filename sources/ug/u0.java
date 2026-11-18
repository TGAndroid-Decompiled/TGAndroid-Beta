package ug;

import androidx.recyclerview.widget.RecyclerView;
public final class u0 extends v4.u0 {
    public final int f58918a;
    public final z0 f58919b;

    public u0(z0 z0Var, int i7) {
        this.f58918a = i7;
        this.f58919b = z0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.f58918a) {
            case 0:
                z0 z0Var = this.f58919b;
                z0Var.f30190b.invalidate();
                z0Var.J0();
                return;
            default:
                z0 z0Var2 = this.f58919b;
                z0Var2.f30190b.invalidate();
                z0Var2.J0();
                return;
        }
    }
}
