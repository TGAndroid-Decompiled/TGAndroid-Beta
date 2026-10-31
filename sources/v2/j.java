package v2;

import b2.v0;
import b2.x;
import c3.k0;
import g2.c0;
import u2.c1;
import v7.l7;
import v7.t6;
public final class j extends a {
    public final int E;
    public final long F;
    public final e G;
    public long H;
    public volatile boolean I;
    public boolean J;

    public j(g2.h hVar, g2.n nVar, x xVar, int i10, Object obj, long j10, long j11, long j12, long j13, long j14, int i11, long j15, e eVar) {
        super(hVar, nVar, xVar, i10, obj, j10, j11, j12, j13, j14);
        this.E = i11;
        this.F = j15;
        this.G = eVar;
    }

    @Override
    public final void R1() {
        this.I = true;
    }

    @Override
    public final long a() {
        return this.f50328s + this.E;
    }

    @Override
    public final void b() {
        boolean z10;
        boolean z11;
        c1[] c1VarArr;
        long j10;
        u9.b bVar = this.f50287y;
        bVar.getClass();
        if (this.H == 0) {
            long j11 = this.F;
            for (c1 c1Var : (c1[]) bVar.f50195c) {
                if (c1Var.H != j11) {
                    c1Var.H = j11;
                    c1Var.B = true;
                }
            }
            e eVar = this.G;
            long j12 = this.f50285w;
            long j13 = -9223372036854775807L;
            if (j12 == -9223372036854775807L) {
                j10 = -9223372036854775807L;
            } else {
                j10 = j12 - this.F;
            }
            long j14 = this.f50286x;
            if (j14 != -9223372036854775807L) {
                j13 = j14 - this.F;
            }
            eVar.b(bVar, j10, j13);
        }
        try {
            g2.n b10 = this.f50306b.b(this.H);
            c0 c0Var = this.f50310r;
            c3.l lVar = new c3.l(c0Var, b10.e, c0Var.open(b10));
            while (!this.I) {
                int f7 = this.G.f50298a.f(lVar, e.f50297w);
                if (f7 != 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                t6.p(z10);
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
            String str = xVar.f2422r;
            int i10 = xVar.R;
            int i11 = xVar.S;
            if (v0.k(str) && ((i10 > 1 || i11 > 1) && i10 != -1 && i11 != -1)) {
                k0 c10 = bVar.c(4);
                int i12 = i10 * i11;
                long j15 = (this.f50309n - this.h) / i12;
                for (int i13 = 1; i13 < i12; i13++) {
                    c10.d(0, new e2.x());
                    c10.c(i13 * j15, 0, 0, 0, null);
                }
            }
            this.H = lVar.d - this.f50306b.e;
            l7.a(this.f50310r);
            this.J = !this.I;
        } catch (Throwable th2) {
            l7.a(this.f50310r);
            throw th2;
        }
    }

    @Override
    public final boolean c() {
        return this.J;
    }
}
