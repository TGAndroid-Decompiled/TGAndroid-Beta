package u2;

import java.io.IOException;
public final class t0 implements c1 {
    public final int f43807a;
    public final v0 f43808b;

    public t0(v0 v0Var, int i10) {
        this.f43808b = v0Var;
        this.f43807a = i10;
    }

    @Override
    public final void a() {
        int i10 = this.f43807a;
        v0 v0Var = this.f43808b;
        v0Var.K[i10].z();
        y2.m mVar = v0Var.f43831x;
        int L3 = v0Var.d.L3(v0Var.U);
        IOException iOException = mVar.f46620c;
        if (iOException == null) {
            y2.i iVar = mVar.f46619b;
            if (iVar != null) {
                if (L3 == Integer.MIN_VALUE) {
                    L3 = iVar.f46610a;
                }
                IOException iOException2 = iVar.e;
                if (iOException2 != null && iVar.f46613f > L3) {
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
        v0 v0Var = this.f43808b;
        if (!v0Var.C() && v0Var.K[this.f43807a].x(v0Var.f43824e0)) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(n4.y yVar, h2.h hVar, int i10) {
        v0 v0Var = this.f43808b;
        if (v0Var.C()) {
            return -3;
        }
        int i11 = this.f43807a;
        v0Var.x(i11);
        int C = v0Var.K[i11].C(yVar, hVar, i10, v0Var.f43824e0);
        if (C == -3) {
            v0Var.y(i11);
        }
        return C;
    }

    @Override
    public final int j(long j3) {
        v0 v0Var = this.f43808b;
        if (v0Var.C()) {
            return 0;
        }
        int i10 = this.f43807a;
        v0Var.x(i10);
        b1 b1Var = v0Var.K[i10];
        int v = b1Var.v(j3, v0Var.f43824e0);
        b1Var.H(v);
        if (v == 0) {
            v0Var.y(i10);
        }
        return v;
    }
}
