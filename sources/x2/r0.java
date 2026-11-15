package x2;

import java.util.concurrent.atomic.AtomicReference;
public final class r0 implements f3.i0 {
    public final a1 f59644a;
    public final a1 f59645b;
    public final f3.n f59646c = new f3.n();
    public final AtomicReference d = new AtomicReference(q0.f59636a);

    public r0(a1 a1Var) {
        this.f59644a = a1Var;
        this.f59645b = a1Var;
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
        if (atomicReference.get() == q0.f59637b) {
            this.f59645b.G(false);
            atomicReference.set(q0.f59638c);
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
        this.f59644a.g(uVar);
    }

    public final f3.i0 h() {
        if (this.d.get() == q0.f59638c) {
            return this.f59646c;
        }
        return this.f59645b;
    }

    @Override
    public final void d(long j3) {
    }
}
