package s4;

import java.util.ArrayList;
public abstract class e1 extends l0 {
    public boolean f46376m;
    public boolean f46377n;

    public e1() {
        this.f46419a = null;
        this.f46420b = new ArrayList();
        this.f46421c = 120L;
        this.d = 120L;
        this.e = 250L;
        this.f46422f = 250L;
        this.f46423g = 250L;
        this.f46427l = 0L;
        this.f46376m = true;
    }

    @Override
    public boolean a(b1 b1Var, b2.u0 u0Var, b2.u0 u0Var2) {
        int i10;
        int i11;
        if (u0Var != null && ((i10 = u0Var.f4060a) != (i11 = u0Var2.f4060a) || u0Var.f4061b != u0Var2.f4061b || this.f46377n)) {
            return r(b1Var, u0Var, i10, u0Var.f4061b, i11, u0Var2.f4061b);
        }
        p(b1Var);
        return true;
    }

    public abstract void p(b1 b1Var);

    public abstract boolean q(b1 b1Var, b1 b1Var2, b2.u0 u0Var, int i10, int i11, int i12, int i13);

    public abstract boolean r(b1 b1Var, b2.u0 u0Var, int i10, int i11, int i12, int i13);

    public abstract void s(b1 b1Var, b2.u0 u0Var);

    public boolean t(b1 b1Var) {
        if (this.f46376m && !b1Var.h()) {
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
