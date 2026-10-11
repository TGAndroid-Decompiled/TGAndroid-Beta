package u2;

import java.io.IOException;
public final class r0 implements a1 {
    public final int f48766a;
    public final t0 f48767b;

    public r0(t0 t0Var, int i10) {
        this.f48767b = t0Var;
        this.f48766a = i10;
    }

    @Override
    public final void a() {
        int i10 = this.f48766a;
        t0 t0Var = this.f48767b;
        t0Var.K[i10].z();
        y2.l lVar = t0Var.f48793x;
        int m32 = t0Var.d.m3(t0Var.U);
        IOException iOException = lVar.f51785c;
        if (iOException == null) {
            y2.h hVar = lVar.f51784b;
            if (hVar != null) {
                if (m32 == Integer.MIN_VALUE) {
                    m32 = hVar.f51773a;
                }
                IOException iOException2 = hVar.f51776e;
                if (iOException2 != null && hVar.f51777f > m32) {
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
        t0 t0Var = this.f48767b;
        if (!t0Var.A() && t0Var.K[this.f48766a].x(t0Var.f48786e0)) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(n4.x xVar, h2.h hVar, int i10) {
        t0 t0Var = this.f48767b;
        if (t0Var.A()) {
            return -3;
        }
        int i11 = this.f48766a;
        t0Var.u(i11);
        int C = t0Var.K[i11].C(xVar, hVar, i10, t0Var.f48786e0);
        if (C == -3) {
            t0Var.v(i11);
        }
        return C;
    }

    @Override
    public final int j(long j3) {
        t0 t0Var = this.f48767b;
        if (t0Var.A()) {
            return 0;
        }
        int i10 = this.f48766a;
        t0Var.u(i10);
        z0 z0Var = t0Var.K[i10];
        int v = z0Var.v(j3, t0Var.f48786e0);
        z0Var.H(v);
        if (v == 0) {
            t0Var.v(i10);
        }
        return v;
    }
}
