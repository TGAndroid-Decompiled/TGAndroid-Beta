package vh;
public final class c3 implements o1.f {
    public final int f51045a;
    public final b4 f51046b;
    public final boolean f51047c;

    public c3(b4 b4Var, boolean z10, int i10) {
        this.f51045a = i10;
        this.f51046b = b4Var;
        this.f51047c = z10;
    }

    @Override
    public final void a(o1.j jVar, boolean z10, float f7, float f10) {
        switch (this.f51045a) {
            case 0:
                b4 b4Var = this.f51046b;
                n3 n3Var = b4Var.f50970f1;
                if (jVar == b4Var.l1) {
                    b4Var.l1 = null;
                    if (!this.f51047c) {
                        n3Var.setVisibility(8);
                        ig.s0.e(b4Var.f50986o1).g();
                        n3Var.getAdapter().f();
                        return;
                    }
                    return;
                }
                return;
            default:
                b4 b4Var2 = this.f51046b;
                jg.a2 a2Var = b4Var2.V0;
                if (jVar == b4Var2.f50968e1) {
                    b4Var2.f50968e1 = null;
                    if (!this.f51047c) {
                        a2Var.setVisibility(8);
                    }
                    a2Var.setMaskProvider(null);
                    return;
                }
                return;
        }
    }
}
