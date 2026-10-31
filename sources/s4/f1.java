package s4;

import java.util.ArrayList;
public abstract class f1 extends l0 {
    public boolean f47927m;
    public boolean f47928n;

    public f1() {
        this.f47965a = null;
        this.f47966b = new ArrayList();
        this.f47967c = 120L;
        this.d = 120L;
        this.e = 250L;
        this.f47968f = 250L;
        this.f47969g = 250L;
        this.f47973l = 0L;
        this.f47927m = true;
    }

    @Override
    public boolean a(c1 c1Var, ac.g gVar, ac.g gVar2) {
        int i10;
        int i11;
        if (gVar != null && ((i10 = gVar.f385a) != (i11 = gVar2.f385a) || gVar.f386b != gVar2.f386b || this.f47928n)) {
            return r(c1Var, gVar, i10, gVar.f386b, i11, gVar2.f386b);
        }
        p(c1Var);
        return true;
    }

    public abstract void p(c1 c1Var);

    public abstract boolean q(c1 c1Var, c1 c1Var2, ac.g gVar, int i10, int i11, int i12, int i13);

    public abstract boolean r(c1 c1Var, ac.g gVar, int i10, int i11, int i12, int i13);

    public abstract void s(c1 c1Var, ac.g gVar);

    public boolean t(c1 c1Var) {
        if (this.f47927m && !c1Var.h()) {
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
