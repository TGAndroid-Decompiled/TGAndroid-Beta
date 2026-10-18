package org.telegram.ui;
public final class wb1 implements dc1 {
    public boolean f42505a;
    public final sn f42506b;

    public wb1(sn snVar, boolean z10) {
        this.f42506b = snVar;
        this.f42505a = z10;
    }

    @Override
    public final boolean I0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f42505a;
    }

    @Override
    public final void c1(boolean z10) {
        boolean z11 = !this.f42505a;
        this.f42505a = z11;
        qn qnVar = this.f42506b.f41226ea;
        qnVar.k(qnVar.f40477f, qnVar.h, z10, Boolean.valueOf(z11), false);
    }
}
