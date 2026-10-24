package u2;

import java.io.IOException;
public final class w0 implements f1 {
    public final int f47913a;
    public final y0 f47914b;

    public w0(y0 y0Var, int i10) {
        this.f47914b = y0Var;
        this.f47913a = i10;
    }

    @Override
    public final void a() {
        int i10 = this.f47913a;
        y0 y0Var = this.f47914b;
        y0Var.L[i10].C();
        y2.l lVar = y0Var.f47941x;
        int y3 = y0Var.d.y3(y0Var.V);
        IOException iOException = lVar.f50376c;
        if (iOException == null) {
            y2.h hVar = lVar.f50375b;
            if (hVar != null) {
                if (y3 == Integer.MIN_VALUE) {
                    y3 = hVar.f50366a;
                }
                IOException iOException2 = hVar.e;
                if (iOException2 != null && hVar.f50369f > y3) {
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
        y0 y0Var = this.f47914b;
        if (!y0Var.E() && y0Var.L[this.f47913a].A(y0Var.f47935g0)) {
            return true;
        }
        return false;
    }

    @Override
    public final int g(qf.b bVar, h2.h hVar, int i10) {
        y0 y0Var = this.f47914b;
        if (y0Var.E()) {
            return -3;
        }
        int i11 = this.f47913a;
        y0Var.x(i11);
        int F = y0Var.L[i11].F(bVar, hVar, i10, y0Var.f47935g0);
        if (F == -3) {
            y0Var.y(i11);
        }
        return F;
    }

    @Override
    public final int m(long j10) {
        y0 y0Var = this.f47914b;
        if (y0Var.E()) {
            return 0;
        }
        int i10 = this.f47913a;
        y0Var.x(i10);
        e1 e1Var = y0Var.L[i10];
        int x10 = e1Var.x(j10, y0Var.f47935g0);
        e1Var.L(x10);
        if (x10 == 0) {
            y0Var.y(i10);
        }
        return x10;
    }
}
