package s4;

import java.util.ArrayList;
public abstract class f1 extends m0 {
    public boolean f45805m;
    public boolean f45806n;

    public f1() {
        this.f45854a = null;
        this.f45855b = new ArrayList();
        this.f45856c = 120L;
        this.d = 120L;
        this.f45857e = 250L;
        this.f45858f = 250L;
        this.f45859g = 250L;
        this.f45863l = 0L;
        this.f45805m = true;
    }

    @Override
    public boolean a(c1 c1Var, b2.q0 q0Var, b2.q0 q0Var2) {
        int i10;
        int i11;
        if (q0Var != null && ((i10 = q0Var.f2287a) != (i11 = q0Var2.f2287a) || q0Var.f2288b != q0Var2.f2288b || this.f45806n)) {
            return r(c1Var, q0Var, i10, q0Var.f2288b, i11, q0Var2.f2288b);
        }
        p(c1Var);
        return true;
    }

    public abstract void p(c1 c1Var);

    public abstract boolean q(c1 c1Var, c1 c1Var2, b2.q0 q0Var, int i10, int i11, int i12, int i13);

    public abstract boolean r(c1 c1Var, b2.q0 q0Var, int i10, int i11, int i12, int i13);

    public abstract void s(c1 c1Var, b2.q0 q0Var);

    public boolean t(c1 c1Var) {
        if (this.f45805m && !c1Var.h()) {
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
