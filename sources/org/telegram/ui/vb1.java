package org.telegram.ui;
public final class vb1 extends mc1 {
    public final sn f42167k2;
    public final boolean f42168l2;

    public vb1(Object obj, sn snVar, boolean z10) {
        super(obj, null, true);
        this.f42167k2 = snVar;
        this.f42168l2 = z10;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        qn qnVar = this.f42167k2.f41205ea;
        qnVar.k(qnVar.f40471f, qnVar.h, false, Boolean.valueOf(this.f42168l2), false);
    }
}
