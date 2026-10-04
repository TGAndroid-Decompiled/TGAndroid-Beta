package u2;

import java.io.IOException;
public final class t0 implements c1 {
    public final int f47403a;
    public final v0 f47404b;

    public t0(v0 v0Var, int i10) {
        this.f47404b = v0Var;
        this.f47403a = i10;
    }

    @Override
    public final void a() {
        int i10 = this.f47403a;
        v0 v0Var = this.f47404b;
        v0Var.K[i10].z();
        y2.l lVar = v0Var.f47428x;
        int L3 = v0Var.d.L3(v0Var.U);
        IOException iOException = lVar.f50410c;
        if (iOException == null) {
            y2.h hVar = lVar.f50409b;
            if (hVar != null) {
                if (L3 == Integer.MIN_VALUE) {
                    L3 = hVar.f50398a;
                }
                IOException iOException2 = hVar.f50401e;
                if (iOException2 != null && hVar.f50402f > L3) {
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
        v0 v0Var = this.f47404b;
        if (!v0Var.C() && v0Var.K[this.f47403a].x(v0Var.f47421e0)) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(n4.y yVar, h2.h hVar, int i10) {
        v0 v0Var = this.f47404b;
        if (v0Var.C()) {
            return -3;
        }
        int i11 = this.f47403a;
        v0Var.x(i11);
        int C = v0Var.K[i11].C(yVar, hVar, i10, v0Var.f47421e0);
        if (C == -3) {
            v0Var.y(i11);
        }
        return C;
    }

    @Override
    public final int j(long j3) {
        v0 v0Var = this.f47404b;
        if (v0Var.C()) {
            return 0;
        }
        int i10 = this.f47403a;
        v0Var.x(i10);
        b1 b1Var = v0Var.K[i10];
        int v = b1Var.v(j3, v0Var.f47421e0);
        b1Var.H(v);
        if (v == 0) {
            v0Var.y(i10);
        }
        return v;
    }
}
