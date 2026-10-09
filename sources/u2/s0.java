package u2;

import java.io.IOException;
public final class s0 implements b1 {
    public final int f48706a;
    public final u0 f48707b;

    public s0(u0 u0Var, int i10) {
        this.f48707b = u0Var;
        this.f48706a = i10;
    }

    @Override
    public final void a() {
        int i10 = this.f48706a;
        u0 u0Var = this.f48707b;
        u0Var.K[i10].z();
        y2.l lVar = u0Var.f48730x;
        int m32 = u0Var.d.m3(u0Var.U);
        IOException iOException = lVar.f51698c;
        if (iOException == null) {
            y2.h hVar = lVar.f51697b;
            if (hVar != null) {
                if (m32 == Integer.MIN_VALUE) {
                    m32 = hVar.f51686a;
                }
                IOException iOException2 = hVar.f51689e;
                if (iOException2 != null && hVar.f51690f > m32) {
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
        u0 u0Var = this.f48707b;
        if (!u0Var.A() && u0Var.K[this.f48706a].x(u0Var.f48723e0)) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(n4.x xVar, h2.h hVar, int i10) {
        u0 u0Var = this.f48707b;
        if (u0Var.A()) {
            return -3;
        }
        int i11 = this.f48706a;
        u0Var.u(i11);
        int C = u0Var.K[i11].C(xVar, hVar, i10, u0Var.f48723e0);
        if (C == -3) {
            u0Var.v(i11);
        }
        return C;
    }

    @Override
    public final int j(long j3) {
        u0 u0Var = this.f48707b;
        if (u0Var.A()) {
            return 0;
        }
        int i10 = this.f48706a;
        u0Var.u(i10);
        a1 a1Var = u0Var.K[i10];
        int v = a1Var.v(j3, u0Var.f48723e0);
        a1Var.H(v);
        if (v == 0) {
            u0Var.v(i10);
        }
        return v;
    }
}
