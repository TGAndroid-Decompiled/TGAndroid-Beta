package org.telegram.ui;
public final class xc1 extends od1 {
    public final wn f39884k2;
    public final boolean f39885l2;

    public xc1(Object obj, wn wnVar, boolean z10) {
        super(obj, null, true);
        this.f39884k2 = wnVar;
        this.f39885l2 = z10;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        un unVar = this.f39884k2.f39454ea;
        unVar.i(unVar.f38487f, unVar.h, false, Boolean.valueOf(this.f39885l2), false);
    }
}
