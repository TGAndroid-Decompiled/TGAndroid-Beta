package org.telegram.ui;
public final class vb1 extends mc1 {
    public final sn f42142k2;
    public final boolean f42143l2;

    public vb1(Object obj, sn snVar, boolean z10) {
        super(obj, null, true);
        this.f42142k2 = snVar;
        this.f42143l2 = z10;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        qn qnVar = this.f42142k2.f41191ea;
        qnVar.k(qnVar.f40443f, qnVar.h, false, Boolean.valueOf(this.f42143l2), false);
    }
}
