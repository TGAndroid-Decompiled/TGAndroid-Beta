package u2;

import java.io.IOException;
public final class u0 implements d1 {
    public final int f50033a;
    public final w0 f50034b;

    public u0(w0 w0Var, int i10) {
        this.f50034b = w0Var;
        this.f50033a = i10;
    }

    @Override
    public final void a() {
        int i10 = this.f50033a;
        w0 w0Var = this.f50034b;
        w0Var.L[i10].C();
        y2.l lVar = w0Var.f50060y;
        int q02 = w0Var.d.q0(w0Var.V);
        IOException iOException = lVar.f54187c;
        if (iOException == null) {
            y2.h hVar = lVar.f54186b;
            if (hVar != null) {
                if (q02 == Integer.MIN_VALUE) {
                    q02 = hVar.f54177a;
                }
                IOException iOException2 = hVar.e;
                if (iOException2 != null && hVar.f54180f > q02) {
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
        w0 w0Var = this.f50034b;
        if (!w0Var.C() && w0Var.L[this.f50033a].A(w0Var.f50053g0)) {
            return true;
        }
        return false;
    }

    @Override
    public final int i(long j10) {
        w0 w0Var = this.f50034b;
        if (w0Var.C()) {
            return 0;
        }
        int i10 = this.f50033a;
        w0Var.x(i10);
        c1 c1Var = w0Var.L[i10];
        int x10 = c1Var.x(j10, w0Var.f50053g0);
        c1Var.L(x10);
        if (x10 == 0) {
            w0Var.y(i10);
        }
        return x10;
    }

    @Override
    public final int r(hf.b bVar, h2.h hVar, int i10) {
        w0 w0Var = this.f50034b;
        if (w0Var.C()) {
            return -3;
        }
        int i11 = this.f50033a;
        w0Var.x(i11);
        int F = w0Var.L[i11].F(bVar, hVar, i10, w0Var.f50053g0);
        if (F == -3) {
            w0Var.y(i11);
        }
        return F;
    }
}
