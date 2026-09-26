package org.telegram.ui;
public final class yc1 implements fd1 {
    public boolean f40124a;
    public final wn f40125b;

    public yc1(wn wnVar, boolean z10) {
        this.f40125b = wnVar;
        this.f40124a = z10;
    }

    @Override
    public final boolean Y0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f40124a;
    }

    @Override
    public final void o1(boolean z10) {
        boolean z11 = !this.f40124a;
        this.f40124a = z11;
        un unVar = this.f40125b.f39469ea;
        unVar.i(unVar.f38506f, unVar.h, z10, Boolean.valueOf(z11), false);
    }
}
