package u2;

import java.io.IOException;
public final class s0 implements b1 {
    public final int f46830a;
    public final u0 f46831b;

    public s0(u0 u0Var, int i10) {
        this.f46831b = u0Var;
        this.f46830a = i10;
    }

    @Override
    public final void b() {
        int i10 = this.f46830a;
        u0 u0Var = this.f46831b;
        u0Var.K[i10].z();
        y2.m mVar = u0Var.f46854x;
        int L3 = u0Var.d.L3(u0Var.U);
        IOException iOException = mVar.f49549c;
        if (iOException == null) {
            y2.i iVar = mVar.f49548b;
            if (iVar != null) {
                if (L3 == Integer.MIN_VALUE) {
                    L3 = iVar.f49537a;
                }
                IOException iOException2 = iVar.f49540e;
                if (iOException2 != null && iVar.f49541f > L3) {
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
        u0 u0Var = this.f46831b;
        if (!u0Var.D() && u0Var.K[this.f46830a].x(u0Var.f46847e0)) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(n4.y yVar, h2.h hVar, int i10) {
        u0 u0Var = this.f46831b;
        if (u0Var.D()) {
            return -3;
        }
        int i11 = this.f46830a;
        u0Var.y(i11);
        int C = u0Var.K[i11].C(yVar, hVar, i10, u0Var.f46847e0);
        if (C == -3) {
            u0Var.z(i11);
        }
        return C;
    }

    @Override
    public final int m(long j3) {
        u0 u0Var = this.f46831b;
        if (u0Var.D()) {
            return 0;
        }
        int i10 = this.f46830a;
        u0Var.y(i10);
        a1 a1Var = u0Var.K[i10];
        int v = a1Var.v(j3, u0Var.f46847e0);
        a1Var.H(v);
        if (v == 0) {
            u0Var.z(i10);
        }
        return v;
    }
}
