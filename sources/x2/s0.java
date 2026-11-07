package x2;

import java.util.concurrent.atomic.AtomicReference;
public final class s0 implements f3.j0 {
    public final b1 f58367a;
    public final b1 f58368b;
    public final f3.n f58369c = new f3.n();
    public final AtomicReference d = new AtomicReference(r0.f58362a);

    public s0(b1 b1Var) {
        this.f58367a = b1Var;
        this.f58368b = b1Var;
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
        if (atomicReference.get() == r0.f58363b) {
            this.f58368b.G(false);
            atomicReference.set(r0.f58364c);
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
        this.f58367a.g(uVar);
    }

    public final f3.j0 h() {
        if (this.d.get() == r0.f58364c) {
            return this.f58369c;
        }
        return this.f58368b;
    }

    @Override
    public final void d(long j3) {
    }
}
