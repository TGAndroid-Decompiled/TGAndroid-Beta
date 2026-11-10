package ug;

import androidx.recyclerview.widget.RecyclerView;
public final class r0 extends v4.s0 {
    public final int f56822a;
    public final w0 f56823b;

    public r0(w0 w0Var, int i7) {
        this.f56822a = i7;
        this.f56823b = w0Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.f56822a) {
            case 0:
                w0 w0Var = this.f56823b;
                w0Var.f28672b.invalidate();
                w0Var.I0();
                return;
            default:
                w0 w0Var2 = this.f56823b;
                w0Var2.f28672b.invalidate();
                w0Var2.I0();
                return;
        }
    }
}
