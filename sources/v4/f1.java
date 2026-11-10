package v4;

import java.util.ArrayList;
public abstract class f1 extends l0 {
    public boolean f57079m;
    public boolean f57080n;

    public f1() {
        this.f57122a = null;
        this.f57123b = new ArrayList();
        this.f57124c = 120L;
        this.d = 120L;
        this.f57125e = 250L;
        this.f57126f = 250L;
        this.f57127g = 250L;
        this.f57131l = 0L;
        this.f57079m = true;
    }

    @Override
    public boolean a(d1 d1Var, e2.r0 r0Var, e2.r0 r0Var2) {
        int i7;
        int i10;
        if (r0Var != null && ((i7 = r0Var.f10538a) != (i10 = r0Var2.f10538a) || r0Var.f10539b != r0Var2.f10539b || this.f57080n)) {
            return r(d1Var, r0Var, i7, r0Var.f10539b, i10, r0Var2.f10539b);
        }
        p(d1Var);
        return true;
    }

    public abstract void p(d1 d1Var);

    public abstract boolean q(d1 d1Var, d1 d1Var2, e2.r0 r0Var, int i7, int i10, int i11, int i12);

    public abstract boolean r(d1 d1Var, e2.r0 r0Var, int i7, int i10, int i11, int i12);

    public abstract void s(d1 d1Var, e2.r0 r0Var);

    public boolean t(d1 d1Var) {
        if (this.f57079m && !d1Var.h()) {
            return false;
        }
        return true;
    }

    public final void u(d1 d1Var) {
        w(d1Var);
        d(d1Var);
    }

    public final void v(d1 d1Var) {
        x(d1Var);
        d(d1Var);
    }

    public void y() {
    }

    public void w(d1 d1Var) {
    }

    public void x(d1 d1Var) {
    }
}
