package org.telegram.ui;
public final class ub1 implements bc1 {
    public boolean f41919a;
    public final qn f41920b;

    public ub1(qn qnVar, boolean z10) {
        this.f41920b = qnVar;
        this.f41919a = z10;
    }

    @Override
    public final boolean I0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f41919a;
    }

    @Override
    public final void c1(boolean z10) {
        boolean z11 = !this.f41919a;
        this.f41919a = z11;
        on onVar = this.f41920b.f40667ea;
        onVar.k(onVar.f39926f, onVar.h, z10, Boolean.valueOf(z11), false);
    }
}
