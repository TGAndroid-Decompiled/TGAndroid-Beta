package u2;

import java.io.IOException;
public final class r0 implements a1 {
    public final int f48915a;
    public final t0 f48916b;

    public r0(t0 t0Var, int i10) {
        this.f48916b = t0Var;
        this.f48915a = i10;
    }

    @Override
    public final void a() {
        int i10 = this.f48915a;
        t0 t0Var = this.f48916b;
        t0Var.K[i10].z();
        y2.l lVar = t0Var.f48942x;
        int J = t0Var.d.J(t0Var.U);
        IOException iOException = lVar.f51930c;
        if (iOException == null) {
            y2.h hVar = lVar.f51929b;
            if (hVar != null) {
                if (J == Integer.MIN_VALUE) {
                    J = hVar.f51918a;
                }
                IOException iOException2 = hVar.f51921e;
                if (iOException2 != null && hVar.f51922f > J) {
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
        t0 t0Var = this.f48916b;
        if (!t0Var.B() && t0Var.K[this.f48915a].x(t0Var.f48935e0)) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(n4.y yVar, h2.h hVar, int i10) {
        t0 t0Var = this.f48916b;
        if (t0Var.B()) {
            return -3;
        }
        int i11 = this.f48915a;
        t0Var.u(i11);
        int C = t0Var.K[i11].C(yVar, hVar, i10, t0Var.f48935e0);
        if (C == -3) {
            t0Var.v(i11);
        }
        return C;
    }

    @Override
    public final int j(long j3) {
        t0 t0Var = this.f48916b;
        if (t0Var.B()) {
            return 0;
        }
        int i10 = this.f48915a;
        t0Var.u(i10);
        z0 z0Var = t0Var.K[i10];
        int v = z0Var.v(j3, t0Var.f48935e0);
        z0Var.H(v);
        if (v == 0) {
            t0Var.v(i10);
        }
        return v;
    }
}
