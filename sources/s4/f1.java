package s4;

import java.util.ArrayList;
public abstract class f1 extends m0 {
    public boolean f45777m;
    public boolean f45778n;

    public f1() {
        this.f45826a = null;
        this.f45827b = new ArrayList();
        this.f45828c = 120L;
        this.d = 120L;
        this.f45829e = 250L;
        this.f45830f = 250L;
        this.f45831g = 250L;
        this.f45835l = 0L;
        this.f45777m = true;
    }

    @Override
    public boolean a(c1 c1Var, b2.q0 q0Var, b2.q0 q0Var2) {
        int i10;
        int i11;
        if (q0Var != null && ((i10 = q0Var.f2260a) != (i11 = q0Var2.f2260a) || q0Var.f2261b != q0Var2.f2261b || this.f45778n)) {
            return r(c1Var, q0Var, i10, q0Var.f2261b, i11, q0Var2.f2261b);
        }
        p(c1Var);
        return true;
    }

    public abstract void p(c1 c1Var);

    public abstract boolean q(c1 c1Var, c1 c1Var2, b2.q0 q0Var, int i10, int i11, int i12, int i13);

    public abstract boolean r(c1 c1Var, b2.q0 q0Var, int i10, int i11, int i12, int i13);

    public abstract void s(c1 c1Var, b2.q0 q0Var);

    public boolean t(c1 c1Var) {
        if (this.f45777m && !c1Var.h()) {
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
