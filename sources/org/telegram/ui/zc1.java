package org.telegram.ui;
public final class zc1 implements gd1 {
    public boolean f43745a;
    public final yn f43746b;

    public zc1(yn ynVar, boolean z10) {
        this.f43746b = ynVar;
        this.f43745a = z10;
    }

    @Override
    public final boolean a() {
        return this.f43745a;
    }

    @Override
    public final boolean a1() {
        return true;
    }

    @Override
    public final void q1(boolean z10) {
        boolean z11 = !this.f43745a;
        this.f43745a = z11;
        wn wnVar = this.f43746b.f43300ca;
        wnVar.i(wnVar.f42613f, wnVar.h, z10, Boolean.valueOf(z11), false);
    }
}
