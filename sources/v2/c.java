package v2;

import b2.o;
import b2.w;
import c3.k0;
import c3.l0;
import c3.p;
import e2.m0;
import e2.x;
public final class c implements l0 {
    public final int f48319a;
    public final w f48320b;
    public final p f48321c = new p();
    public final d d;
    public w e;
    public l0 f48322f;
    public long f48323g;

    public c(int i10, int i11, w wVar, d dVar) {
        this.f48319a = i11;
        this.f48320b = wVar;
        this.d = dVar;
    }

    @Override
    public final int a(o oVar, int i10, boolean z10) {
        return f(oVar, i10, z10);
    }

    @Override
    public final void b(w wVar) {
        this.d.getClass();
        w wVar2 = this.f48320b;
        if (wVar2 != null) {
            wVar = wVar.d(wVar2);
        }
        this.e = wVar;
        l0 l0Var = this.f48322f;
        String str = m0.f8259a;
        l0Var.b(wVar);
    }

    @Override
    public final void c(long j10, int i10, int i11, int i12, k0 k0Var) {
        long j11 = this.f48323g;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            this.f48322f = this.f48321c;
        }
        l0 l0Var = this.f48322f;
        String str = m0.f8259a;
        l0Var.c(j10, i10, i11, i12, k0Var);
    }

    @Override
    public final void d(int i10, x xVar) {
        a1.g.a(this, xVar, i10);
    }

    @Override
    public final int f(o oVar, int i10, boolean z10) {
        l0 l0Var = this.f48322f;
        String str = m0.f8259a;
        return l0Var.a(oVar, i10, z10);
    }

    @Override
    public final void g(x xVar, int i10, int i11) {
        l0 l0Var = this.f48322f;
        String str = m0.f8259a;
        l0Var.d(i10, xVar);
    }

    @Override
    public final void e(long j10) {
    }
}
