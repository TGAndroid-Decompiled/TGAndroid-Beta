package s4;

import java.util.ArrayList;
public abstract class e1 extends l0 {
    public boolean f45944m;
    public boolean f45945n;

    public e1() {
        this.f45987a = null;
        this.f45988b = new ArrayList();
        this.f45989c = 120L;
        this.d = 120L;
        this.e = 250L;
        this.f45990f = 250L;
        this.f45991g = 250L;
        this.f45995l = 0L;
        this.f45944m = true;
    }

    @Override
    public boolean a(b1 b1Var, b2.u0 u0Var, b2.u0 u0Var2) {
        int i10;
        int i11;
        if (u0Var != null && ((i10 = u0Var.f4055a) != (i11 = u0Var2.f4055a) || u0Var.f4056b != u0Var2.f4056b || this.f45945n)) {
            return r(b1Var, u0Var, i10, u0Var.f4056b, i11, u0Var2.f4056b);
        }
        p(b1Var);
        return true;
    }

    public abstract void p(b1 b1Var);

    public abstract boolean q(b1 b1Var, b1 b1Var2, b2.u0 u0Var, int i10, int i11, int i12, int i13);

    public abstract boolean r(b1 b1Var, b2.u0 u0Var, int i10, int i11, int i12, int i13);

    public abstract void s(b1 b1Var, b2.u0 u0Var);

    public boolean t(b1 b1Var) {
        if (this.f45944m && !b1Var.h()) {
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
