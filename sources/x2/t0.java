package x2;

import java.io.IOException;
public final class t0 implements b1 {
    public final int f58488a;
    public final v0 f58489b;

    public t0(v0 v0Var, int i7) {
        this.f58489b = v0Var;
        this.f58488a = i7;
    }

    @Override
    public final void a() {
        int i7 = this.f58488a;
        v0 v0Var = this.f58489b;
        v0Var.L[i7].C();
        b3.o oVar = v0Var.f58516y;
        int X0 = v0Var.d.X0(v0Var.V);
        IOException iOException = oVar.f2964c;
        if (iOException == null) {
            b3.k kVar = oVar.f2963b;
            if (kVar != null) {
                if (X0 == Integer.MIN_VALUE) {
                    X0 = kVar.f2952a;
                }
                IOException iOException2 = kVar.f2955e;
                if (iOException2 != null && kVar.f2956f > X0) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    @Override
    public final boolean f() {
        v0 v0Var = this.f58489b;
        if (!v0Var.A() && v0Var.L[this.f58488a].A(v0Var.f58509g0)) {
            return true;
        }
        return false;
    }

    @Override
    public final int l(long j3) {
        v0 v0Var = this.f58489b;
        if (v0Var.A()) {
            return 0;
        }
        int i7 = this.f58488a;
        v0Var.v(i7);
        a1 a1Var = v0Var.L[i7];
        int x10 = a1Var.x(j3, v0Var.f58509g0);
        a1Var.L(x10);
        if (x10 == 0) {
            v0Var.w(i7);
        }
        return x10;
    }

    @Override
    public final int m(wf.b bVar, k2.h hVar, int i7) {
        v0 v0Var = this.f58489b;
        if (v0Var.A()) {
            return -3;
        }
        int i10 = this.f58488a;
        v0Var.v(i10);
        int F = v0Var.L[i10].F(bVar, hVar, i7, v0Var.f58509g0);
        if (F == -3) {
            v0Var.w(i10);
        }
        return F;
    }
}
