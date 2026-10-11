package s4;

import java.util.ArrayList;
public abstract class g1 extends n0 {
    public boolean f47822m;
    public boolean f47823n;

    public g1() {
        this.f47872a = null;
        this.f47873b = new ArrayList();
        this.f47874c = 120L;
        this.d = 120L;
        this.f47875e = 250L;
        this.f47876f = 250L;
        this.f47877g = 250L;
        this.f47881l = 0L;
        this.f47822m = true;
    }

    @Override
    public boolean a(d1 d1Var, b2.q0 q0Var, b2.q0 q0Var2) {
        int i10;
        int i11;
        if (q0Var != null && ((i10 = q0Var.f3533a) != (i11 = q0Var2.f3533a) || q0Var.f3534b != q0Var2.f3534b || this.f47823n)) {
            return r(d1Var, q0Var, i10, q0Var.f3534b, i11, q0Var2.f3534b);
        }
        p(d1Var);
        return true;
    }

    public abstract void p(d1 d1Var);

    public abstract boolean q(d1 d1Var, d1 d1Var2, b2.q0 q0Var, int i10, int i11, int i12, int i13);

    public abstract boolean r(d1 d1Var, b2.q0 q0Var, int i10, int i11, int i12, int i13);

    public abstract void s(d1 d1Var, b2.q0 q0Var);

    public boolean t(d1 d1Var) {
        if (this.f47822m && !d1Var.h()) {
            return false;
        }
        return true;
    }

    public final void u(d1 d1Var) {
        w(d1Var);
        d(d1Var);
    }

    public final void v(d1 d1Var) {
        x(d1Var);
        d(d1Var);
    }

    public void y() {
    }

    public void w(d1 d1Var) {
    }

    public void x(d1 d1Var) {
    }
}
