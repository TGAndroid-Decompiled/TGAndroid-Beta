package u2;

import java.io.IOException;
public final class v0 implements e1 {
    public final int f47447a;
    public final x0 f47448b;

    public v0(x0 x0Var, int i10) {
        this.f47448b = x0Var;
        this.f47447a = i10;
    }

    @Override
    public final void a() {
        int i10 = this.f47447a;
        x0 x0Var = this.f47448b;
        x0Var.L[i10].C();
        y2.l lVar = x0Var.f47475x;
        int y3 = x0Var.d.y3(x0Var.V);
        IOException iOException = lVar.f49927c;
        if (iOException == null) {
            y2.h hVar = lVar.f49926b;
            if (hVar != null) {
                if (y3 == Integer.MIN_VALUE) {
                    y3 = hVar.f49917a;
                }
                IOException iOException2 = hVar.e;
                if (iOException2 != null && hVar.f49920f > y3) {
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
        x0 x0Var = this.f47448b;
        if (!x0Var.C() && x0Var.L[this.f47447a].A(x0Var.f47469g0)) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(qf.b bVar, h2.h hVar, int i10) {
        x0 x0Var = this.f47448b;
        if (x0Var.C()) {
            return -3;
        }
        int i11 = this.f47447a;
        x0Var.x(i11);
        int F = x0Var.L[i11].F(bVar, hVar, i10, x0Var.f47469g0);
        if (F == -3) {
            x0Var.y(i11);
        }
        return F;
    }

    @Override
    public final int h(long j10) {
        x0 x0Var = this.f47448b;
        if (x0Var.C()) {
            return 0;
        }
        int i10 = this.f47447a;
        x0Var.x(i10);
        d1 d1Var = x0Var.L[i10];
        int x10 = d1Var.x(j10, x0Var.f47469g0);
        d1Var.L(x10);
        if (x10 == 0) {
            x0Var.y(i10);
        }
        return x10;
    }
}
