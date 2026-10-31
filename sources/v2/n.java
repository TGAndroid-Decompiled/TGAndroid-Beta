package v2;

import b2.x;
import c3.k0;
import g2.c0;
import u2.c1;
import v7.l7;
public final class n extends a {
    public final int E;
    public final x F;
    public long G;
    public boolean H;

    public n(g2.h hVar, g2.n nVar, x xVar, int i10, Object obj, long j10, long j11, long j12, int i11, x xVar2) {
        super(hVar, nVar, xVar, i10, obj, j10, j11, -9223372036854775807L, -9223372036854775807L, j12);
        this.E = i11;
        this.F = xVar2;
    }

    @Override
    public final void b() {
        c1[] c1VarArr;
        c0 c0Var = this.f50310r;
        u9.b bVar = this.f50287y;
        bVar.getClass();
        for (c1 c1Var : (c1[]) bVar.f50195c) {
            if (c1Var.H != 0) {
                c1Var.H = 0L;
                c1Var.B = true;
            }
        }
        k0 c10 = bVar.c(this.E);
        c10.b(this.F);
        try {
            long open = c0Var.open(this.f50306b.b(this.G));
            if (open != -1) {
                open += this.G;
            }
            c3.l lVar = new c3.l(this.f50310r, this.G, open);
            for (int i10 = 0; i10 != -1; i10 = c10.a(lVar, Integer.MAX_VALUE, true)) {
                this.G += i10;
            }
            c10.c(this.h, 1, (int) this.G, 0, null);
            l7.a(c0Var);
            this.H = true;
        } catch (Throwable th2) {
            l7.a(c0Var);
            throw th2;
        }
    }

    @Override
    public final boolean c() {
        return this.H;
    }

    @Override
    public final void R1() {
    }
}
