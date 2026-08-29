package org.telegram.ui;
public final class zb1 implements hc1 {
    public boolean f45129a;
    public final tn f45130b;

    public zb1(tn tnVar, boolean z10) {
        this.f45130b = tnVar;
        this.f45129a = z10;
    }

    @Override
    public final boolean U0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f45129a;
    }

    @Override
    public final void j1(boolean z10) {
        boolean z11 = !this.f45129a;
        this.f45129a = z11;
        rn rnVar = this.f45130b.f42746aa;
        rnVar.i(rnVar.f42156f, rnVar.h, z10, Boolean.valueOf(z11), false);
    }
}
