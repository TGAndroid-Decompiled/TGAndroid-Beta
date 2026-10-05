package org.telegram.ui;
public final class yc1 extends pd1 {
    public final yn f43190k2;
    public final boolean f43191l2;

    public yc1(Object obj, yn ynVar, boolean z10) {
        super(obj, null, true);
        this.f43190k2 = ynVar;
        this.f43191l2 = z10;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        wn wnVar = this.f43190k2.f43300ca;
        wnVar.i(wnVar.f42613f, wnVar.h, false, Boolean.valueOf(this.f43191l2), false);
    }
}
