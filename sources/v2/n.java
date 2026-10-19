package v2;

import b2.w;
import c3.j0;
import g2.b0;
import u2.c1;
import v7.k7;
public final class n extends a {
    public final int E;
    public final w F;
    public long G;
    public boolean H;

    public n(g2.h hVar, g2.m mVar, w wVar, int i10, Object obj, long j10, long j11, long j12, int i11, w wVar2) {
        super(hVar, mVar, wVar, i10, obj, j10, j11, -9223372036854775807L, -9223372036854775807L, j12);
        this.E = i11;
        this.F = wVar2;
    }

    @Override
    public final void a() {
        c1[] c1VarArr;
        b0 b0Var = this.f47891r;
        n2.e eVar = this.f47868x;
        eVar.getClass();
        for (c1 c1Var : (c1[]) eVar.f17040c) {
            if (c1Var.H != 0) {
                c1Var.H = 0L;
                c1Var.B = true;
            }
        }
        j0 r02 = eVar.r0(this.E);
        r02.b(this.F);
        try {
            long open = b0Var.open(this.f47887b.b(this.G));
            if (open != -1) {
                open += this.G;
            }
            c3.l lVar = new c3.l(this.f47891r, this.G, open);
            for (int i10 = 0; i10 != -1; i10 = r02.a(lVar, Integer.MAX_VALUE, true)) {
                this.G += i10;
            }
            r02.c(this.h, 1, (int) this.G, 0, null);
            k7.a(b0Var);
            this.H = true;
        } catch (Throwable th2) {
            k7.a(b0Var);
            throw th2;
        }
    }

    @Override
    public final boolean c() {
        return this.H;
    }

    @Override
    public final void O() {
    }
}
