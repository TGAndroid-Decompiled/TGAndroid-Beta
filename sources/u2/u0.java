package u2;

import java.io.IOException;
public final class u0 implements d1 {
    public final int f42457a;
    public final w0 f42458b;

    public u0(w0 w0Var, int i10) {
        this.f42458b = w0Var;
        this.f42457a = i10;
    }

    @Override
    public final void a() {
        int i10 = this.f42457a;
        w0 w0Var = this.f42458b;
        w0Var.K[i10].z();
        y2.n nVar = w0Var.f42481x;
        int o32 = w0Var.d.o3(w0Var.U);
        IOException iOException = nVar.f46447c;
        if (iOException == null) {
            y2.j jVar = nVar.f46446b;
            if (jVar != null) {
                if (o32 == Integer.MIN_VALUE) {
                    o32 = jVar.f46437a;
                }
                IOException iOException2 = jVar.e;
                if (iOException2 != null && jVar.f46440f > o32) {
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
        w0 w0Var = this.f42458b;
        if (!w0Var.E() && w0Var.K[this.f42457a].x(w0Var.f42474e0)) {
            return true;
        }
        return false;
    }

    @Override
    public final int g(long j3) {
        w0 w0Var = this.f42458b;
        if (w0Var.E()) {
            return 0;
        }
        int i10 = this.f42457a;
        w0Var.x(i10);
        c1 c1Var = w0Var.K[i10];
        int v = c1Var.v(j3, w0Var.f42474e0);
        c1Var.H(v);
        if (v == 0) {
            w0Var.y(i10);
        }
        return v;
    }

    @Override
    public final int t(of.b bVar, h2.h hVar, int i10) {
        w0 w0Var = this.f42458b;
        if (w0Var.E()) {
            return -3;
        }
        int i11 = this.f42457a;
        w0Var.x(i11);
        int C = w0Var.K[i11].C(bVar, hVar, i10, w0Var.f42474e0);
        if (C == -3) {
            w0Var.y(i11);
        }
        return C;
    }
}
