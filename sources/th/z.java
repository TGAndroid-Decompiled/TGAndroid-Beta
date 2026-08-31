package th;

import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.xn;
public final class z implements m0 {
    public final p2 f48200a;
    public final i0 f48201b;

    public z(i0 i0Var, p2 p2Var) {
        this.f48201b = i0Var;
        this.f48200a = p2Var;
    }

    @Override
    public final void a(long j10) {
        this.f48200a.presentFragment(xn.R9(j10));
        this.f48201b.dismiss();
    }

    @Override
    public final void close() {
        this.f48201b.d.D(0);
    }

    @Override
    public final void e() {
        i0 i0Var = this.f48201b;
        i0Var.f48139w.d.V2.N(true);
        i0Var.v.d.V2.N(true);
    }
}
