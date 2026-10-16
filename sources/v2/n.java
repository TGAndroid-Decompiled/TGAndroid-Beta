package v2;

import b2.x;
import c3.i0;
import g2.b0;
import u2.c1;
import v7.k7;
public final class n extends a {
    public final int E;
    public final x F;
    public long G;
    public boolean H;

    public n(g2.h hVar, g2.m mVar, x xVar, int i10, Object obj, long j10, long j11, long j12, int i11, x xVar2) {
        super(hVar, mVar, xVar, i10, obj, j10, j11, -9223372036854775807L, -9223372036854775807L, j12);
        this.E = i11;
        this.F = xVar2;
    }

    @Override
    public final void a() {
        c1[] c1VarArr;
        b0 b0Var = this.f46503r;
        n3.b bVar = this.f46480x;
        bVar.getClass();
        for (c1 c1Var : (c1[]) bVar.f15704c) {
            if (c1Var.H != 0) {
                c1Var.H = 0L;
                c1Var.B = true;
            }
        }
        i0 j02 = bVar.j0(this.E);
        j02.b(this.F);
        try {
            long open = b0Var.open(this.f46499b.b(this.G));
            if (open != -1) {
                open += this.G;
            }
            c3.l lVar = new c3.l(this.f46503r, this.G, open);
            for (int i10 = 0; i10 != -1; i10 = j02.a(lVar, Integer.MAX_VALUE, true)) {
                this.G += i10;
            }
            j02.c(this.h, 1, (int) this.G, 0, null);
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
    public final void a0() {
    }
}
