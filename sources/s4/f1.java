package s4;

import java.util.ArrayList;
public abstract class f1 extends m0 {
    public boolean f43040m;
    public boolean f43041n;

    public f1() {
        this.f43084a = null;
        this.f43085b = new ArrayList();
        this.f43086c = 120L;
        this.d = 120L;
        this.e = 250L;
        this.f43087f = 250L;
        this.f43088g = 250L;
        this.f43092l = 0L;
        this.f43040m = true;
    }

    @Override
    public boolean a(c1 c1Var, b2.q0 q0Var, b2.q0 q0Var2) {
        int i10;
        int i11;
        if (q0Var != null && ((i10 = q0Var.f3197a) != (i11 = q0Var2.f3197a) || q0Var.f3198b != q0Var2.f3198b || this.f43041n)) {
            return r(c1Var, q0Var, i10, q0Var.f3198b, i11, q0Var2.f3198b);
        }
        p(c1Var);
        return true;
    }

    public abstract void p(c1 c1Var);

    public abstract boolean q(c1 c1Var, c1 c1Var2, b2.q0 q0Var, int i10, int i11, int i12, int i13);

    public abstract boolean r(c1 c1Var, b2.q0 q0Var, int i10, int i11, int i12, int i13);

    public abstract void s(c1 c1Var, b2.q0 q0Var);

    public boolean t(c1 c1Var) {
        if (this.f43040m && !c1Var.h()) {
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
