package qh;
public final class u3 implements o1.f {
    public final int f46165a;
    public final a5 f46166b;
    public final boolean f46167c;

    public u3(a5 a5Var, boolean z4, int i10) {
        this.f46165a = i10;
        this.f46166b = a5Var;
        this.f46167c = z4;
    }

    @Override
    public final void a(o1.h hVar, boolean z4, float f10, float f11) {
        switch (this.f46165a) {
            case 0:
                a5 a5Var = this.f46166b;
                g4 g4Var = a5Var.f44958t1;
                if (hVar == a5Var.f44970z1) {
                    a5Var.f44970z1 = null;
                    if (!this.f46167c) {
                        g4Var.setVisibility(8);
                        dg.e1.e(a5Var.C1).g();
                        g4Var.getAdapter().l();
                        return;
                    }
                    return;
                }
                return;
            default:
                a5 a5Var2 = this.f46166b;
                eg.o2 o2Var = a5Var2.f44939j1;
                if (hVar == a5Var2.f44956s1) {
                    a5Var2.f44956s1 = null;
                    if (!this.f46167c) {
                        o2Var.setVisibility(8);
                    }
                    o2Var.setMaskProvider(null);
                    return;
                }
                return;
        }
    }
}
