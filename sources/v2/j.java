package v2;

import b2.w0;
import b2.x;
import c3.i0;
import g2.b0;
import n6.o;
import u2.c1;
import v7.k7;
import v7.u6;
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
    public final void J() {
        this.I = true;
    }

    @Override
    public final void a() {
        boolean z10;
        boolean z11;
        c1[] c1VarArr;
        long j10;
        o oVar = this.f46480x;
        oVar.getClass();
        if (this.H == 0) {
            long j11 = this.F;
            for (c1 c1Var : (c1[]) oVar.f16132c) {
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
            long j14 = this.f46479w;
            if (j14 != -9223372036854775807L) {
                j13 = j14 - this.F;
            }
            eVar.b(oVar, j10, j13);
        }
        try {
            g2.m b10 = this.f46499b.b(this.H);
            b0 b0Var = this.f46503r;
            c3.l lVar = new c3.l(b0Var, b10.e, b0Var.open(b10));
            while (!this.I) {
                int f7 = this.G.f46491a.f(lVar, e.v);
                if (f7 != 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u6.p(z10);
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
            String str = xVar.f2518r;
            int i10 = xVar.R;
            int i11 = xVar.S;
            if (w0.k(str) && ((i10 > 1 || i11 > 1) && i10 != -1 && i11 != -1)) {
                i0 g02 = oVar.g0(4);
                int i12 = i10 * i11;
                long j15 = (this.f46502n - this.h) / i12;
                for (int i13 = 1; i13 < i12; i13++) {
                    g02.d(0, new e2.x());
                    g02.c(i13 * j15, 0, 0, 0, null);
                }
            }
            this.H = lVar.d - this.f46499b.e;
            k7.a(this.f46503r);
            this.J = !this.I;
        } catch (Throwable th2) {
            k7.a(this.f46503r);
            throw th2;
        }
    }

    @Override
    public final long b() {
        return this.f46520s + this.E;
    }

    @Override
    public final boolean c() {
        return this.J;
    }
}
