package u2;

import java.io.IOException;
public final class u0 implements d1 {
    public final int f46058a;
    public final w0 f46059b;

    public u0(w0 w0Var, int i10) {
        this.f46059b = w0Var;
        this.f46058a = i10;
    }

    @Override
    public final void b() {
        int i10 = this.f46058a;
        w0 w0Var = this.f46059b;
        w0Var.L[i10].C();
        y2.l lVar = w0Var.f46084x;
        int y3 = w0Var.d.y3(w0Var.V);
        IOException iOException = lVar.f48544c;
        if (iOException == null) {
            y2.h hVar = lVar.f48543b;
            if (hVar != null) {
                if (y3 == Integer.MIN_VALUE) {
                    y3 = hVar.f48534a;
                }
                IOException iOException2 = hVar.e;
                if (iOException2 != null && hVar.f48537f > y3) {
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
        w0 w0Var = this.f46059b;
        if (!w0Var.C() && w0Var.L[this.f46058a].A(w0Var.f46078g0)) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(qf.b bVar, h2.h hVar, int i10) {
        w0 w0Var = this.f46059b;
        if (w0Var.C()) {
            return -3;
        }
        int i11 = this.f46058a;
        w0Var.u(i11);
        int F = w0Var.L[i11].F(bVar, hVar, i10, w0Var.f46078g0);
        if (F == -3) {
            w0Var.v(i11);
        }
        return F;
    }

    @Override
    public final int j(long j10) {
        w0 w0Var = this.f46059b;
        if (w0Var.C()) {
            return 0;
        }
        int i10 = this.f46058a;
        w0Var.u(i10);
        c1 c1Var = w0Var.L[i10];
        int x10 = c1Var.x(j10, w0Var.f46078g0);
        c1Var.L(x10);
        if (x10 == 0) {
            w0Var.v(i10);
        }
        return x10;
    }
}
