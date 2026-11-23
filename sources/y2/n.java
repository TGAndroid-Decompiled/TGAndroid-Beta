package y2;

import c8.t0;
import e2.u;
import f3.i0;
import j2.b0;
import sg.h0;
import x2.c1;
public final class n extends a {
    public final int F;
    public final u G;
    public long H;
    public boolean I;

    public n(j2.h hVar, j2.m mVar, u uVar, int i7, Object obj, long j3, long j10, long j11, int i10, u uVar2) {
        super(hVar, mVar, uVar, i7, obj, j3, j10, -9223372036854775807L, -9223372036854775807L, j11);
        this.F = i10;
        this.G = uVar2;
    }

    @Override
    public final void a() {
        c1[] c1VarArr;
        b0 b0Var = this.f60697r;
        h0 h0Var = this.f60671y;
        h0Var.getClass();
        for (c1 c1Var : (c1[]) h0Var.f57227c) {
            if (c1Var.H != 0) {
                c1Var.H = 0L;
                c1Var.B = true;
            }
        }
        i0 f10 = h0Var.f(this.F);
        f10.g(this.G);
        try {
            long open = b0Var.open(this.f60692b.b(this.H));
            if (open != -1) {
                open += this.H;
            }
            f3.l lVar = new f3.l(this.f60697r, this.H, open);
            for (int i7 = 0; i7 != -1; i7 = f10.e(lVar, Integer.MAX_VALUE, true)) {
                this.H += i7;
            }
            f10.c(this.h, 1, (int) this.H, 0, null);
            t0.a(b0Var);
            this.I = true;
        } catch (Throwable th2) {
            t0.a(b0Var);
            throw th2;
        }
    }

    @Override
    public final boolean c() {
        return this.I;
    }

    @Override
    public final void A() {
    }
}
