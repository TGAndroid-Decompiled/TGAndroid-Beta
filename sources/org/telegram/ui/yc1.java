package org.telegram.ui;
public final class yc1 implements fd1 {
    public boolean f40230a;
    public final wn f40231b;

    public yc1(wn wnVar, boolean z10) {
        this.f40231b = wnVar;
        this.f40230a = z10;
    }

    @Override
    public final boolean Y0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f40230a;
    }

    @Override
    public final void o1(boolean z10) {
        boolean z11 = !this.f40230a;
        this.f40230a = z11;
        un unVar = this.f40231b.f39562ea;
        unVar.i(unVar.f38598f, unVar.h, z10, Boolean.valueOf(z11), false);
    }
}
