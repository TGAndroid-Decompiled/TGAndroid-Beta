package u2;

import java.util.concurrent.atomic.AtomicReference;
public final class s0 implements c3.i0 {
    public final c1 f46036a;
    public final c1 f46037b;
    public final c3.n f46038c = new c3.n();
    public final AtomicReference d = new AtomicReference(r0.f46030a);

    public s0(c1 c1Var) {
        this.f46036a = c1Var;
        this.f46037b = c1Var;
    }

    @Override
    public final int a(b2.p pVar, int i10, boolean z10) {
        return h().a(pVar, i10, z10);
    }

    @Override
    public final void b(b2.x xVar) {
        this.f46036a.b(xVar);
    }

    @Override
    public final void c(long j10, int i10, int i11, int i12, c3.h0 h0Var) {
        h().c(j10, i10, i11, i12, h0Var);
        AtomicReference atomicReference = this.d;
        if (atomicReference.get() == r0.f46031b) {
            this.f46037b.G(false);
            atomicReference.set(r0.f46032c);
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

    public final c3.i0 h() {
        if (this.d.get() == r0.f46032c) {
            return this.f46038c;
        }
        return this.f46037b;
    }

    @Override
    public final void e(long j10) {
    }
}
