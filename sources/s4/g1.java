package s4;

import java.util.ArrayList;
public abstract class g1 extends m0 {
    public boolean f47798m;
    public boolean f47799n;

    public g1() {
        this.f47836a = null;
        this.f47837b = new ArrayList();
        this.f47838c = 120L;
        this.d = 120L;
        this.e = 250L;
        this.f47839f = 250L;
        this.f47840g = 250L;
        this.f47844l = 0L;
        this.f47798m = true;
    }

    @Override
    public boolean a(e1 e1Var, b2.v0 v0Var, b2.v0 v0Var2) {
        int i10;
        int i11;
        if (v0Var != null && ((i10 = v0Var.f3511a) != (i11 = v0Var2.f3511a) || v0Var.f3512b != v0Var2.f3512b || this.f47799n)) {
            return r(e1Var, v0Var, i10, v0Var.f3512b, i11, v0Var2.f3512b);
        }
        p(e1Var);
        return true;
    }

    public abstract void p(e1 e1Var);

    public abstract boolean q(e1 e1Var, e1 e1Var2, b2.v0 v0Var, int i10, int i11, int i12, int i13);

    public abstract boolean r(e1 e1Var, b2.v0 v0Var, int i10, int i11, int i12, int i13);

    public abstract void s(e1 e1Var, b2.v0 v0Var);

    public boolean t(e1 e1Var) {
        if (this.f47798m && !e1Var.h()) {
            return false;
        }
        return true;
    }

    public final void u(e1 e1Var) {
        w(e1Var);
        d(e1Var);
    }

    public final void v(e1 e1Var) {
        x(e1Var);
        d(e1Var);
    }

    public void y() {
    }

    public void w(e1 e1Var) {
    }

    public void x(e1 e1Var) {
    }
}
