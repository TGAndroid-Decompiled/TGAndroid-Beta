package s4;

import java.util.ArrayList;
public abstract class e1 extends l0 {
    public boolean f44872m;
    public boolean f44873n;

    public e1() {
        this.f44915a = null;
        this.f44916b = new ArrayList();
        this.f44917c = 120L;
        this.d = 120L;
        this.e = 250L;
        this.f44918f = 250L;
        this.f44919g = 250L;
        this.f44923l = 0L;
        this.f44872m = true;
    }

    @Override
    public boolean a(b1 b1Var, b2.v0 v0Var, b2.v0 v0Var2) {
        int i10;
        int i11;
        if (v0Var != null && ((i10 = v0Var.f2448a) != (i11 = v0Var2.f2448a) || v0Var.f2449b != v0Var2.f2449b || this.f44873n)) {
            return r(b1Var, v0Var, i10, v0Var.f2449b, i11, v0Var2.f2449b);
        }
        p(b1Var);
        return true;
    }

    public abstract void p(b1 b1Var);

    public abstract boolean q(b1 b1Var, b1 b1Var2, b2.v0 v0Var, int i10, int i11, int i12, int i13);

    public abstract boolean r(b1 b1Var, b2.v0 v0Var, int i10, int i11, int i12, int i13);

    public abstract void s(b1 b1Var, b2.v0 v0Var);

    public boolean t(b1 b1Var) {
        if (this.f44872m && !b1Var.h()) {
            return false;
        }
        return true;
    }

    public final void u(b1 b1Var) {
        w(b1Var);
        d(b1Var);
    }

    public final void v(b1 b1Var) {
        x(b1Var);
        d(b1Var);
    }

    public void y() {
    }

    public void w(b1 b1Var) {
    }

    public void x(b1 b1Var) {
    }
}
