package v2;

import b2.s;
import c3.h0;
import g2.b0;
import u2.b1;
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
        b1[] b1VarArr;
        b0 b0Var = this.f44145r;
        m5.e eVar = this.f44124x;
        e2.d.h(eVar);
        for (b1 b1Var : (b1[]) eVar.f14954c) {
            if (b1Var.F != 0) {
                b1Var.F = 0L;
                b1Var.f43637z = true;
            }
        }
        h0 W = eVar.W(this.E);
        W.b(this.F);
        try {
            long open = b0Var.open(this.f44141b.b(this.G));
            if (open != -1) {
                open += this.G;
            }
            c3.l lVar = new c3.l(this.f44145r, this.G, open);
            for (int i10 = 0; i10 != -1; i10 = W.a(lVar, Integer.MAX_VALUE, true)) {
                this.G += i10;
            }
            W.c(this.h, 1, (int) this.G, 0, null);
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
    public final void H() {
    }
}
