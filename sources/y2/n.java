package y2;

import c8.p0;
import e2.u;
import f3.j0;
import j2.c0;
import sg.i0;
import x2.b1;
public final class n extends a {
    public final int E;
    public final u F;
    public long G;
    public boolean H;

    public n(j2.h hVar, j2.m mVar, u uVar, int i7, Object obj, long j3, long j10, long j11, int i10, u uVar2) {
        super(hVar, mVar, uVar, i7, obj, j3, j10, -9223372036854775807L, -9223372036854775807L, j11);
        this.E = i10;
        this.F = uVar2;
    }

    @Override
    public final void a() {
        b1[] b1VarArr;
        c0 c0Var = this.f58811r;
        i0 i0Var = this.f58785y;
        i0Var.getClass();
        for (b1 b1Var : (b1[]) i0Var.f54976c) {
            if (b1Var.H != 0) {
                b1Var.H = 0L;
                b1Var.B = true;
            }
        }
        j0 f10 = i0Var.f(this.E);
        f10.g(this.F);
        try {
            long open = c0Var.open(this.f58806b.b(this.G));
            if (open != -1) {
                open += this.G;
            }
            f3.l lVar = new f3.l(this.f58811r, this.G, open);
            for (int i7 = 0; i7 != -1; i7 = f10.e(lVar, Integer.MAX_VALUE, true)) {
                this.G += i7;
            }
            f10.c(this.h, 1, (int) this.G, 0, null);
            p0.a(c0Var);
            this.H = true;
        } catch (Throwable th2) {
            p0.a(c0Var);
            throw th2;
        }
    }

    @Override
    public final boolean c() {
        return this.H;
    }

    @Override
    public final void q0() {
    }
}
