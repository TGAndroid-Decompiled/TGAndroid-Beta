package org.telegram.ui;
public final class tb1 extends kc1 {
    public final qn f41637k2;
    public final boolean f41638l2;

    public tb1(Object obj, qn qnVar, boolean z10) {
        super(obj, null, true);
        this.f41637k2 = qnVar;
        this.f41638l2 = z10;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        on onVar = this.f41637k2.f40676ea;
        onVar.k(onVar.f39935f, onVar.h, false, Boolean.valueOf(this.f41638l2), false);
    }
}
