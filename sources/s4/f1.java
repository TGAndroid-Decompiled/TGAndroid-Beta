package s4;

import java.util.ArrayList;
public abstract class f1 extends m0 {
    public boolean f42996m;
    public boolean f42997n;

    public f1() {
        this.f43040a = null;
        this.f43041b = new ArrayList();
        this.f43042c = 120L;
        this.d = 120L;
        this.e = 250L;
        this.f43043f = 250L;
        this.f43044g = 250L;
        this.f43048l = 0L;
        this.f42996m = true;
    }

    @Override
    public boolean a(c1 c1Var, b2.q0 q0Var, b2.q0 q0Var2) {
        int i10;
        int i11;
        if (q0Var != null && ((i10 = q0Var.f3195a) != (i11 = q0Var2.f3195a) || q0Var.f3196b != q0Var2.f3196b || this.f42997n)) {
            return r(c1Var, q0Var, i10, q0Var.f3196b, i11, q0Var2.f3196b);
        }
        p(c1Var);
        return true;
    }

    public abstract void p(c1 c1Var);

    public abstract boolean q(c1 c1Var, c1 c1Var2, b2.q0 q0Var, int i10, int i11, int i12, int i13);

    public abstract boolean r(c1 c1Var, b2.q0 q0Var, int i10, int i11, int i12, int i13);

    public abstract void s(c1 c1Var, b2.q0 q0Var);

    public boolean t(c1 c1Var) {
        if (this.f42996m && !c1Var.h()) {
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
