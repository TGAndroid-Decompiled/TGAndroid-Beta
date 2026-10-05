package u2;

import java.io.IOException;
public final class t0 implements c1 {
    public final int f47410a;
    public final v0 f47411b;

    public t0(v0 v0Var, int i10) {
        this.f47411b = v0Var;
        this.f47410a = i10;
    }

    @Override
    public final void a() {
        int i10 = this.f47410a;
        v0 v0Var = this.f47411b;
        v0Var.K[i10].z();
        y2.l lVar = v0Var.f47435x;
        int L3 = v0Var.d.L3(v0Var.U);
        IOException iOException = lVar.f50417c;
        if (iOException == null) {
            y2.h hVar = lVar.f50416b;
            if (hVar != null) {
                if (L3 == Integer.MIN_VALUE) {
                    L3 = hVar.f50405a;
                }
                IOException iOException2 = hVar.f50408e;
                if (iOException2 != null && hVar.f50409f > L3) {
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
        v0 v0Var = this.f47411b;
        if (!v0Var.C() && v0Var.K[this.f47410a].x(v0Var.f47428e0)) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(n4.y yVar, h2.h hVar, int i10) {
        v0 v0Var = this.f47411b;
        if (v0Var.C()) {
            return -3;
        }
        int i11 = this.f47410a;
        v0Var.u(i11);
        int C = v0Var.K[i11].C(yVar, hVar, i10, v0Var.f47428e0);
        if (C == -3) {
            v0Var.w(i11);
        }
        return C;
    }

    @Override
    public final int j(long j3) {
        v0 v0Var = this.f47411b;
        if (v0Var.C()) {
            return 0;
        }
        int i10 = this.f47410a;
        v0Var.u(i10);
        b1 b1Var = v0Var.K[i10];
        int v = b1Var.v(j3, v0Var.f47428e0);
        b1Var.H(v);
        if (v == 0) {
            v0Var.w(i10);
        }
        return v;
    }
}
