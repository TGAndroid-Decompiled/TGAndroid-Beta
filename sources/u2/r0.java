package u2;

import java.util.concurrent.atomic.AtomicReference;
public final class r0 implements c3.j0 {
    public final b1 f47463a;
    public final b1 f47464b;
    public final c3.n f47465c = new c3.n();
    public final AtomicReference d = new AtomicReference(q0.f47457a);

    public r0(b1 b1Var) {
        this.f47463a = b1Var;
        this.f47464b = b1Var;
    }

    @Override
    public final int a(b2.o oVar, int i10, boolean z10) {
        return h().a(oVar, i10, z10);
    }

    @Override
    public final void b(b2.w wVar) {
        this.f47463a.b(wVar);
    }

    @Override
    public final void c(long j10, int i10, int i11, int i12, c3.i0 i0Var) {
        h().c(j10, i10, i11, i12, i0Var);
        AtomicReference atomicReference = this.d;
        if (atomicReference.get() == q0.f47458b) {
            this.f47464b.G(false);
            atomicReference.set(q0.f47459c);
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
        if (this.d.get() == q0.f47459c) {
            return this.f47465c;
        }
        return this.f47464b;
    }

    @Override
    public final void e(long j10) {
    }
}
