package x2;

import java.io.IOException;
public final class u0 implements d1 {
    public final int f60253a;
    public final w0 f60254b;

    public u0(w0 w0Var, int i7) {
        this.f60254b = w0Var;
        this.f60253a = i7;
    }

    @Override
    public final void a() {
        int i7 = this.f60253a;
        w0 w0Var = this.f60254b;
        w0Var.M[i7].C();
        b3.p pVar = w0Var.f60282y;
        int R4 = w0Var.d.R4(w0Var.W);
        IOException iOException = pVar.f2886c;
        if (iOException == null) {
            b3.l lVar = pVar.f2885b;
            if (lVar != null) {
                if (R4 == Integer.MIN_VALUE) {
                    R4 = lVar.f2874a;
                }
                IOException iOException2 = lVar.f2877e;
                if (iOException2 != null && lVar.f2878f > R4) {
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
        w0 w0Var = this.f60254b;
        if (!w0Var.E() && w0Var.M[this.f60253a].A(w0Var.f60275h0)) {
            return true;
        }
        return false;
    }

    @Override
    public final int j(long j3) {
        w0 w0Var = this.f60254b;
        if (w0Var.E()) {
            return 0;
        }
        int i7 = this.f60253a;
        w0Var.y(i7);
        c1 c1Var = w0Var.M[i7];
        int x10 = c1Var.x(j3, w0Var.f60275h0);
        c1Var.L(x10);
        if (x10 == 0) {
            w0Var.A(i7);
        }
        return x10;
    }

    @Override
    public final int m(k8.a aVar, k2.h hVar, int i7) {
        w0 w0Var = this.f60254b;
        if (w0Var.E()) {
            return -3;
        }
        int i10 = this.f60253a;
        w0Var.y(i10);
        int F = w0Var.M[i10].F(aVar, hVar, i7, w0Var.f60275h0);
        if (F == -3) {
            w0Var.A(i10);
        }
        return F;
    }
}
