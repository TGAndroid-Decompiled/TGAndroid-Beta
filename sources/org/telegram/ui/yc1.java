package org.telegram.ui;
public final class yc1 extends pd1 {
    public final xn f40187k2;
    public final boolean f40188l2;

    public yc1(Object obj, xn xnVar, boolean z10) {
        super(obj, null, true);
        this.f40187k2 = xnVar;
        this.f40188l2 = z10;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        vn vnVar = this.f40187k2.f39750ea;
        vnVar.i(vnVar.f38646f, vnVar.h, false, Boolean.valueOf(this.f40188l2), false);
    }
}
