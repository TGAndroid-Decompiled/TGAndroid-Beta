package x2;

import java.util.concurrent.atomic.AtomicReference;
public final class s0 implements f3.i0 {
    public final c1 f60262a;
    public final c1 f60263b;
    public final f3.n f60264c = new f3.n();
    public final AtomicReference d = new AtomicReference(r0.f60254a);

    public s0(c1 c1Var) {
        this.f60262a = c1Var;
        this.f60263b = c1Var;
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
    public final void c(long j3, int i7, int i10, int i11, f3.h0 h0Var) {
        h().c(j3, i7, i10, i11, h0Var);
        AtomicReference atomicReference = this.d;
        if (atomicReference.get() == r0.f60255b) {
            this.f60263b.G(false);
            atomicReference.set(r0.f60256c);
        }
    }

    @Override
    public final int e(e2.n nVar, int i7, boolean z10) {
        return h().e(nVar, i7, z10);
    }

    @Override
    public final int f(e2.n nVar, int i7, boolean z10) {
        return h().f(nVar, i7, z10);
    }

    @Override
    public final void g(e2.u uVar) {
        this.f60262a.g(uVar);
    }

    public final f3.i0 h() {
        if (this.d.get() == r0.f60256c) {
            return this.f60264c;
        }
        return this.f60263b;
    }

    @Override
    public final void d(long j3) {
    }
}
