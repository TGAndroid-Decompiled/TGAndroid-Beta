package org.telegram.ui;
public final class ub1 implements bc1 {
    public boolean f41935a;
    public final qn f41936b;

    public ub1(qn qnVar, boolean z10) {
        this.f41936b = qnVar;
        this.f41935a = z10;
    }

    @Override
    public final boolean I0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f41935a;
    }

    @Override
    public final void c1(boolean z10) {
        boolean z11 = !this.f41935a;
        this.f41935a = z11;
        on onVar = this.f41936b.f40675ea;
        onVar.k(onVar.f39935f, onVar.h, z10, Boolean.valueOf(z11), false);
    }
}
