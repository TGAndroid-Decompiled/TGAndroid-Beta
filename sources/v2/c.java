package v2;

import b2.p;
import b2.x;
import c3.h0;
import c3.i0;
import c3.j0;
import e2.n0;
public final class c implements j0 {
    public final int f50028a;
    public final x f50029b;
    public final c3.n f50030c = new c3.n();
    public final d d;
    public x e;
    public j0 f50031f;
    public long f50032g;

    public c(int i10, int i11, x xVar, d dVar) {
        this.f50028a = i11;
        this.f50029b = xVar;
        this.d = dVar;
    }

    @Override
    public final int a(p pVar, int i10, boolean z10) {
        return f(pVar, i10, z10);
    }

    @Override
    public final void b(x xVar) {
        this.d.getClass();
        x xVar2 = this.f50029b;
        if (xVar2 != null) {
            xVar = xVar.d(xVar2);
        }
        this.e = xVar;
        j0 j0Var = this.f50031f;
        String str = n0.f9691a;
        j0Var.b(xVar);
    }

    @Override
    public final void c(long j10, int i10, int i11, int i12, i0 i0Var) {
        long j11 = this.f50032g;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            this.f50031f = this.f50030c;
        }
        j0 j0Var = this.f50031f;
        String str = n0.f9691a;
        j0Var.c(j10, i10, i11, i12, i0Var);
    }

    @Override
    public final void d(int i10, e2.x xVar) {
        h0.a(this, xVar, i10);
    }

    @Override
    public final int f(p pVar, int i10, boolean z10) {
        j0 j0Var = this.f50031f;
        String str = n0.f9691a;
        return j0Var.a(pVar, i10, z10);
    }

    @Override
    public final void g(e2.x xVar, int i10, int i11) {
        j0 j0Var = this.f50031f;
        String str = n0.f9691a;
        j0Var.d(i10, xVar);
    }

    @Override
    public final void e(long j10) {
    }
}
