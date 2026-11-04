package org.telegram.ui;
public final class v61 extends l71 {
    public final wm f50414m2;
    public final boolean f50415n2;

    public v61(Object obj, wm wmVar, boolean z10) {
        super(obj, null, true);
        this.f50414m2 = wmVar;
        this.f50415n2 = z10;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        um umVar = this.f50414m2.f51557ya;
        umVar.r(umVar.f50124f, umVar.f50125g, false, Boolean.valueOf(this.f50415n2), false);
    }
}
