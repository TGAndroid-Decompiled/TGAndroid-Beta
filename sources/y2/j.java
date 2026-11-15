package y2;

import a8.ja;
import c8.q0;
import e2.s0;
import e2.u;
import f3.i0;
import h2.x;
import j2.b0;
import sg.h0;
import x2.a1;
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
    public final void D() {
        this.J = true;
    }

    @Override
    public final void a() {
        boolean z10;
        boolean z11;
        a1[] a1VarArr;
        long j3;
        h0 h0Var = this.f60095y;
        h0Var.getClass();
        if (this.I == 0) {
            long j10 = this.G;
            for (a1 a1Var : (a1[]) h0Var.f56643c) {
                if (a1Var.H != j10) {
                    a1Var.H = j10;
                    a1Var.B = true;
                }
            }
            e eVar = this.H;
            long j11 = this.f60093w;
            long j12 = -9223372036854775807L;
            if (j11 == -9223372036854775807L) {
                j3 = -9223372036854775807L;
            } else {
                j3 = j11 - this.G;
            }
            long j13 = this.f60094x;
            if (j13 != -9223372036854775807L) {
                j12 = j13 - this.G;
            }
            eVar.b(h0Var, j3, j12);
        }
        try {
            j2.m b10 = this.f60116b.b(this.I);
            b0 b0Var = this.f60121r;
            f3.l lVar = new f3.l(b0Var, b10.f16806e, b0Var.open(b10));
            while (!this.J) {
                int f10 = this.H.f60107a.f(lVar, e.f60106w);
                if (f10 != 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ja.p(z10);
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
            String str = uVar.f10450r;
            int i7 = uVar.R;
            int i10 = uVar.S;
            if (s0.k(str) && ((i7 > 1 || i10 > 1) && i7 != -1 && i10 != -1)) {
                i0 f11 = h0Var.f(4);
                int i11 = i7 * i10;
                long j14 = (this.f60120n - this.h) / i11;
                for (int i12 = 1; i12 < i11; i12++) {
                    f11.b(0, new x());
                    f11.c(i12 * j14, 0, 0, 0, null);
                }
            }
            this.I = lVar.d - this.f60116b.f16806e;
            q0.a(this.f60121r);
            this.K = !this.J;
        } catch (Throwable th2) {
            q0.a(this.f60121r);
            throw th2;
        }
    }

    @Override
    public final long b() {
        return this.f60141s + this.F;
    }

    @Override
    public final boolean c() {
        return this.K;
    }
}
