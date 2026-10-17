package u2;

import java.io.IOException;
public final class u0 implements d1 {
    public final int f47465a;
    public final w0 f47466b;

    public u0(w0 w0Var, int i10) {
        this.f47466b = w0Var;
        this.f47465a = i10;
    }

    @Override
    public final void a() {
        int i10 = this.f47465a;
        w0 w0Var = this.f47466b;
        w0Var.L[i10].C();
        y2.l lVar = w0Var.f47491x;
        int y3 = w0Var.d.y3(w0Var.V);
        IOException iOException = lVar.f49949c;
        if (iOException == null) {
            y2.h hVar = lVar.f49948b;
            if (hVar != null) {
                if (y3 == Integer.MIN_VALUE) {
                    y3 = hVar.f49939a;
                }
                IOException iOException2 = hVar.e;
                if (iOException2 != null && hVar.f49942f > y3) {
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
        w0 w0Var = this.f47466b;
        if (!w0Var.C() && w0Var.L[this.f47465a].A(w0Var.f47485g0)) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(qf.b bVar, h2.h hVar, int i10) {
        w0 w0Var = this.f47466b;
        if (w0Var.C()) {
            return -3;
        }
        int i11 = this.f47465a;
        w0Var.x(i11);
        int F = w0Var.L[i11].F(bVar, hVar, i10, w0Var.f47485g0);
        if (F == -3) {
            w0Var.y(i11);
        }
        return F;
    }

    @Override
    public final int h(long j10) {
        w0 w0Var = this.f47466b;
        if (w0Var.C()) {
            return 0;
        }
        int i10 = this.f47465a;
        w0Var.x(i10);
        c1 c1Var = w0Var.L[i10];
        int x10 = c1Var.x(j10, w0Var.f47485g0);
        c1Var.L(x10);
        if (x10 == 0) {
            w0Var.y(i10);
        }
        return x10;
    }
}
