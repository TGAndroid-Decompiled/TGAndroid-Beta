package u2;

import java.util.concurrent.atomic.AtomicReference;
public final class s0 implements c3.j0 {
    public final c1 f47443a;
    public final c1 f47444b;
    public final c3.n f47445c = new c3.n();
    public final AtomicReference d = new AtomicReference(r0.f47437a);

    public s0(c1 c1Var) {
        this.f47443a = c1Var;
        this.f47444b = c1Var;
    }

    @Override
    public final int a(b2.o oVar, int i10, boolean z10) {
        return h().a(oVar, i10, z10);
    }

    @Override
    public final void b(b2.w wVar) {
        this.f47443a.b(wVar);
    }

    @Override
    public final void c(long j10, int i10, int i11, int i12, c3.i0 i0Var) {
        h().c(j10, i10, i11, i12, i0Var);
        AtomicReference atomicReference = this.d;
        if (atomicReference.get() == r0.f47438b) {
            this.f47444b.G(false);
            atomicReference.set(r0.f47439c);
        }
    }

    @Override
    public final void d(int i10, e2.x xVar) {
        h().d(i10, xVar);
    }

    @Override
    public final int f(b2.o oVar, int i10, boolean z10) {
        return h().f(oVar, i10, z10);
    }

    @Override
    public final void g(e2.x xVar, int i10, int i11) {
        h().g(xVar, i10, i11);
    }

    public final c3.j0 h() {
        if (this.d.get() == r0.f47439c) {
            return this.f47445c;
        }
        return this.f47444b;
    }

    @Override
    public final void e(long j10) {
    }
}
