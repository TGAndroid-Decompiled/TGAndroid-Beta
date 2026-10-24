package u2;

import java.util.concurrent.atomic.AtomicReference;
public final class u0 implements c3.l0 {
    public final e1 f47893a;
    public final e1 f47894b;
    public final c3.p f47895c = new c3.p();
    public final AtomicReference d = new AtomicReference(t0.f47884a);

    public u0(e1 e1Var) {
        this.f47893a = e1Var;
        this.f47894b = e1Var;
    }

    @Override
    public final int a(b2.o oVar, int i10, boolean z10) {
        return h().a(oVar, i10, z10);
    }

    @Override
    public final void b(b2.w wVar) {
        this.f47893a.b(wVar);
    }

    @Override
    public final void c(long j10, int i10, int i11, int i12, c3.k0 k0Var) {
        h().c(j10, i10, i11, i12, k0Var);
        AtomicReference atomicReference = this.d;
        if (atomicReference.get() == t0.f47885b) {
            this.f47894b.G(false);
            atomicReference.set(t0.f47886c);
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

    public final c3.l0 h() {
        if (this.d.get() == t0.f47886c) {
            return this.f47895c;
        }
        return this.f47894b;
    }

    @Override
    public final void e(long j10) {
    }
}
