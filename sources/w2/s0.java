package w2;

import java.util.concurrent.atomic.AtomicReference;
public final class s0 implements e3.i0 {
    public final c1 f57210a;
    public final c1 f57211b;
    public final e3.n f57212c = new e3.n();
    public final AtomicReference d = new AtomicReference(r0.f57202a);

    public s0(c1 c1Var) {
        this.f57210a = c1Var;
        this.f57211b = c1Var;
    }

    @Override
    public final int a(d2.o oVar, int i3, boolean z10) {
        return h().a(oVar, i3, z10);
    }

    @Override
    public final int c(d2.o oVar, int i3, boolean z10) {
        return h().c(oVar, i3, z10);
    }

    @Override
    public final void d(long j10, int i3, int i10, int i11, e3.h0 h0Var) {
        h().d(j10, i3, i10, i11, h0Var);
        AtomicReference atomicReference = this.d;
        if (atomicReference.get() == r0.f57203b) {
            this.f57211b.G(false);
            atomicReference.set(r0.f57204c);
        }
    }

    @Override
    public final void e(int i3, g2.y yVar) {
        h().e(i3, yVar);
    }

    @Override
    public final void f(g2.y yVar, int i3, int i10) {
        h().f(yVar, i3, i10);
    }

    @Override
    public final void g(d2.v vVar) {
        this.f57210a.g(vVar);
    }

    public final e3.i0 h() {
        if (this.d.get() == r0.f57204c) {
            return this.f57212c;
        }
        return this.f57211b;
    }

    @Override
    public final void b(long j10) {
    }
}
