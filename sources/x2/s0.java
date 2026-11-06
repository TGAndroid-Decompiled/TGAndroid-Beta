package x2;

import java.util.concurrent.atomic.AtomicReference;
public final class s0 implements f3.j0 {
    public final b1 f58361a;
    public final b1 f58362b;
    public final f3.n f58363c = new f3.n();
    public final AtomicReference d = new AtomicReference(r0.f58356a);

    public s0(b1 b1Var) {
        this.f58361a = b1Var;
        this.f58362b = b1Var;
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
        if (atomicReference.get() == r0.f58357b) {
            this.f58362b.G(false);
            atomicReference.set(r0.f58358c);
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
        this.f58361a.g(uVar);
    }

    public final f3.j0 h() {
        if (this.d.get() == r0.f58358c) {
            return this.f58363c;
        }
        return this.f58362b;
    }

    @Override
    public final void d(long j3) {
    }
}
