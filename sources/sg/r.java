package sg;
public final class r implements o1.f {
    public final int f48519a;
    public final m0 f48520b;
    public final boolean f48521c;

    public r(m0 m0Var, boolean z10, int i10) {
        this.f48519a = i10;
        this.f48520b = m0Var;
        this.f48521c = z10;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f48519a) {
            case 0:
                m0 m0Var = this.f48520b;
                u1 u1Var = m0Var.f48370k1;
                if (hVar == m0Var.f48385u1) {
                    m0Var.f48385u1 = null;
                    if (!this.f48521c) {
                        u1Var.setVisibility(8);
                    }
                    u1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                m0 m0Var2 = this.f48520b;
                j0 j0Var = m0Var2.f48387v1;
                if (hVar == m0Var2.B1) {
                    m0Var2.B1 = null;
                    if (!this.f48521c) {
                        j0Var.setVisibility(8);
                        rg.s0.e(m0Var2.E1).g();
                        j0Var.getAdapter().l();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
