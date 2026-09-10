package v2;

import b2.s;
import c3.h0;
import g2.b0;
import n7.a1;
import u2.c1;
import v7.n7;
public final class m extends a {
    public final int E;
    public final s F;
    public long G;
    public boolean H;

    public m(g2.h hVar, g2.m mVar, s sVar, int i10, Object obj, long j3, long j10, long j11, int i11, s sVar2) {
        super(hVar, mVar, sVar, i10, obj, j3, j10, -9223372036854775807L, -9223372036854775807L, j11);
        this.E = i11;
        this.F = sVar2;
    }

    @Override
    public final void a() {
        c1[] c1VarArr;
        b0 b0Var = this.f42867r;
        a1 a1Var = this.f42846x;
        e2.d.h(a1Var);
        for (c1 c1Var : (c1[]) a1Var.f13939c) {
            if (c1Var.F != 0) {
                c1Var.F = 0L;
                c1Var.f42308z = true;
            }
        }
        h0 t02 = a1Var.t0(this.E);
        t02.b(this.F);
        try {
            long open = b0Var.open(this.f42863b.b(this.G));
            if (open != -1) {
                open += this.G;
            }
            c3.l lVar = new c3.l(this.f42867r, this.G, open);
            for (int i10 = 0; i10 != -1; i10 = t02.a(lVar, Integer.MAX_VALUE, true)) {
                this.G += i10;
            }
            t02.c(this.h, 1, (int) this.G, 0, null);
            n7.a(b0Var);
            this.H = true;
        } catch (Throwable th2) {
            n7.a(b0Var);
            throw th2;
        }
    }

    @Override
    public final boolean c() {
        return this.H;
    }

    @Override
    public final void k() {
    }
}
