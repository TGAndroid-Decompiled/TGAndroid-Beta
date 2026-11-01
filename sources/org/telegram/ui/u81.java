package org.telegram.ui;
public final class u81 extends k91 {
    public final un f41877l2;
    public final boolean f41878m2;

    public u81(Object obj, un unVar, boolean z10) {
        super(obj, null, true);
        this.f41877l2 = unVar;
        this.f41878m2 = z10;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        sn snVar = this.f41877l2.f42288xa;
        snVar.r(snVar.f41401f, snVar.f41402g, false, Boolean.valueOf(this.f41878m2), false);
    }
}
