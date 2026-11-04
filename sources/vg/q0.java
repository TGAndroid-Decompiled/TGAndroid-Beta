package vg;

import androidx.recyclerview.widget.RecyclerView;
public final class q0 extends u4.t0 {
    public final int f56789a;
    public final v0 f56790b;

    public q0(v0 v0Var, int i3) {
        this.f56789a = i3;
        this.f56790b = v0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i3, int i10) {
        switch (this.f56789a) {
            case 0:
                v0 v0Var = this.f56790b;
                v0Var.f28586b.invalidate();
                v0Var.I0();
                return;
            default:
                v0 v0Var2 = this.f56790b;
                v0Var2.f28586b.invalidate();
                v0Var2.I0();
                return;
        }
    }
}
