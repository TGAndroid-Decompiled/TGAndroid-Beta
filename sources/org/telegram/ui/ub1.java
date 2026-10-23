package org.telegram.ui;
public final class ub1 implements bc1 {
    public boolean f41929a;
    public final qn f41930b;

    public ub1(qn qnVar, boolean z10) {
        this.f41930b = qnVar;
        this.f41929a = z10;
    }

    @Override
    public final boolean I0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f41929a;
    }

    @Override
    public final void c1(boolean z10) {
        boolean z11 = !this.f41929a;
        this.f41929a = z11;
        on onVar = this.f41930b.f40677ea;
        onVar.k(onVar.f39936f, onVar.h, z10, Boolean.valueOf(z11), false);
    }
}
