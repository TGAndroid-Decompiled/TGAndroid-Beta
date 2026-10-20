package org.telegram.ui;
public final class ub1 implements bc1 {
    public boolean f41925a;
    public final qn f41926b;

    public ub1(qn qnVar, boolean z10) {
        this.f41926b = qnVar;
        this.f41925a = z10;
    }

    @Override
    public final boolean I0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f41925a;
    }

    @Override
    public final void c1(boolean z10) {
        boolean z11 = !this.f41925a;
        this.f41925a = z11;
        on onVar = this.f41926b.f40673ea;
        onVar.k(onVar.f39932f, onVar.h, z10, Boolean.valueOf(z11), false);
    }
}
