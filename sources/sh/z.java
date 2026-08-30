package sh;

import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.xn;
public final class z implements n0 {
    public final p2 f44418a;
    public final i0 f44419b;

    public z(i0 i0Var, p2 p2Var) {
        this.f44419b = i0Var;
        this.f44418a = p2Var;
    }

    @Override
    public final void b(long j10) {
        this.f44418a.presentFragment(xn.R9(j10));
        this.f44419b.dismiss();
    }

    @Override
    public final void close() {
        this.f44419b.d.D(0);
    }

    @Override
    public final void d() {
        i0 i0Var = this.f44419b;
        i0Var.f44357w.d.V2.N(true);
        i0Var.v.d.V2.N(true);
    }
}
