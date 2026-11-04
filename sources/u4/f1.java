package u4;

import java.util.ArrayList;
public abstract class f1 extends m0 {
    public boolean f55567m;
    public boolean f55568n;

    public f1() {
        this.f55614a = null;
        this.f55615b = new ArrayList();
        this.f55616c = 120L;
        this.d = 120L;
        this.f55617e = 250L;
        this.f55618f = 250L;
        this.f55619g = 250L;
        this.f55623l = 0L;
        this.f55567m = true;
    }

    @Override
    public boolean a(d1 d1Var, d2.t0 t0Var, d2.t0 t0Var2) {
        int i3;
        int i10;
        if (t0Var != null && ((i3 = t0Var.f8413a) != (i10 = t0Var2.f8413a) || t0Var.f8414b != t0Var2.f8414b || this.f55568n)) {
            return r(d1Var, t0Var, i3, t0Var.f8414b, i10, t0Var2.f8414b);
        }
        p(d1Var);
        return true;
    }

    public abstract void p(d1 d1Var);

    public abstract boolean q(d1 d1Var, d1 d1Var2, d2.t0 t0Var, int i3, int i10, int i11, int i12);

    public abstract boolean r(d1 d1Var, d2.t0 t0Var, int i3, int i10, int i11, int i12);

    public abstract void s(d1 d1Var, d2.t0 t0Var);

    public boolean t(d1 d1Var) {
        if (this.f55567m && !d1Var.h()) {
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
