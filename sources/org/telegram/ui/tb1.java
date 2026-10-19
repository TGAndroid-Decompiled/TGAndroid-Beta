package org.telegram.ui;
public final class tb1 extends kc1 {
    public final qn f41628k2;
    public final boolean f41629l2;

    public tb1(Object obj, qn qnVar, boolean z10) {
        super(obj, null, true);
        this.f41628k2 = qnVar;
        this.f41629l2 = z10;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        on onVar = this.f41628k2.f40667ea;
        onVar.k(onVar.f39926f, onVar.h, false, Boolean.valueOf(this.f41629l2), false);
    }
}
