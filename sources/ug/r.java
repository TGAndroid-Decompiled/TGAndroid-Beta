package ug;
public final class r implements q1.c {
    public final int f56230a;
    public final f0 f56231b;
    public final boolean f56232c;

    public r(f0 f0Var, boolean z10, int i3) {
        this.f56230a = i3;
        this.f56231b = f0Var;
        this.f56232c = z10;
    }

    @Override
    public final void a(q1.g gVar, boolean z10, float f10, float f11) {
        switch (this.f56230a) {
            case 0:
                f0 f0Var = this.f56231b;
                i1 i1Var = f0Var.f55969f1;
                if (gVar == f0Var.f55982p1) {
                    f0Var.f55982p1 = null;
                    if (!this.f56232c) {
                        i1Var.setVisibility(8);
                    }
                    i1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                f0 f0Var2 = this.f56231b;
                c0 c0Var = f0Var2.f55984q1;
                if (gVar == f0Var2.f55996w1) {
                    f0Var2.f55996w1 = null;
                    if (!this.f56232c) {
                        c0Var.setVisibility(8);
                        tg.k0.e(f0Var2.f56002z1).g();
                        c0Var.getAdapter().f();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
