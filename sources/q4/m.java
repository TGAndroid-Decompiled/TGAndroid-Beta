package q4;

import g5.p;
import g5.u0;
import j3.n0;
import j7.p7;
import n7.qa;
import o4.k0;
import r3.v;
public final class m extends a {
    public final int B;
    public final n0 C;
    public long D;
    public boolean E;

    public m(g5.m mVar, p pVar, n0 n0Var, int i10, Object obj, long j10, long j11, long j12, int i11, n0 n0Var2) {
        super(mVar, pVar, n0Var, i10, obj, j10, j11, -9223372036854775807L, -9223372036854775807L, j12);
        this.B = i11;
        this.C = n0Var2;
    }

    @Override
    public final void a() {
        k0[] k0VarArr;
        u0 u0Var = this.f42764r;
        qa qaVar = this.f42743x;
        h5.a.j(qaVar);
        for (k0 k0Var : (k0[]) qaVar.f14688c) {
            if (k0Var.F != 0) {
                k0Var.F = 0L;
                k0Var.f16360z = true;
            }
        }
        v M0 = qaVar.M0(this.B);
        M0.b(this.C);
        try {
            long open = u0Var.open(this.f42760b.b(this.D));
            if (open != -1) {
                open += this.D;
            }
            r3.h hVar = new r3.h(this.f42764r, this.D, open);
            for (int i10 = 0; i10 != -1; i10 = M0.e(hVar, Integer.MAX_VALUE, true)) {
                this.D += i10;
            }
            M0.c(this.h, 1, (int) this.D, 0, null);
            p7.a(u0Var);
            this.E = true;
        } catch (Throwable th2) {
            p7.a(u0Var);
            throw th2;
        }
    }

    @Override
    public final boolean d() {
        return this.E;
    }

    @Override
    public final void b() {
    }
}
