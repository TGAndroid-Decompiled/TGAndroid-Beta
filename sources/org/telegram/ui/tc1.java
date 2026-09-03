package org.telegram.ui;
public final class tc1 implements ad1 {
    public boolean f38462a;
    public final zn f38463b;

    public tc1(zn znVar, boolean z4) {
        this.f38463b = znVar;
        this.f38462a = z4;
    }

    @Override
    public final boolean T0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f38462a;
    }

    @Override
    public final void l1(boolean z4) {
        boolean z10 = !this.f38462a;
        this.f38462a = z10;
        xn xnVar = this.f38463b.f40534ba;
        xnVar.i(xnVar.f40028f, xnVar.h, z4, Boolean.valueOf(z10), false);
    }
}
