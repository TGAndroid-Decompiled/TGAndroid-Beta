package v2;

import b2.s;
import c3.h0;
import g2.b0;
import u2.a1;
import v7.m7;
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
        a1[] a1VarArr;
        b0 b0Var = this.f47304r;
        o0.a aVar = this.f47280x;
        e2.d.h(aVar);
        for (a1 a1Var : (a1[]) aVar.f16770c) {
            if (a1Var.F != 0) {
                a1Var.F = 0L;
                a1Var.f46640z = true;
            }
        }
        h0 U = aVar.U(this.E);
        U.b(this.F);
        try {
            long open = b0Var.open(this.f47299b.b(this.G));
            if (open != -1) {
                open += this.G;
            }
            c3.l lVar = new c3.l(this.f47304r, this.G, open);
            for (int i10 = 0; i10 != -1; i10 = U.a(lVar, Integer.MAX_VALUE, true)) {
                this.G += i10;
            }
            U.c(this.h, 1, (int) this.G, 0, null);
            m7.a(b0Var);
            this.H = true;
        } catch (Throwable th2) {
            m7.a(b0Var);
            throw th2;
        }
    }

    @Override
    public final boolean c() {
        return this.H;
    }

    @Override
    public final void W() {
    }
}
