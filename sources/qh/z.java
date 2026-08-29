package qh;

import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.tn;
public final class z implements n0 {
    public final o2 f46784a;
    public final i0 f46785b;

    public z(i0 i0Var, o2 o2Var) {
        this.f46785b = i0Var;
        this.f46784a = o2Var;
    }

    @Override
    public final void a(long j10) {
        this.f46784a.presentFragment(tn.R9(j10));
        this.f46785b.dismiss();
    }

    @Override
    public final void close() {
        this.f46785b.d.D(0);
    }

    @Override
    public final void k() {
        i0 i0Var = this.f46785b;
        i0Var.f46720w.d.U2.N(true);
        i0Var.v.d.U2.N(true);
    }
}
