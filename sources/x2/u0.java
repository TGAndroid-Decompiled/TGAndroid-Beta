package x2;

import java.io.IOException;
public final class u0 implements d1 {
    public final int f60242a;
    public final w0 f60243b;

    public u0(w0 w0Var, int i7) {
        this.f60243b = w0Var;
        this.f60242a = i7;
    }

    @Override
    public final void a() {
        int i7 = this.f60242a;
        w0 w0Var = this.f60243b;
        w0Var.M[i7].C();
        b3.p pVar = w0Var.f60271y;
        int R4 = w0Var.d.R4(w0Var.W);
        IOException iOException = pVar.f2915c;
        if (iOException == null) {
            b3.l lVar = pVar.f2914b;
            if (lVar != null) {
                if (R4 == Integer.MIN_VALUE) {
                    R4 = lVar.f2903a;
                }
                IOException iOException2 = lVar.f2906e;
                if (iOException2 != null && lVar.f2907f > R4) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    @Override
    public final boolean h() {
        w0 w0Var = this.f60243b;
        if (!w0Var.E() && w0Var.M[this.f60242a].A(w0Var.f60264h0)) {
            return true;
        }
        return false;
    }

    @Override
    public final int j(long j3) {
        w0 w0Var = this.f60243b;
        if (w0Var.E()) {
            return 0;
        }
        int i7 = this.f60242a;
        w0Var.y(i7);
        c1 c1Var = w0Var.M[i7];
        int x10 = c1Var.x(j3, w0Var.f60264h0);
        c1Var.L(x10);
        if (x10 == 0) {
            w0Var.A(i7);
        }
        return x10;
    }

    @Override
    public final int m(k8.a aVar, k2.h hVar, int i7) {
        w0 w0Var = this.f60243b;
        if (w0Var.E()) {
            return -3;
        }
        int i10 = this.f60242a;
        w0Var.y(i10);
        int F = w0Var.M[i10].F(aVar, hVar, i7, w0Var.f60264h0);
        if (F == -3) {
            w0Var.A(i10);
        }
        return F;
    }
}
