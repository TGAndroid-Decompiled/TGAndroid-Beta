package org.telegram.ui;
public final class ub1 implements bc1 {
    public boolean f41928a;
    public final qn f41929b;

    public ub1(qn qnVar, boolean z10) {
        this.f41929b = qnVar;
        this.f41928a = z10;
    }

    @Override
    public final boolean I0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f41928a;
    }

    @Override
    public final void c1(boolean z10) {
        boolean z11 = !this.f41928a;
        this.f41928a = z11;
        on onVar = this.f41929b.f40676ea;
        onVar.k(onVar.f39935f, onVar.h, z10, Boolean.valueOf(z11), false);
    }
}
