package v2;

import b2.p;
import b2.x;
import c3.h0;
import c3.i0;
import c3.j0;
import e2.n0;
public final class c implements j0 {
    public final int f49990a;
    public final x f49991b;
    public final c3.n f49992c = new c3.n();
    public final d d;
    public x e;
    public j0 f49993f;
    public long f49994g;

    public c(int i10, int i11, x xVar, d dVar) {
        this.f49990a = i11;
        this.f49991b = xVar;
        this.d = dVar;
    }

    @Override
    public final int a(p pVar, int i10, boolean z10) {
        return f(pVar, i10, z10);
    }

    @Override
    public final void b(x xVar) {
        this.d.getClass();
        x xVar2 = this.f49991b;
        if (xVar2 != null) {
            xVar = xVar.d(xVar2);
        }
        this.e = xVar;
        j0 j0Var = this.f49993f;
        String str = n0.f9692a;
        j0Var.b(xVar);
    }

    @Override
    public final void c(long j10, int i10, int i11, int i12, i0 i0Var) {
        long j11 = this.f49994g;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            this.f49993f = this.f49992c;
        }
        j0 j0Var = this.f49993f;
        String str = n0.f9692a;
        j0Var.c(j10, i10, i11, i12, i0Var);
    }

    @Override
    public final void d(int i10, e2.x xVar) {
        h0.a(this, xVar, i10);
    }

    @Override
    public final int f(p pVar, int i10, boolean z10) {
        j0 j0Var = this.f49993f;
        String str = n0.f9692a;
        return j0Var.a(pVar, i10, z10);
    }

    @Override
    public final void g(e2.x xVar, int i10, int i11) {
        j0 j0Var = this.f49993f;
        String str = n0.f9692a;
        j0Var.d(i10, xVar);
    }

    @Override
    public final void e(long j10) {
    }
}
