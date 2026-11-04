package w2;

import java.io.IOException;
public final class u0 implements d1 {
    public final int f57236a;
    public final w0 f57237b;

    public u0(w0 w0Var, int i3) {
        this.f57237b = w0Var;
        this.f57236a = i3;
    }

    @Override
    public final void a() {
        int i3 = this.f57236a;
        w0 w0Var = this.f57237b;
        w0Var.M[i3].C();
        a3.q qVar = w0Var.f57265y;
        int F4 = w0Var.d.F4(w0Var.W);
        IOException iOException = qVar.f109c;
        if (iOException == null) {
            a3.l lVar = qVar.f108b;
            if (lVar != null) {
                if (F4 == Integer.MIN_VALUE) {
                    F4 = lVar.f95a;
                }
                IOException iOException2 = lVar.f98e;
                if (iOException2 != null && lVar.f99f > F4) {
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
        w0 w0Var = this.f57237b;
        if (!w0Var.C() && w0Var.M[this.f57236a].A(w0Var.f57258h0)) {
            return true;
        }
        return false;
    }

    @Override
    public final int m(long j10) {
        w0 w0Var = this.f57237b;
        if (w0Var.C()) {
            return 0;
        }
        int i3 = this.f57236a;
        w0Var.x(i3);
        c1 c1Var = w0Var.M[i3];
        int x10 = c1Var.x(j10, w0Var.f57258h0);
        c1Var.L(x10);
        if (x10 == 0) {
            w0Var.y(i3);
        }
        return x10;
    }

    @Override
    public final int o(tf.b bVar, j2.h hVar, int i3) {
        w0 w0Var = this.f57237b;
        if (w0Var.C()) {
            return -3;
        }
        int i10 = this.f57236a;
        w0Var.x(i10);
        int F = w0Var.M[i10].F(bVar, hVar, i3, w0Var.f57258h0);
        if (F == -3) {
            w0Var.y(i10);
        }
        return F;
    }
}
