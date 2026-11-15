package v4;

import java.util.ArrayList;
public abstract class g1 extends m0 {
    public boolean f58564m;
    public boolean f58565n;

    public g1() {
        this.f58606a = null;
        this.f58607b = new ArrayList();
        this.f58608c = 120L;
        this.d = 120L;
        this.f58609e = 250L;
        this.f58610f = 250L;
        this.f58611g = 250L;
        this.f58615l = 0L;
        this.f58564m = true;
    }

    @Override
    public boolean a(e1 e1Var, e2.r0 r0Var, e2.r0 r0Var2) {
        int i7;
        int i10;
        if (r0Var != null && ((i7 = r0Var.f10369a) != (i10 = r0Var2.f10369a) || r0Var.f10370b != r0Var2.f10370b || this.f58565n)) {
            return r(e1Var, r0Var, i7, r0Var.f10370b, i10, r0Var2.f10370b);
        }
        p(e1Var);
        return true;
    }

    public abstract void p(e1 e1Var);

    public abstract boolean q(e1 e1Var, e1 e1Var2, e2.r0 r0Var, int i7, int i10, int i11, int i12);

    public abstract boolean r(e1 e1Var, e2.r0 r0Var, int i7, int i10, int i11, int i12);

    public abstract void s(e1 e1Var, e2.r0 r0Var);

    public boolean t(e1 e1Var) {
        if (this.f58564m && !e1Var.h()) {
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
