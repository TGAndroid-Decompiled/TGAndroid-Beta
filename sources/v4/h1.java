package v4;

import java.util.ArrayList;
public abstract class h1 extends n0 {
    public boolean f59194m;
    public boolean f59195n;

    public h1() {
        this.f59236a = null;
        this.f59237b = new ArrayList();
        this.f59238c = 120L;
        this.d = 120L;
        this.f59239e = 250L;
        this.f59240f = 250L;
        this.f59241g = 250L;
        this.f59245l = 0L;
        this.f59194m = true;
    }

    @Override
    public boolean a(f1 f1Var, e2.r0 r0Var, e2.r0 r0Var2) {
        int i7;
        int i10;
        if (r0Var != null && ((i7 = r0Var.f10716a) != (i10 = r0Var2.f10716a) || r0Var.f10717b != r0Var2.f10717b || this.f59195n)) {
            return r(f1Var, r0Var, i7, r0Var.f10717b, i10, r0Var2.f10717b);
        }
        p(f1Var);
        return true;
    }

    public abstract void p(f1 f1Var);

    public abstract boolean q(f1 f1Var, f1 f1Var2, e2.r0 r0Var, int i7, int i10, int i11, int i12);

    public abstract boolean r(f1 f1Var, e2.r0 r0Var, int i7, int i10, int i11, int i12);

    public abstract void s(f1 f1Var, e2.r0 r0Var);

    public boolean t(f1 f1Var) {
        if (this.f59194m && !f1Var.h()) {
            return false;
        }
        return true;
    }

    public final void u(f1 f1Var) {
        w(f1Var);
        d(f1Var);
    }

    public final void v(f1 f1Var) {
        x(f1Var);
        d(f1Var);
    }

    public void y() {
    }

    public void w(f1 f1Var) {
    }

    public void x(f1 f1Var) {
    }
}
