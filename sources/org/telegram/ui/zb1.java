package org.telegram.ui;
public final class zb1 implements gc1 {
    public boolean f44059a;
    public final sn f44060b;

    public zb1(sn snVar, boolean z10) {
        this.f44060b = snVar;
        this.f44059a = z10;
    }

    @Override
    public final boolean I0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f44059a;
    }

    @Override
    public final void c1(boolean z10) {
        boolean z11 = !this.f44059a;
        this.f44059a = z11;
        qn qnVar = this.f44060b.f41651qa;
        qnVar.q(qnVar.f40882f, qnVar.f40883g, z10, Boolean.valueOf(z11), false);
    }
}
