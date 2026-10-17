package v2;

import b2.o;
import b2.w;
import c3.i0;
import c3.j0;
import e2.m0;
import e2.x;
public final class c implements j0 {
    public final int f47893a;
    public final w f47894b;
    public final c3.n f47895c = new c3.n();
    public final d d;
    public w e;
    public j0 f47896f;
    public long f47897g;

    public c(int i10, int i11, w wVar, d dVar) {
        this.f47893a = i11;
        this.f47894b = wVar;
        this.d = dVar;
    }

    @Override
    public final int a(o oVar, int i10, boolean z10) {
        return f(oVar, i10, z10);
    }

    @Override
    public final void b(w wVar) {
        this.d.getClass();
        w wVar2 = this.f47894b;
        if (wVar2 != null) {
            wVar = wVar.d(wVar2);
        }
        this.e = wVar;
        j0 j0Var = this.f47896f;
        String str = m0.f8254a;
        j0Var.b(wVar);
    }

    @Override
    public final void c(long j10, int i10, int i11, int i12, i0 i0Var) {
        long j11 = this.f47897g;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            this.f47896f = this.f47895c;
        }
        j0 j0Var = this.f47896f;
        String str = m0.f8254a;
        j0Var.c(j10, i10, i11, i12, i0Var);
    }

    @Override
    public final void d(int i10, x xVar) {
        a1.g.a(this, xVar, i10);
    }

    @Override
    public final int f(o oVar, int i10, boolean z10) {
        j0 j0Var = this.f47896f;
        String str = m0.f8254a;
        return j0Var.a(oVar, i10, z10);
    }

    @Override
    public final void g(x xVar, int i10, int i11) {
        j0 j0Var = this.f47896f;
        String str = m0.f8254a;
        j0Var.d(i10, xVar);
    }

    @Override
    public final void e(long j10) {
    }
}
