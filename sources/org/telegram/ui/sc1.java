package org.telegram.ui;
public final class sc1 extends jd1 {
    public final xn f41128h2;
    public final boolean f41129i2;

    public sc1(Object obj, xn xnVar, boolean z4) {
        super(obj, null, true);
        this.f41128h2 = xnVar;
        this.f41129i2 = z4;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        vn vnVar = this.f41128h2.f43114ba;
        vnVar.i(vnVar.f42178f, vnVar.h, false, Boolean.valueOf(this.f41129i2), false);
    }
}
