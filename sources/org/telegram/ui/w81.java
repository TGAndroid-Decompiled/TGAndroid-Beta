package org.telegram.ui;
public final class w81 extends m91 {
    public final un f42908l2;
    public final boolean f42909m2;

    public w81(Object obj, un unVar, boolean z10) {
        super(obj, null, true);
        this.f42908l2 = unVar;
        this.f42909m2 = z10;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        sn snVar = this.f42908l2.f42477xa;
        snVar.r(snVar.f41590f, snVar.f41591g, false, Boolean.valueOf(this.f42909m2), false);
    }
}
