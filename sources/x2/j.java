package x2;

import b8.uc;
import b8.zb;
import d2.u0;
import d2.v;
import e3.i0;
import g2.y;
import i2.c0;
import w2.c1;
public final class j extends a {
    public final int F;
    public final long G;
    public final e H;
    public long I;
    public volatile boolean J;
    public boolean K;

    public j(i2.h hVar, i2.n nVar, v vVar, int i3, Object obj, long j10, long j11, long j12, long j13, long j14, int i10, long j15, e eVar) {
        super(hVar, nVar, vVar, i3, obj, j10, j11, j12, j13, j14);
        this.F = i10;
        this.G = j15;
        this.H = eVar;
    }

    @Override
    public final void X1() {
        this.J = true;
    }

    @Override
    public final void a() {
        boolean z10;
        boolean z11;
        c1[] c1VarArr;
        long j10;
        ua.b bVar = this.f58128y;
        bVar.getClass();
        if (this.I == 0) {
            long j11 = this.G;
            for (c1 c1Var : (c1[]) bVar.f55784c) {
                if (c1Var.H != j11) {
                    c1Var.H = j11;
                    c1Var.B = true;
                }
            }
            e eVar = this.H;
            long j12 = this.f58126w;
            long j13 = -9223372036854775807L;
            if (j12 == -9223372036854775807L) {
                j10 = -9223372036854775807L;
            } else {
                j10 = j12 - this.G;
            }
            long j14 = this.f58127x;
            if (j14 != -9223372036854775807L) {
                j13 = j14 - this.G;
            }
            eVar.b(bVar, j10, j13);
        }
        try {
            i2.n b10 = this.f58149b.b(this.I);
            c0 c0Var = this.f58154r;
            e3.l lVar = new e3.l(c0Var, b10.f14567e, c0Var.open(b10));
            while (!this.J) {
                int f10 = this.H.f58140a.f(lVar, e.f58139w);
                if (f10 != 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zb.p(z10);
                if (f10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    break;
                }
            }
            v vVar = this.d;
            String str = vVar.f8488r;
            int i3 = vVar.R;
            int i10 = vVar.S;
            if (u0.k(str) && ((i3 > 1 || i10 > 1) && i3 != -1 && i10 != -1)) {
                i0 c2 = bVar.c(4);
                int i11 = i3 * i10;
                long j15 = (this.f58153n - this.h) / i11;
                for (int i12 = 1; i12 < i11; i12++) {
                    c2.e(0, new y());
                    c2.d(i12 * j15, 0, 0, 0, null);
                }
            }
            this.I = lVar.d - this.f58149b.f14567e;
            uc.a(this.f58154r);
            this.K = !this.J;
        } catch (Throwable th2) {
            uc.a(this.f58154r);
            throw th2;
        }
    }

    @Override
    public final long b() {
        return this.f58174s + this.F;
    }

    @Override
    public final boolean c() {
        return this.K;
    }
}
