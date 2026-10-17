package org.telegram.ui;
public final class wb1 implements dc1 {
    public boolean f42481a;
    public final sn f42482b;

    public wb1(sn snVar, boolean z10) {
        this.f42482b = snVar;
        this.f42481a = z10;
    }

    @Override
    public final boolean I0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f42481a;
    }

    @Override
    public final void c1(boolean z10) {
        boolean z11 = !this.f42481a;
        this.f42481a = z11;
        qn qnVar = this.f42482b.f41205ea;
        qnVar.k(qnVar.f40471f, qnVar.h, z10, Boolean.valueOf(z11), false);
    }
}
