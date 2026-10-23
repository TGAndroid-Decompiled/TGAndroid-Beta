package org.telegram.ui;
public final class tb1 extends kc1 {
    public final qn f41638k2;
    public final boolean f41639l2;

    public tb1(Object obj, qn qnVar, boolean z10) {
        super(obj, null, true);
        this.f41638k2 = qnVar;
        this.f41639l2 = z10;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        on onVar = this.f41638k2.f40677ea;
        onVar.k(onVar.f39936f, onVar.h, false, Boolean.valueOf(this.f41639l2), false);
    }
}
