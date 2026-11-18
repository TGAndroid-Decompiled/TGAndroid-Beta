package v4;

import java.util.ArrayList;
public abstract class h1 extends n0 {
    public boolean f59151m;
    public boolean f59152n;

    public h1() {
        this.f59193a = null;
        this.f59194b = new ArrayList();
        this.f59195c = 120L;
        this.d = 120L;
        this.f59196e = 250L;
        this.f59197f = 250L;
        this.f59198g = 250L;
        this.f59202l = 0L;
        this.f59151m = true;
    }

    @Override
    public boolean a(f1 f1Var, e2.r0 r0Var, e2.r0 r0Var2) {
        int i7;
        int i10;
        if (r0Var != null && ((i7 = r0Var.f10687a) != (i10 = r0Var2.f10687a) || r0Var.f10688b != r0Var2.f10688b || this.f59152n)) {
            return r(f1Var, r0Var, i7, r0Var.f10688b, i10, r0Var2.f10688b);
        }
        p(f1Var);
        return true;
    }

    public abstract void p(f1 f1Var);

    public abstract boolean q(f1 f1Var, f1 f1Var2, e2.r0 r0Var, int i7, int i10, int i11, int i12);

    public abstract boolean r(f1 f1Var, e2.r0 r0Var, int i7, int i10, int i11, int i12);

    public abstract void s(f1 f1Var, e2.r0 r0Var);

    public boolean t(f1 f1Var) {
        if (this.f59151m && !f1Var.h()) {
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
