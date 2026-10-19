package org.telegram.ui;
public final class tb1 extends kc1 {
    public final qn f41629k2;
    public final boolean f41630l2;

    public tb1(Object obj, qn qnVar, boolean z10) {
        super(obj, null, true);
        this.f41629k2 = qnVar;
        this.f41630l2 = z10;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        on onVar = this.f41629k2.f40675ea;
        onVar.k(onVar.f39935f, onVar.h, false, Boolean.valueOf(this.f41630l2), false);
    }
}
