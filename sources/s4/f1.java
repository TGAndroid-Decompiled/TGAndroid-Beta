package s4;

import java.util.ArrayList;
public abstract class f1 extends m0 {
    public boolean f41645m;
    public boolean f41646n;

    public f1() {
        this.f41689a = null;
        this.f41690b = new ArrayList();
        this.f41691c = 120L;
        this.d = 120L;
        this.e = 250L;
        this.f41692f = 250L;
        this.f41693g = 250L;
        this.f41697l = 0L;
        this.f41645m = true;
    }

    @Override
    public boolean a(c1 c1Var, b2.q0 q0Var, b2.q0 q0Var2) {
        int i10;
        int i11;
        if (q0Var != null && ((i10 = q0Var.f1896a) != (i11 = q0Var2.f1896a) || q0Var.f1897b != q0Var2.f1897b || this.f41646n)) {
            return r(c1Var, q0Var, i10, q0Var.f1897b, i11, q0Var2.f1897b);
        }
        p(c1Var);
        return true;
    }

    public abstract void p(c1 c1Var);

    public abstract boolean q(c1 c1Var, c1 c1Var2, b2.q0 q0Var, int i10, int i11, int i12, int i13);

    public abstract boolean r(c1 c1Var, b2.q0 q0Var, int i10, int i11, int i12, int i13);

    public abstract void s(c1 c1Var, b2.q0 q0Var);

    public boolean t(c1 c1Var) {
        if (this.f41645m && !c1Var.h()) {
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
