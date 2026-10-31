package org.telegram.ui;
public final class x81 implements e91 {
    public boolean f43503a;
    public final un f43504b;

    public x81(un unVar, boolean z10) {
        this.f43504b = unVar;
        this.f43503a = z10;
    }

    @Override
    public final void M1(boolean z10) {
        boolean z11 = !this.f43503a;
        this.f43503a = z11;
        sn snVar = this.f43504b.f42477xa;
        snVar.r(snVar.f41590f, snVar.f41591g, z10, Boolean.valueOf(z11), false);
    }

    @Override
    public final boolean a() {
        return this.f43503a;
    }

    @Override
    public final boolean b1() {
        return true;
    }
}
