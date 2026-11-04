package org.telegram.ui;
public final class w61 implements d71 {
    public boolean f50723a;
    public final wm f50724b;

    public w61(wm wmVar, boolean z10) {
        this.f50724b = wmVar;
        this.f50723a = z10;
    }

    @Override
    public final boolean Y0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f50723a;
    }

    @Override
    public final void l1(boolean z10) {
        boolean z11 = !this.f50723a;
        this.f50723a = z11;
        um umVar = this.f50724b.f51557ya;
        umVar.r(umVar.f50124f, umVar.f50125g, z10, Boolean.valueOf(z11), false);
    }
}
