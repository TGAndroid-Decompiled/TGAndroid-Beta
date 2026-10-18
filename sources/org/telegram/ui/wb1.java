package org.telegram.ui;
public final class wb1 implements dc1 {
    public boolean f42478a;
    public final sn f42479b;

    public wb1(sn snVar, boolean z10) {
        this.f42479b = snVar;
        this.f42478a = z10;
    }

    @Override
    public final boolean I0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f42478a;
    }

    @Override
    public final void c1(boolean z10) {
        boolean z11 = !this.f42478a;
        this.f42478a = z11;
        qn qnVar = this.f42479b.f41191ea;
        qnVar.k(qnVar.f40443f, qnVar.h, z10, Boolean.valueOf(z11), false);
    }
}
