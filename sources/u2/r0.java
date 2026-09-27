package u2;

import java.io.IOException;
public final class r0 implements b1 {
    public final int f43806a;
    public final t0 f43807b;

    public r0(t0 t0Var, int i10) {
        this.f43807b = t0Var;
        this.f43806a = i10;
    }

    @Override
    public final void a() {
        int i10 = this.f43806a;
        t0 t0Var = this.f43807b;
        t0Var.K[i10].z();
        y2.l lVar = t0Var.f43831x;
        int L3 = t0Var.d.L3(t0Var.U);
        IOException iOException = lVar.f46621c;
        if (iOException == null) {
            y2.h hVar = lVar.f46620b;
            if (hVar != null) {
                if (L3 == Integer.MIN_VALUE) {
                    L3 = hVar.f46611a;
                }
                IOException iOException2 = hVar.e;
                if (iOException2 != null && hVar.f46614f > L3) {
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
        t0 t0Var = this.f43807b;
        if (!t0Var.C() && t0Var.K[this.f43806a].x(t0Var.f43824e0)) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(n4.y yVar, h2.h hVar, int i10) {
        t0 t0Var = this.f43807b;
        if (t0Var.C()) {
            return -3;
        }
        int i11 = this.f43806a;
        t0Var.x(i11);
        int C = t0Var.K[i11].C(yVar, hVar, i10, t0Var.f43824e0);
        if (C == -3) {
            t0Var.y(i11);
        }
        return C;
    }

    @Override
    public final int h(long j3) {
        t0 t0Var = this.f43807b;
        if (t0Var.C()) {
            return 0;
        }
        int i10 = this.f43806a;
        t0Var.x(i10);
        a1 a1Var = t0Var.K[i10];
        int v = a1Var.v(j3, t0Var.f43824e0);
        a1Var.H(v);
        if (v == 0) {
            t0Var.y(i10);
        }
        return v;
    }
}
