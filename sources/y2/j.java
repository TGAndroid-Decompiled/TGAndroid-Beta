package y2;

import a8.ma;
import c8.t0;
import e2.s0;
import e2.u;
import f3.j0;
import h2.x;
import j2.b0;
import x2.c1;
public final class j extends a {
    public final int F;
    public final long G;
    public final e H;
    public long I;
    public volatile boolean J;
    public boolean K;

    public j(j2.h hVar, j2.m mVar, u uVar, int i7, Object obj, long j3, long j10, long j11, long j12, long j13, int i10, long j14, e eVar) {
        super(hVar, mVar, uVar, i7, obj, j3, j10, j11, j12, j13);
        this.F = i10;
        this.G = j14;
        this.H = eVar;
    }

    @Override
    public final void a() {
        boolean z10;
        boolean z11;
        c1[] c1VarArr;
        long j3;
        s2.e eVar = this.f60789y;
        eVar.getClass();
        if (this.I == 0) {
            long j10 = this.G;
            for (c1 c1Var : (c1[]) eVar.f56893c) {
                if (c1Var.H != j10) {
                    c1Var.H = j10;
                    c1Var.B = true;
                }
            }
            e eVar2 = this.H;
            long j11 = this.f60787w;
            long j12 = -9223372036854775807L;
            if (j11 == -9223372036854775807L) {
                j3 = -9223372036854775807L;
            } else {
                j3 = j11 - this.G;
            }
            long j13 = this.f60788x;
            if (j13 != -9223372036854775807L) {
                j12 = j13 - this.G;
            }
            eVar2.b(eVar, j3, j12);
        }
        try {
            j2.m b10 = this.f60810b.b(this.I);
            b0 b0Var = this.f60815r;
            f3.l lVar = new f3.l(b0Var, b10.f17279e, b0Var.open(b10));
            while (!this.J) {
                int f10 = this.H.f60801a.f(lVar, e.f60800w);
                if (f10 != 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ma.p(z10);
                if (f10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    break;
                }
            }
            u uVar = this.d;
            String str = uVar.f10758r;
            int i7 = uVar.R;
            int i10 = uVar.S;
            if (s0.k(str) && ((i7 > 1 || i10 > 1) && i7 != -1 && i10 != -1)) {
                j0 f11 = eVar.f(4);
                int i11 = i7 * i10;
                long j14 = (this.f60814n - this.h) / i11;
                for (int i12 = 1; i12 < i11; i12++) {
                    f11.b(0, new x());
                    f11.c(i12 * j14, 0, 0, 0, null);
                }
            }
            this.I = lVar.d - this.f60810b.f17279e;
            t0.a(this.f60815r);
            this.K = !this.J;
        } catch (Throwable th2) {
            t0.a(this.f60815r);
            throw th2;
        }
    }

    @Override
    public final long b() {
        return this.f60835s + this.F;
    }

    @Override
    public final boolean c() {
        return this.K;
    }

    @Override
    public final void y() {
        this.J = true;
    }
}
