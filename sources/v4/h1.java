package v4;

import java.util.ArrayList;
public abstract class h1 extends n0 {
    public boolean f59152m;
    public boolean f59153n;

    public h1() {
        this.f59194a = null;
        this.f59195b = new ArrayList();
        this.f59196c = 120L;
        this.d = 120L;
        this.f59197e = 250L;
        this.f59198f = 250L;
        this.f59199g = 250L;
        this.f59203l = 0L;
        this.f59152m = true;
    }

    @Override
    public boolean a(f1 f1Var, e2.r0 r0Var, e2.r0 r0Var2) {
        int i7;
        int i10;
        if (r0Var != null && ((i7 = r0Var.f10684a) != (i10 = r0Var2.f10684a) || r0Var.f10685b != r0Var2.f10685b || this.f59153n)) {
            return r(f1Var, r0Var, i7, r0Var.f10685b, i10, r0Var2.f10685b);
        }
        p(f1Var);
        return true;
    }

    public abstract void p(f1 f1Var);

    public abstract boolean q(f1 f1Var, f1 f1Var2, e2.r0 r0Var, int i7, int i10, int i11, int i12);

    public abstract boolean r(f1 f1Var, e2.r0 r0Var, int i7, int i10, int i11, int i12);

    public abstract void s(f1 f1Var, e2.r0 r0Var);

    public boolean t(f1 f1Var) {
        if (this.f59152m && !f1Var.h()) {
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
