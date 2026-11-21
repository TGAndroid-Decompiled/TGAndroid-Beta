package x2;

import java.util.concurrent.atomic.AtomicReference;
public final class s0 implements f3.i0 {
    public final c1 f60258a;
    public final c1 f60259b;
    public final f3.n f60260c = new f3.n();
    public final AtomicReference d = new AtomicReference(r0.f60250a);

    public s0(c1 c1Var) {
        this.f60258a = c1Var;
        this.f60259b = c1Var;
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
        if (atomicReference.get() == r0.f60251b) {
            this.f60259b.G(false);
            atomicReference.set(r0.f60252c);
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
        this.f60258a.g(uVar);
    }

    public final f3.i0 h() {
        if (this.d.get() == r0.f60252c) {
            return this.f60260c;
        }
        return this.f60259b;
    }

    @Override
    public final void d(long j3) {
    }
}
