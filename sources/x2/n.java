package x2;

import b8.uc;
import d2.v;
import e3.i0;
import i2.c0;
import w2.c1;
public final class n extends a {
    public final int F;
    public final v G;
    public long H;
    public boolean I;

    public n(i2.h hVar, i2.n nVar, v vVar, int i3, Object obj, long j10, long j11, long j12, int i10, v vVar2) {
        super(hVar, nVar, vVar, i3, obj, j10, j11, -9223372036854775807L, -9223372036854775807L, j12);
        this.F = i10;
        this.G = vVar2;
    }

    @Override
    public final void a() {
        c1[] c1VarArr;
        c0 c0Var = this.f58154r;
        ua.b bVar = this.f58128y;
        bVar.getClass();
        for (c1 c1Var : (c1[]) bVar.f55784c) {
            if (c1Var.H != 0) {
                c1Var.H = 0L;
                c1Var.B = true;
            }
        }
        i0 c2 = bVar.c(this.F);
        c2.g(this.G);
        try {
            long open = c0Var.open(this.f58149b.b(this.H));
            if (open != -1) {
                open += this.H;
            }
            e3.l lVar = new e3.l(this.f58154r, this.H, open);
            for (int i3 = 0; i3 != -1; i3 = c2.a(lVar, Integer.MAX_VALUE, true)) {
                this.H += i3;
            }
            c2.d(this.h, 1, (int) this.H, 0, null);
            uc.a(c0Var);
            this.I = true;
        } catch (Throwable th2) {
            uc.a(c0Var);
            throw th2;
        }
    }

    @Override
    public final boolean c() {
        return this.I;
    }

    @Override
    public final void X1() {
    }
}
