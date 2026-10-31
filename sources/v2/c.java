package v2;

import b2.p;
import b2.x;
import c3.i0;
import c3.j0;
import c3.k0;
import e2.l0;
public final class c implements k0 {
    public final int f50291a;
    public final x f50292b;
    public final c3.n f50293c = new c3.n();
    public final d d;
    public x e;
    public k0 f50294f;
    public long f50295g;

    public c(int i10, int i11, x xVar, d dVar) {
        this.f50291a = i11;
        this.f50292b = xVar;
        this.d = dVar;
    }

    @Override
    public final int a(p pVar, int i10, boolean z10) {
        return f(pVar, i10, z10);
    }

    @Override
    public final void b(x xVar) {
        this.d.getClass();
        x xVar2 = this.f50292b;
        if (xVar2 != null) {
            xVar = xVar.d(xVar2);
        }
        this.e = xVar;
        k0 k0Var = this.f50294f;
        String str = l0.f6165a;
        k0Var.b(xVar);
    }

    @Override
    public final void c(long j10, int i10, int i11, int i12, j0 j0Var) {
        long j11 = this.f50295g;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            this.f50294f = this.f50293c;
        }
        k0 k0Var = this.f50294f;
        String str = l0.f6165a;
        k0Var.c(j10, i10, i11, i12, j0Var);
    }

    @Override
    public final void d(int i10, e2.x xVar) {
        i0.a(this, xVar, i10);
    }

    @Override
    public final int f(p pVar, int i10, boolean z10) {
        k0 k0Var = this.f50294f;
        String str = l0.f6165a;
        return k0Var.a(pVar, i10, z10);
    }

    @Override
    public final void g(e2.x xVar, int i10, int i11) {
        k0 k0Var = this.f50294f;
        String str = l0.f6165a;
        k0Var.d(i10, xVar);
    }

    @Override
    public final void e(long j10) {
    }
}
