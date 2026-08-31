package qh;
public final class v3 implements o1.f {
    public final int f46189a;
    public final b5 f46190b;
    public final boolean f46191c;

    public v3(b5 b5Var, boolean z4, int i10) {
        this.f46189a = i10;
        this.f46190b = b5Var;
        this.f46191c = z4;
    }

    @Override
    public final void a(o1.h hVar, boolean z4, float f10, float f11) {
        switch (this.f46189a) {
            case 0:
                b5 b5Var = this.f46190b;
                h4 h4Var = b5Var.f44981t1;
                if (hVar == b5Var.f44993z1) {
                    b5Var.f44993z1 = null;
                    if (!this.f46191c) {
                        h4Var.setVisibility(8);
                        dg.e1.e(b5Var.C1).g();
                        h4Var.getAdapter().l();
                        return;
                    }
                    return;
                }
                return;
            default:
                b5 b5Var2 = this.f46190b;
                eg.o2 o2Var = b5Var2.f44962j1;
                if (hVar == b5Var2.f44979s1) {
                    b5Var2.f44979s1 = null;
                    if (!this.f46191c) {
                        o2Var.setVisibility(8);
                    }
                    o2Var.setMaskProvider(null);
                    return;
                }
                return;
        }
    }
}
