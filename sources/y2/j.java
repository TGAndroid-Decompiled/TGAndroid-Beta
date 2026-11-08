package y2;

import a8.ia;
import c8.p0;
import e2.s0;
import e2.u;
import f3.j0;
import h2.x;
import j2.c0;
import sg.i0;
import x2.b1;
public final class j extends a {
    public final int E;
    public final long F;
    public final e G;
    public long H;
    public volatile boolean I;
    public boolean J;

    public j(j2.h hVar, j2.m mVar, u uVar, int i7, Object obj, long j3, long j10, long j11, long j12, long j13, int i10, long j14, e eVar) {
        super(hVar, mVar, uVar, i7, obj, j3, j10, j11, j12, j13);
        this.E = i10;
        this.F = j14;
        this.G = eVar;
    }

    @Override
    public final void a() {
        boolean z9;
        boolean z10;
        b1[] b1VarArr;
        long j3;
        i0 i0Var = this.f58875y;
        i0Var.getClass();
        if (this.H == 0) {
            long j10 = this.F;
            for (b1 b1Var : (b1[]) i0Var.f55069c) {
                if (b1Var.H != j10) {
                    b1Var.H = j10;
                    b1Var.B = true;
                }
            }
            e eVar = this.G;
            long j11 = this.f58873w;
            long j12 = -9223372036854775807L;
            if (j11 == -9223372036854775807L) {
                j3 = -9223372036854775807L;
            } else {
                j3 = j11 - this.F;
            }
            long j13 = this.f58874x;
            if (j13 != -9223372036854775807L) {
                j12 = j13 - this.F;
            }
            eVar.b(i0Var, j3, j12);
        }
        try {
            j2.m b10 = this.f58896b.b(this.H);
            c0 c0Var = this.f58901r;
            f3.l lVar = new f3.l(c0Var, b10.f16452e, c0Var.open(b10));
            while (!this.I) {
                int f10 = this.G.f58887a.f(lVar, e.f58886w);
                if (f10 != 1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                ia.p(z9);
                if (f10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    break;
                }
            }
            u uVar = this.d;
            String str = uVar.f10614r;
            int i7 = uVar.R;
            int i10 = uVar.S;
            if (s0.k(str) && ((i7 > 1 || i10 > 1) && i7 != -1 && i10 != -1)) {
                j0 f11 = i0Var.f(4);
                int i11 = i7 * i10;
                long j14 = (this.f58900n - this.h) / i11;
                for (int i12 = 1; i12 < i11; i12++) {
                    f11.b(0, new x());
                    f11.c(i12 * j14, 0, 0, 0, null);
                }
            }
            this.H = lVar.d - this.f58896b.f16452e;
            p0.a(this.f58901r);
            this.J = !this.I;
        } catch (Throwable th2) {
            p0.a(this.f58901r);
            throw th2;
        }
    }

    @Override
    public final long b() {
        return this.f58921s + this.E;
    }

    @Override
    public final boolean c() {
        return this.J;
    }

    @Override
    public final void q0() {
        this.I = true;
    }
}
