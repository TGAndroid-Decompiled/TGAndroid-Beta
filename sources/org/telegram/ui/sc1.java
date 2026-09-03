package org.telegram.ui;
public final class sc1 extends jd1 {
    public final zn f38151h2;
    public final boolean f38152i2;

    public sc1(Object obj, zn znVar, boolean z4) {
        super(obj, null, true);
        this.f38151h2 = znVar;
        this.f38152i2 = z4;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        xn xnVar = this.f38151h2.f40534ba;
        xnVar.i(xnVar.f40028f, xnVar.h, false, Boolean.valueOf(this.f38152i2), false);
    }
}
