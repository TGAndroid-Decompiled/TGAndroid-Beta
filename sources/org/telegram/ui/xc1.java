package org.telegram.ui;
public final class xc1 extends od1 {
    public final xn f39244k2;
    public final boolean f39245l2;

    public xc1(Object obj, xn xnVar, boolean z10) {
        super(obj, null, true);
        this.f39244k2 = xnVar;
        this.f39245l2 = z10;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        vn vnVar = this.f39244k2.f39370ea;
        vnVar.i(vnVar.f38428f, vnVar.h, false, Boolean.valueOf(this.f39245l2), false);
    }
}
