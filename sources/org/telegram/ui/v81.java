package org.telegram.ui;
public final class v81 implements c91 {
    public boolean f42445a;
    public final un f42446b;

    public v81(un unVar, boolean z10) {
        this.f42446b = unVar;
        this.f42445a = z10;
    }

    @Override
    public final void M1(boolean z10) {
        boolean z11 = !this.f42445a;
        this.f42445a = z11;
        sn snVar = this.f42446b.f42288xa;
        snVar.r(snVar.f41401f, snVar.f41402g, z10, Boolean.valueOf(z11), false);
    }

    @Override
    public final boolean a() {
        return this.f42445a;
    }

    @Override
    public final boolean b1() {
        return true;
    }
}
