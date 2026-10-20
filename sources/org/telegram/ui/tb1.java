package org.telegram.ui;
public final class tb1 extends kc1 {
    public final qn f41634k2;
    public final boolean f41635l2;

    public tb1(Object obj, qn qnVar, boolean z10) {
        super(obj, null, true);
        this.f41634k2 = qnVar;
        this.f41635l2 = z10;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        on onVar = this.f41634k2.f40673ea;
        onVar.k(onVar.f39932f, onVar.h, false, Boolean.valueOf(this.f41635l2), false);
    }
}
