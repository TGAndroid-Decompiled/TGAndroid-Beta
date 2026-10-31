package u2;

import java.util.concurrent.atomic.AtomicReference;
public final class s0 implements c3.k0 {
    public final c1 f49996a;
    public final c1 f49997b;
    public final c3.n f49998c = new c3.n();
    public final AtomicReference d = new AtomicReference(r0.f49990a);

    public s0(c1 c1Var) {
        this.f49996a = c1Var;
        this.f49997b = c1Var;
    }

    @Override
    public final int a(b2.p pVar, int i10, boolean z10) {
        return h().a(pVar, i10, z10);
    }

    @Override
    public final void b(b2.x xVar) {
        this.f49996a.b(xVar);
    }

    @Override
    public final void c(long j10, int i10, int i11, int i12, c3.j0 j0Var) {
        h().c(j10, i10, i11, i12, j0Var);
        AtomicReference atomicReference = this.d;
        if (atomicReference.get() == r0.f49991b) {
            this.f49997b.G(false);
            atomicReference.set(r0.f49992c);
        }
    }

    @Override
    public final void d(int i10, e2.x xVar) {
        h().d(i10, xVar);
    }

    @Override
    public final int f(b2.p pVar, int i10, boolean z10) {
        return h().f(pVar, i10, z10);
    }

    @Override
    public final void g(e2.x xVar, int i10, int i11) {
        h().g(xVar, i10, i11);
    }

    public final c3.k0 h() {
        if (this.d.get() == r0.f49992c) {
            return this.f49998c;
        }
        return this.f49997b;
    }

    @Override
    public final void e(long j10) {
    }
}
