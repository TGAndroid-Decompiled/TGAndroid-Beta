package v4;

import java.util.ArrayList;
public abstract class f1 extends l0 {
    public boolean f57083m;
    public boolean f57084n;

    public f1() {
        this.f57126a = null;
        this.f57127b = new ArrayList();
        this.f57128c = 120L;
        this.d = 120L;
        this.f57129e = 250L;
        this.f57130f = 250L;
        this.f57131g = 250L;
        this.f57135l = 0L;
        this.f57083m = true;
    }

    @Override
    public boolean a(d1 d1Var, e2.r0 r0Var, e2.r0 r0Var2) {
        int i7;
        int i10;
        if (r0Var != null && ((i7 = r0Var.f10533a) != (i10 = r0Var2.f10533a) || r0Var.f10534b != r0Var2.f10534b || this.f57084n)) {
            return r(d1Var, r0Var, i7, r0Var.f10534b, i10, r0Var2.f10534b);
        }
        p(d1Var);
        return true;
    }

    public abstract void p(d1 d1Var);

    public abstract boolean q(d1 d1Var, d1 d1Var2, e2.r0 r0Var, int i7, int i10, int i11, int i12);

    public abstract boolean r(d1 d1Var, e2.r0 r0Var, int i7, int i10, int i11, int i12);

    public abstract void s(d1 d1Var, e2.r0 r0Var);

    public boolean t(d1 d1Var) {
        if (this.f57083m && !d1Var.h()) {
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
