package v2;

import b2.s;
import c3.h0;
import g2.b0;
import org.telegram.ui.ActionBar.b5;
import u2.a1;
import v7.k7;
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
        b0 b0Var = this.f49056r;
        b5 b5Var = this.f49032x;
        e2.d.h(b5Var);
        for (a1 a1Var : (a1[]) b5Var.f20461b) {
            if (a1Var.F != 0) {
                a1Var.F = 0L;
                a1Var.f48545z = true;
            }
        }
        h0 w10 = b5Var.w(this.E);
        w10.b(this.F);
        try {
            long open = b0Var.open(this.f49051b.b(this.G));
            if (open != -1) {
                open += this.G;
            }
            c3.l lVar = new c3.l(this.f49056r, this.G, open);
            for (int i10 = 0; i10 != -1; i10 = w10.a(lVar, Integer.MAX_VALUE, true)) {
                this.G += i10;
            }
            w10.c(this.h, 1, (int) this.G, 0, null);
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
    public final void v() {
    }
}
