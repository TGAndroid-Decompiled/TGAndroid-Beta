package org.telegram.ui;
public final class yc1 implements fd1 {
    public boolean f40123a;
    public final wn f40124b;

    public yc1(wn wnVar, boolean z10) {
        this.f40124b = wnVar;
        this.f40123a = z10;
    }

    @Override
    public final boolean Y0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f40123a;
    }

    @Override
    public final void o1(boolean z10) {
        boolean z11 = !this.f40123a;
        this.f40123a = z11;
        un unVar = this.f40124b.f39468ea;
        unVar.i(unVar.f38505f, unVar.h, z10, Boolean.valueOf(z11), false);
    }
}
