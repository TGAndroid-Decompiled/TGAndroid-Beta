package org.telegram.ui;
public final class yc1 implements fd1 {
    public boolean f40125a;
    public final wn f40126b;

    public yc1(wn wnVar, boolean z10) {
        this.f40126b = wnVar;
        this.f40125a = z10;
    }

    @Override
    public final boolean Y0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f40125a;
    }

    @Override
    public final void o1(boolean z10) {
        boolean z11 = !this.f40125a;
        this.f40125a = z11;
        un unVar = this.f40126b.f39470ea;
        unVar.i(unVar.f38507f, unVar.h, z10, Boolean.valueOf(z11), false);
    }
}
