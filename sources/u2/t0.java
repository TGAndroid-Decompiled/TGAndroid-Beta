package u2;

import java.util.concurrent.atomic.AtomicReference;
public final class t0 implements c3.j0 {
    public final d1 f47440a;
    public final d1 f47441b;
    public final c3.n f47442c = new c3.n();
    public final AtomicReference d = new AtomicReference(s0.f47431a);

    public t0(d1 d1Var) {
        this.f47440a = d1Var;
        this.f47441b = d1Var;
    }

    @Override
    public final int a(b2.o oVar, int i10, boolean z10) {
        return h().a(oVar, i10, z10);
    }

    @Override
    public final void b(b2.w wVar) {
        this.f47440a.b(wVar);
    }

    @Override
    public final void c(long j10, int i10, int i11, int i12, c3.i0 i0Var) {
        h().c(j10, i10, i11, i12, i0Var);
        AtomicReference atomicReference = this.d;
        if (atomicReference.get() == s0.f47432b) {
            this.f47441b.G(false);
            atomicReference.set(s0.f47433c);
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
        if (this.d.get() == s0.f47433c) {
            return this.f47442c;
        }
        return this.f47441b;
    }

    @Override
    public final void e(long j10) {
    }
}
