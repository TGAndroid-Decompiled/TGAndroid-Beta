package org.telegram.ui;
public final class tc1 implements ad1 {
    public boolean f41508a;
    public final xn f41509b;

    public tc1(xn xnVar, boolean z4) {
        this.f41509b = xnVar;
        this.f41508a = z4;
    }

    @Override
    public final boolean T0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f41508a;
    }

    @Override
    public final void l1(boolean z4) {
        boolean z10 = !this.f41508a;
        this.f41508a = z10;
        vn vnVar = this.f41509b.f43114ba;
        vnVar.i(vnVar.f42178f, vnVar.h, z4, Boolean.valueOf(z10), false);
    }
}
