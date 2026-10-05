package s4;

import java.util.ArrayList;
public abstract class f1 extends m0 {
    public boolean f46577m;
    public boolean f46578n;

    public f1() {
        this.f46626a = null;
        this.f46627b = new ArrayList();
        this.f46628c = 120L;
        this.d = 120L;
        this.f46629e = 250L;
        this.f46630f = 250L;
        this.f46631g = 250L;
        this.f46635l = 0L;
        this.f46577m = true;
    }

    @Override
    public boolean a(c1 c1Var, b2.q0 q0Var, b2.q0 q0Var2) {
        int i10;
        int i11;
        if (q0Var != null && ((i10 = q0Var.f3454a) != (i11 = q0Var2.f3454a) || q0Var.f3455b != q0Var2.f3455b || this.f46578n)) {
            return r(c1Var, q0Var, i10, q0Var.f3455b, i11, q0Var2.f3455b);
        }
        p(c1Var);
        return true;
    }

    public abstract void p(c1 c1Var);

    public abstract boolean q(c1 c1Var, c1 c1Var2, b2.q0 q0Var, int i10, int i11, int i12, int i13);

    public abstract boolean r(c1 c1Var, b2.q0 q0Var, int i10, int i11, int i12, int i13);

    public abstract void s(c1 c1Var, b2.q0 q0Var);

    public boolean t(c1 c1Var) {
        if (this.f46577m && !c1Var.h()) {
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
