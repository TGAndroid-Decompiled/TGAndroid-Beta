package u2;

import java.io.IOException;
public final class r0 implements a1 {
    public final int f43405a;
    public final t0 f43406b;

    public r0(t0 t0Var, int i10) {
        this.f43406b = t0Var;
        this.f43405a = i10;
    }

    @Override
    public final void a() {
        int i10 = this.f43405a;
        t0 t0Var = this.f43406b;
        t0Var.K[i10].z();
        y2.m mVar = t0Var.f43430x;
        int L3 = t0Var.d.L3(t0Var.U);
        IOException iOException = mVar.f46251c;
        if (iOException == null) {
            y2.i iVar = mVar.f46250b;
            if (iVar != null) {
                if (L3 == Integer.MIN_VALUE) {
                    L3 = iVar.f46241a;
                }
                IOException iOException2 = iVar.e;
                if (iOException2 != null && iVar.f46244f > L3) {
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
        t0 t0Var = this.f43406b;
        if (!t0Var.C() && t0Var.K[this.f43405a].x(t0Var.f43423e0)) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(n4.y yVar, h2.h hVar, int i10) {
        t0 t0Var = this.f43406b;
        if (t0Var.C()) {
            return -3;
        }
        int i11 = this.f43405a;
        t0Var.x(i11);
        int C = t0Var.K[i11].C(yVar, hVar, i10, t0Var.f43423e0);
        if (C == -3) {
            t0Var.y(i11);
        }
        return C;
    }

    @Override
    public final int j(long j3) {
        t0 t0Var = this.f43406b;
        if (t0Var.C()) {
            return 0;
        }
        int i10 = this.f43405a;
        t0Var.x(i10);
        z0 z0Var = t0Var.K[i10];
        int v = z0Var.v(j3, t0Var.f43423e0);
        z0Var.H(v);
        if (v == 0) {
            t0Var.y(i10);
        }
        return v;
    }
}
