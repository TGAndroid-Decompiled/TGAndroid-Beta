package org.telegram.ui;
public final class zb1 extends qc1 {
    public final sn f44105l2;
    public final boolean f44106m2;

    public zb1(Object obj, sn snVar, boolean z10) {
        super(obj, null, true);
        this.f44105l2 = snVar;
        this.f44106m2 = z10;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        qn qnVar = this.f44105l2.f41654qa;
        qnVar.q(qnVar.f40871f, qnVar.f40872g, false, Boolean.valueOf(this.f44106m2), false);
    }
}
