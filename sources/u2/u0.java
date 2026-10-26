package u2;

import java.io.IOException;
public final class u0 implements d1 {
    public final int f49440a;
    public final w0 f49441b;

    public u0(w0 w0Var, int i10) {
        this.f49441b = w0Var;
        this.f49440a = i10;
    }

    @Override
    public final void d() {
        int i10 = this.f49440a;
        w0 w0Var = this.f49441b;
        w0Var.L[i10].C();
        y2.l lVar = w0Var.f49466x;
        int B0 = w0Var.d.B0(w0Var.V);
        IOException iOException = lVar.f51966c;
        if (iOException == null) {
            y2.h hVar = lVar.f51965b;
            if (hVar != null) {
                if (B0 == Integer.MIN_VALUE) {
                    B0 = hVar.f51956a;
                }
                IOException iOException2 = hVar.e;
                if (iOException2 != null && hVar.f51959f > B0) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    @Override
    public final boolean e() {
        w0 w0Var = this.f49441b;
        if (!w0Var.C() && w0Var.L[this.f49440a].A(w0Var.f49460g0)) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(n4.s sVar, h2.h hVar, int i10) {
        w0 w0Var = this.f49441b;
        if (w0Var.C()) {
            return -3;
        }
        int i11 = this.f49440a;
        w0Var.u(i11);
        int F = w0Var.L[i11].F(sVar, hVar, i10, w0Var.f49460g0);
        if (F == -3) {
            w0Var.v(i11);
        }
        return F;
    }

    @Override
    public final int j(long j10) {
        w0 w0Var = this.f49441b;
        if (w0Var.C()) {
            return 0;
        }
        int i10 = this.f49440a;
        w0Var.u(i10);
        c1 c1Var = w0Var.L[i10];
        int x9 = c1Var.x(j10, w0Var.f49460g0);
        c1Var.L(x9);
        if (x9 == 0) {
            w0Var.v(i10);
        }
        return x9;
    }
}
