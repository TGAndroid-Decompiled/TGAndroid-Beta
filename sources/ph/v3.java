package ph;
public final class v3 implements o1.f {
    public final int f42507a;
    public final c5 f42508b;
    public final boolean f42509c;

    public v3(c5 c5Var, boolean z4, int i10) {
        this.f42507a = i10;
        this.f42508b = c5Var;
        this.f42509c = z4;
    }

    @Override
    public final void a(o1.h hVar, boolean z4, float f10, float f11) {
        switch (this.f42507a) {
            case 0:
                c5 c5Var = this.f42508b;
                h4 h4Var = c5Var.f41402t1;
                if (hVar == c5Var.f41414z1) {
                    c5Var.f41414z1 = null;
                    if (!this.f42509c) {
                        h4Var.setVisibility(8);
                        cg.f1.e(c5Var.C1).g();
                        h4Var.getAdapter().l();
                        return;
                    }
                    return;
                }
                return;
            default:
                c5 c5Var2 = this.f42508b;
                dg.q2 q2Var = c5Var2.f41383j1;
                if (hVar == c5Var2.f41400s1) {
                    c5Var2.f41400s1 = null;
                    if (!this.f42509c) {
                        q2Var.setVisibility(8);
                    }
                    q2Var.setMaskProvider(null);
                    return;
                }
                return;
        }
    }
}
