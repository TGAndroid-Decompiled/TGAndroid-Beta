package org.telegram.ui;

public final class wb1 implements ec1 {

    public boolean f43698a;

    public final rn f43699b;

    public wb1(rn rnVar, boolean z10) {
        this.f43699b = rnVar;
        this.f43698a = z10;
    }

    @Override
    public final boolean X0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f43698a;
    }

    @Override
    public final void n1(boolean z10) {
        boolean z11 = !this.f43698a;
        this.f43698a = z11;
        pn pnVar = this.f43699b.f41983aa;
        pnVar.i(pnVar.f41395f, pnVar.h, z10, Boolean.valueOf(z11), false);
    }
}
