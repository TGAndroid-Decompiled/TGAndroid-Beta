package ug;

import androidx.recyclerview.widget.RecyclerView;
public final class u0 extends v4.u0 {
    public final int f58917a;
    public final z0 f58918b;

    public u0(z0 z0Var, int i7) {
        this.f58917a = i7;
        this.f58918b = z0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.f58917a) {
            case 0:
                z0 z0Var = this.f58918b;
                z0Var.f30192b.invalidate();
                z0Var.J0();
                return;
            default:
                z0 z0Var2 = this.f58918b;
                z0Var2.f30192b.invalidate();
                z0Var2.J0();
                return;
        }
    }
}
