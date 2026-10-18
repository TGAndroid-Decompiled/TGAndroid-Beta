package org.telegram.ui;
public final class vb1 extends mc1 {
    public final sn f42184k2;
    public final boolean f42185l2;

    public vb1(Object obj, sn snVar, boolean z10) {
        super(obj, null, true);
        this.f42184k2 = snVar;
        this.f42185l2 = z10;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        qn qnVar = this.f42184k2.f41226ea;
        qnVar.k(qnVar.f40477f, qnVar.h, false, Boolean.valueOf(this.f42185l2), false);
    }
}
