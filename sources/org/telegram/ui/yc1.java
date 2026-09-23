package org.telegram.ui;
public final class yc1 implements fd1 {
    public boolean f39794a;
    public final xn f39795b;

    public yc1(xn xnVar, boolean z10) {
        this.f39795b = xnVar;
        this.f39794a = z10;
    }

    @Override
    public final boolean Y0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f39794a;
    }

    @Override
    public final void o1(boolean z10) {
        boolean z11 = !this.f39794a;
        this.f39794a = z11;
        vn vnVar = this.f39795b.f39370ea;
        vnVar.i(vnVar.f38428f, vnVar.h, z10, Boolean.valueOf(z11), false);
    }
}
