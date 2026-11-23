package tg;
public final class x implements r1.c {
    public final int f58286a;
    public final l0 f58287b;
    public final boolean f58288c;

    public x(l0 l0Var, boolean z10, int i7) {
        this.f58286a = i7;
        this.f58287b = l0Var;
        this.f58288c = z10;
    }

    @Override
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.f58286a) {
            case 0:
                l0 l0Var = this.f58287b;
                o1 o1Var = l0Var.f58029f1;
                if (gVar == l0Var.f58042p1) {
                    l0Var.f58042p1 = null;
                    if (!this.f58288c) {
                        o1Var.setVisibility(8);
                    }
                    o1Var.setMaskProvider(null);
                    return;
                }
                return;
            default:
                l0 l0Var2 = this.f58287b;
                i0 i0Var = l0Var2.f58044q1;
                if (gVar == l0Var2.f58056w1) {
                    l0Var2.f58056w1 = null;
                    if (!this.f58288c) {
                        i0Var.setVisibility(8);
                        sg.j0.e(l0Var2.f58062z1).g();
                        i0Var.getAdapter().f();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
