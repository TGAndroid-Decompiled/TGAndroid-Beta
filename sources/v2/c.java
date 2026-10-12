package v2;

import b2.p;
import b2.x;
import c3.h0;
import c3.i0;
import e2.m0;
public final class c implements i0 {
    public final int f46485a;
    public final x f46486b;
    public final c3.n f46487c = new c3.n();
    public final d d;
    public x e;
    public i0 f46488f;
    public long f46489g;

    public c(int i10, int i11, x xVar, d dVar) {
        this.f46485a = i11;
        this.f46486b = xVar;
        this.d = dVar;
    }

    @Override
    public final int a(p pVar, int i10, boolean z10) {
        return f(pVar, i10, z10);
    }

    @Override
    public final void b(x xVar) {
        this.d.getClass();
        x xVar2 = this.f46486b;
        if (xVar2 != null) {
            xVar = xVar.d(xVar2);
        }
        this.e = xVar;
        i0 i0Var = this.f46488f;
        String str = m0.f8372a;
        i0Var.b(xVar);
    }

    @Override
    public final void c(long j10, int i10, int i11, int i12, h0 h0Var) {
        long j11 = this.f46489g;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            this.f46488f = this.f46487c;
        }
        i0 i0Var = this.f46488f;
        String str = m0.f8372a;
        i0Var.c(j10, i10, i11, i12, h0Var);
    }

    @Override
    public final void d(int i10, e2.x xVar) {
        a1.g.a(this, xVar, i10);
    }

    @Override
    public final int f(p pVar, int i10, boolean z10) {
        i0 i0Var = this.f46488f;
        String str = m0.f8372a;
        return i0Var.a(pVar, i10, z10);
    }

    @Override
    public final void g(e2.x xVar, int i10, int i11) {
        i0 i0Var = this.f46488f;
        String str = m0.f8372a;
        i0Var.d(i10, xVar);
    }

    @Override
    public final void e(long j10) {
    }
}
