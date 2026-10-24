package org.telegram.ui;
public final class yb1 extends pc1 {
    public final sn f43818l2;
    public final boolean f43819m2;

    public yb1(Object obj, sn snVar, boolean z10) {
        super(obj, null, true);
        this.f43818l2 = snVar;
        this.f43819m2 = z10;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        qn qnVar = this.f43818l2.f41651qa;
        qnVar.q(qnVar.f40882f, qnVar.f40883g, false, Boolean.valueOf(this.f43819m2), false);
    }
}
