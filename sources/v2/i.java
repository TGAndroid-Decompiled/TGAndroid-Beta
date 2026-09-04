package v2;

import b2.r0;
import b2.s;
import c3.h0;
import e2.v;
import g2.b0;
import u2.a1;
import v7.m7;
public final class i extends a {
    public final int E;
    public final long F;
    public final d G;
    public long H;
    public volatile boolean I;
    public boolean J;

    public i(g2.h hVar, g2.m mVar, s sVar, int i10, Object obj, long j3, long j10, long j11, long j12, long j13, int i11, long j14, d dVar) {
        super(hVar, mVar, sVar, i10, obj, j3, j10, j11, j12, j13);
        this.E = i11;
        this.F = j14;
        this.G = dVar;
    }

    @Override
    public final void W() {
        this.I = true;
    }

    @Override
    public final void a() {
        boolean z10;
        boolean z11;
        a1[] a1VarArr;
        long j3;
        o0.a aVar = this.f47280x;
        e2.d.h(aVar);
        if (this.H == 0) {
            long j10 = this.F;
            for (a1 a1Var : (a1[]) aVar.f16770c) {
                if (a1Var.F != j10) {
                    a1Var.F = j10;
                    a1Var.f46640z = true;
                }
            }
            d dVar = this.G;
            long j11 = this.v;
            long j12 = -9223372036854775807L;
            if (j11 == -9223372036854775807L) {
                j3 = -9223372036854775807L;
            } else {
                j3 = j11 - this.F;
            }
            long j13 = this.f47279w;
            if (j13 != -9223372036854775807L) {
                j12 = j13 - this.F;
            }
            dVar.a(aVar, j3, j12);
        }
        try {
            g2.m b10 = this.f47299b.b(this.H);
            b0 b0Var = this.f47304r;
            c3.l lVar = new c3.l(b0Var, b10.f10333e, b0Var.open(b10));
            while (!this.I) {
                int m10 = this.G.f47291a.m(lVar, d.f47290s);
                if (m10 != 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e2.d.g(z10);
                if (m10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    break;
                }
            }
            s sVar = this.d;
            String str = sVar.f2369q;
            int i10 = sVar.Q;
            int i11 = sVar.R;
            if (r0.k(str) && ((i10 > 1 || i11 > 1) && i10 != -1 && i11 != -1)) {
                h0 U = aVar.U(4);
                int i12 = i10 * i11;
                long j14 = (this.f47303n - this.h) / i12;
                for (int i13 = 1; i13 < i12; i13++) {
                    U.d(0, new v());
                    U.c(i13 * j14, 0, 0, 0, null);
                }
            }
            this.H = lVar.d - this.f47299b.f10333e;
            m7.a(this.f47304r);
            this.J = !this.I;
        } catch (Throwable th2) {
            m7.a(this.f47304r);
            throw th2;
        }
    }

    @Override
    public final long b() {
        return this.f47323s + this.E;
    }

    @Override
    public final boolean c() {
        return this.J;
    }
}
