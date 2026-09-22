package s4;

import java.util.ArrayList;
public abstract class f1 extends m0 {
    public boolean f42706m;
    public boolean f42707n;

    public f1() {
        this.f42750a = null;
        this.f42751b = new ArrayList();
        this.f42752c = 120L;
        this.d = 120L;
        this.e = 250L;
        this.f42753f = 250L;
        this.f42754g = 250L;
        this.f42758l = 0L;
        this.f42706m = true;
    }

    @Override
    public boolean a(c1 c1Var, b2.q0 q0Var, b2.q0 q0Var2) {
        int i10;
        int i11;
        if (q0Var != null && ((i10 = q0Var.f3200a) != (i11 = q0Var2.f3200a) || q0Var.f3201b != q0Var2.f3201b || this.f42707n)) {
            return r(c1Var, q0Var, i10, q0Var.f3201b, i11, q0Var2.f3201b);
        }
        p(c1Var);
        return true;
    }

    public abstract void p(c1 c1Var);

    public abstract boolean q(c1 c1Var, c1 c1Var2, b2.q0 q0Var, int i10, int i11, int i12, int i13);

    public abstract boolean r(c1 c1Var, b2.q0 q0Var, int i10, int i11, int i12, int i13);

    public abstract void s(c1 c1Var, b2.q0 q0Var);

    public boolean t(c1 c1Var) {
        if (this.f42706m && !c1Var.h()) {
            return false;
        }
        return true;
    }

    public final void u(c1 c1Var) {
        w(c1Var);
        d(c1Var);
    }

    public final void v(c1 c1Var) {
        x(c1Var);
        d(c1Var);
    }

    public void y() {
    }

    public void w(c1 c1Var) {
    }

    public void x(c1 c1Var) {
    }
}
