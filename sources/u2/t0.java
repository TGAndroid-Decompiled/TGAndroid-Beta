package u2;

import java.io.IOException;
public final class t0 implements c1 {
    public final int f47485a;
    public final v0 f47486b;

    public t0(v0 v0Var, int i10) {
        this.f47486b = v0Var;
        this.f47485a = i10;
    }

    @Override
    public final void a() {
        int i10 = this.f47485a;
        v0 v0Var = this.f47486b;
        v0Var.L[i10].C();
        y2.l lVar = v0Var.f47511x;
        int y3 = v0Var.d.y3(v0Var.V);
        IOException iOException = lVar.f49974c;
        if (iOException == null) {
            y2.h hVar = lVar.f49973b;
            if (hVar != null) {
                if (y3 == Integer.MIN_VALUE) {
                    y3 = hVar.f49964a;
                }
                IOException iOException2 = hVar.e;
                if (iOException2 != null && hVar.f49967f > y3) {
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
        v0 v0Var = this.f47486b;
        if (!v0Var.C() && v0Var.L[this.f47485a].A(v0Var.f47505g0)) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(qf.b bVar, h2.h hVar, int i10) {
        v0 v0Var = this.f47486b;
        if (v0Var.C()) {
            return -3;
        }
        int i11 = this.f47485a;
        v0Var.x(i11);
        int F = v0Var.L[i11].F(bVar, hVar, i10, v0Var.f47505g0);
        if (F == -3) {
            v0Var.y(i11);
        }
        return F;
    }

    @Override
    public final int h(long j10) {
        v0 v0Var = this.f47486b;
        if (v0Var.C()) {
            return 0;
        }
        int i10 = this.f47485a;
        v0Var.x(i10);
        b1 b1Var = v0Var.L[i10];
        int x10 = b1Var.x(j10, v0Var.f47505g0);
        b1Var.L(x10);
        if (x10 == 0) {
            v0Var.y(i10);
        }
        return x10;
    }
}
