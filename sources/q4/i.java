package q4;

import g5.p;
import g5.u0;
import j3.n0;
import j7.p7;
import n7.qa;
import o4.k0;
public final class i extends a {
    public final int B;
    public final long C;
    public final d D;
    public long E;
    public volatile boolean F;
    public boolean G;

    public i(g5.m mVar, p pVar, n0 n0Var, int i10, Object obj, long j10, long j11, long j12, long j13, long j14, int i11, long j15, d dVar) {
        super(mVar, pVar, n0Var, i10, obj, j10, j11, j12, j13, j14);
        this.B = i11;
        this.C = j15;
        this.D = dVar;
    }

    @Override
    public final void a() {
        boolean z4;
        boolean z10;
        k0[] k0VarArr;
        long j10;
        if (this.E == 0) {
            qa qaVar = this.f42713x;
            h5.a.j(qaVar);
            long j11 = this.C;
            for (k0 k0Var : (k0[]) qaVar.f14703c) {
                if (k0Var.F != j11) {
                    k0Var.F = j11;
                    k0Var.f16378z = true;
                }
            }
            d dVar = this.D;
            long j12 = this.v;
            long j13 = -9223372036854775807L;
            if (j12 == -9223372036854775807L) {
                j10 = -9223372036854775807L;
            } else {
                j10 = j12 - this.C;
            }
            long j14 = this.f42712w;
            if (j14 != -9223372036854775807L) {
                j13 = j14 - this.C;
            }
            dVar.a(qaVar, j10, j13);
        }
        try {
            p b10 = this.f42730b.b(this.E);
            u0 u0Var = this.f42734r;
            r3.h hVar = new r3.h(u0Var, b10.e, u0Var.open(b10));
            while (!this.F) {
                int h = this.D.f42723a.h(hVar, d.f42722s);
                if (h != 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                h5.a.i(z4);
                if (h == 0) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (!z10) {
                    break;
                }
            }
            this.E = hVar.d - this.f42730b.e;
            p7.a(this.f42734r);
            this.G = !this.F;
        } catch (Throwable th2) {
            p7.a(this.f42734r);
            throw th2;
        }
    }

    @Override
    public final long b() {
        return this.f42751s + this.B;
    }

    @Override
    public final boolean c() {
        return this.G;
    }

    @Override
    public final void r() {
        this.F = true;
    }
}
