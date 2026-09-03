package sh;

import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.zn;
public final class z implements m0 {
    public final p2 f44480a;
    public final i0 f44481b;

    public z(i0 i0Var, p2 p2Var) {
        this.f44481b = i0Var;
        this.f44480a = p2Var;
    }

    @Override
    public final void close() {
        this.f44481b.d.D(0);
    }

    @Override
    public final void d(long j10) {
        this.f44480a.presentFragment(zn.R9(j10));
        this.f44481b.dismiss();
    }

    @Override
    public final void f() {
        i0 i0Var = this.f44481b;
        i0Var.f44422w.d.V2.N(true);
        i0Var.v.d.V2.N(true);
    }
}
