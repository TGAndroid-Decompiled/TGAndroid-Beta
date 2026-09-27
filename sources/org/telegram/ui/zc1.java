package org.telegram.ui;
public final class zc1 implements gd1 {
    public boolean f40470a;
    public final xn f40471b;

    public zc1(xn xnVar, boolean z10) {
        this.f40471b = xnVar;
        this.f40470a = z10;
    }

    @Override
    public final boolean Y0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f40470a;
    }

    @Override
    public final void o1(boolean z10) {
        boolean z11 = !this.f40470a;
        this.f40470a = z11;
        vn vnVar = this.f40471b.f39750ea;
        vnVar.i(vnVar.f38646f, vnVar.h, z10, Boolean.valueOf(z11), false);
    }
}
