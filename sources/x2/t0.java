package x2;

import java.io.IOException;
public final class t0 implements b1 {
    public final int f59670a;
    public final v0 f59671b;

    public t0(v0 v0Var, int i7) {
        this.f59671b = v0Var;
        this.f59670a = i7;
    }

    @Override
    public final void a() {
        int i7 = this.f59670a;
        v0 v0Var = this.f59671b;
        v0Var.M[i7].C();
        b3.o oVar = v0Var.f59699y;
        int R4 = v0Var.d.R4(v0Var.W);
        IOException iOException = oVar.f2921c;
        if (iOException == null) {
            b3.k kVar = oVar.f2920b;
            if (kVar != null) {
                if (R4 == Integer.MIN_VALUE) {
                    R4 = kVar.f2909a;
                }
                IOException iOException2 = kVar.f2912e;
                if (iOException2 != null && kVar.f2913f > R4) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    @Override
    public final boolean f() {
        v0 v0Var = this.f59671b;
        if (!v0Var.E() && v0Var.M[this.f59670a].A(v0Var.f59692h0)) {
            return true;
        }
        return false;
    }

    @Override
    public final int n(long j3) {
        v0 v0Var = this.f59671b;
        if (v0Var.E()) {
            return 0;
        }
        int i7 = this.f59670a;
        v0Var.z(i7);
        a1 a1Var = v0Var.M[i7];
        int x10 = a1Var.x(j3, v0Var.f59692h0);
        a1Var.L(x10);
        if (x10 == 0) {
            v0Var.A(i7);
        }
        return x10;
    }

    @Override
    public final int q(k8.a aVar, k2.h hVar, int i7) {
        v0 v0Var = this.f59671b;
        if (v0Var.E()) {
            return -3;
        }
        int i10 = this.f59670a;
        v0Var.z(i10);
        int F = v0Var.M[i10].F(aVar, hVar, i7, v0Var.f59692h0);
        if (F == -3) {
            v0Var.A(i10);
        }
        return F;
    }
}
