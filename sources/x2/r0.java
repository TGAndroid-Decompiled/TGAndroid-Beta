package x2;

import java.util.concurrent.atomic.AtomicReference;
public final class r0 implements f3.j0 {
    public final a1 f58463a;
    public final a1 f58464b;
    public final f3.n f58465c = new f3.n();
    public final AtomicReference d = new AtomicReference(q0.f58458a);

    public r0(a1 a1Var) {
        this.f58463a = a1Var;
        this.f58464b = a1Var;
    }

    @Override
    public final void a(h2.x xVar, int i7, int i10) {
        h().a(xVar, i7, i10);
    }

    @Override
    public final void b(int i7, h2.x xVar) {
        h().b(i7, xVar);
    }

    @Override
    public final void c(long j3, int i7, int i10, int i11, f3.i0 i0Var) {
        h().c(j3, i7, i10, i11, i0Var);
        AtomicReference atomicReference = this.d;
        if (atomicReference.get() == q0.f58459b) {
            this.f58464b.G(false);
            atomicReference.set(q0.f58460c);
        }
    }

    @Override
    public final int e(e2.n nVar, int i7, boolean z9) {
        return h().e(nVar, i7, z9);
    }

    @Override
    public final int f(e2.n nVar, int i7, boolean z9) {
        return h().f(nVar, i7, z9);
    }

    @Override
    public final void g(e2.u uVar) {
        this.f58463a.g(uVar);
    }

    public final f3.j0 h() {
        if (this.d.get() == q0.f58460c) {
            return this.f58465c;
        }
        return this.f58464b;
    }

    @Override
    public final void d(long j3) {
    }
}
