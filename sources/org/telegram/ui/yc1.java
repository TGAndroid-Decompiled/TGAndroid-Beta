package org.telegram.ui;
public final class yc1 implements fd1 {
    public boolean f40109a;
    public final wn f40110b;

    public yc1(wn wnVar, boolean z10) {
        this.f40110b = wnVar;
        this.f40109a = z10;
    }

    @Override
    public final boolean Y0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f40109a;
    }

    @Override
    public final void o1(boolean z10) {
        boolean z11 = !this.f40109a;
        this.f40109a = z11;
        un unVar = this.f40110b.f39454ea;
        unVar.i(unVar.f38487f, unVar.h, z10, Boolean.valueOf(z11), false);
    }
}
