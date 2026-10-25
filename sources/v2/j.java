package v2;

import a8.hc;
import a8.yb;
import b2.w0;
import b2.x;
import c3.j0;
import g2.b0;
import u2.c1;
public final class j extends a {
    public final int E;
    public final long F;
    public final e G;
    public long H;
    public volatile boolean I;
    public boolean J;

    public j(g2.h hVar, g2.m mVar, x xVar, int i10, Object obj, long j10, long j11, long j12, long j13, long j14, int i11, long j15, e eVar) {
        super(hVar, mVar, xVar, i10, obj, j10, j11, j12, j13, j14);
        this.E = i11;
        this.F = j15;
        this.G = eVar;
    }

    @Override
    public final long a() {
        return this.f50025s + this.E;
    }

    @Override
    public final void b() {
        boolean z10;
        boolean z11;
        c1[] c1VarArr;
        long j10;
        m4.c cVar = this.f49985x;
        cVar.getClass();
        if (this.H == 0) {
            long j11 = this.F;
            for (c1 c1Var : (c1[]) cVar.f18010c) {
                if (c1Var.H != j11) {
                    c1Var.H = j11;
                    c1Var.B = true;
                }
            }
            e eVar = this.G;
            long j12 = this.v;
            long j13 = -9223372036854775807L;
            if (j12 == -9223372036854775807L) {
                j10 = -9223372036854775807L;
            } else {
                j10 = j12 - this.F;
            }
            long j14 = this.f49984w;
            if (j14 != -9223372036854775807L) {
                j13 = j14 - this.F;
            }
            eVar.b(cVar, j10, j13);
        }
        try {
            g2.m b10 = this.f50004b.b(this.H);
            b0 b0Var = this.f50008r;
            c3.l lVar = new c3.l(b0Var, b10.e, b0Var.open(b10));
            while (!this.I) {
                int f7 = this.G.f49996a.f(lVar, e.v);
                if (f7 != 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                yb.p(z10);
                if (f7 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    break;
                }
            }
            x xVar = this.d;
            String str = xVar.f3585r;
            int i10 = xVar.R;
            int i11 = xVar.S;
            if (w0.k(str) && ((i10 > 1 || i11 > 1) && i10 != -1 && i11 != -1)) {
                j0 B0 = cVar.B0(4);
                int i12 = i10 * i11;
                long j15 = (this.f50007n - this.h) / i12;
                for (int i13 = 1; i13 < i12; i13++) {
                    B0.d(0, new e2.x());
                    B0.c(i13 * j15, 0, 0, 0, null);
                }
            }
            this.H = lVar.d - this.f50004b.e;
            hc.a(this.f50008r);
            this.J = !this.I;
        } catch (Throwable th2) {
            hc.a(this.f50008r);
            throw th2;
        }
    }

    @Override
    public final boolean c() {
        return this.J;
    }

    @Override
    public final void f0() {
        this.I = true;
    }
}
