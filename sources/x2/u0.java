package x2;

import java.io.IOException;
public final class u0 implements c1 {
    public final int f58386a;
    public final w0 f58387b;

    public u0(w0 w0Var, int i7) {
        this.f58387b = w0Var;
        this.f58386a = i7;
    }

    @Override
    public final void a() {
        int i7 = this.f58386a;
        w0 w0Var = this.f58387b;
        w0Var.L[i7].C();
        b3.o oVar = w0Var.f58414y;
        int X0 = w0Var.d.X0(w0Var.V);
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
        w0 w0Var = this.f58387b;
        if (!w0Var.A() && w0Var.L[this.f58386a].A(w0Var.f58407g0)) {
            return true;
        }
        return false;
    }

    @Override
    public final int l(long j3) {
        w0 w0Var = this.f58387b;
        if (w0Var.A()) {
            return 0;
        }
        int i7 = this.f58386a;
        w0Var.v(i7);
        b1 b1Var = w0Var.L[i7];
        int x10 = b1Var.x(j3, w0Var.f58407g0);
        b1Var.L(x10);
        if (x10 == 0) {
            w0Var.w(i7);
        }
        return x10;
    }

    @Override
    public final int m(wf.b bVar, k2.h hVar, int i7) {
        w0 w0Var = this.f58387b;
        if (w0Var.A()) {
            return -3;
        }
        int i10 = this.f58386a;
        w0Var.v(i10);
        int F = w0Var.L[i10].F(bVar, hVar, i7, w0Var.f58407g0);
        if (F == -3) {
            w0Var.w(i10);
        }
        return F;
    }
}
