package u2;

import java.io.IOException;
public final class t0 implements c1 {
    public final int f47395a;
    public final v0 f47396b;

    public t0(v0 v0Var, int i10) {
        this.f47396b = v0Var;
        this.f47395a = i10;
    }

    @Override
    public final void a() {
        int i10 = this.f47395a;
        v0 v0Var = this.f47396b;
        v0Var.K[i10].z();
        y2.l lVar = v0Var.f47420x;
        int L3 = v0Var.d.L3(v0Var.U);
        IOException iOException = lVar.f50402c;
        if (iOException == null) {
            y2.h hVar = lVar.f50401b;
            if (hVar != null) {
                if (L3 == Integer.MIN_VALUE) {
                    L3 = hVar.f50390a;
                }
                IOException iOException2 = hVar.f50393e;
                if (iOException2 != null && hVar.f50394f > L3) {
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
        v0 v0Var = this.f47396b;
        if (!v0Var.C() && v0Var.K[this.f47395a].x(v0Var.f47413e0)) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(n4.y yVar, h2.h hVar, int i10) {
        v0 v0Var = this.f47396b;
        if (v0Var.C()) {
            return -3;
        }
        int i11 = this.f47395a;
        v0Var.x(i11);
        int C = v0Var.K[i11].C(yVar, hVar, i10, v0Var.f47413e0);
        if (C == -3) {
            v0Var.y(i11);
        }
        return C;
    }

    @Override
    public final int j(long j3) {
        v0 v0Var = this.f47396b;
        if (v0Var.C()) {
            return 0;
        }
        int i10 = this.f47395a;
        v0Var.x(i10);
        b1 b1Var = v0Var.K[i10];
        int v = b1Var.v(j3, v0Var.f47413e0);
        b1Var.H(v);
        if (v == 0) {
            v0Var.y(i10);
        }
        return v;
    }
}
