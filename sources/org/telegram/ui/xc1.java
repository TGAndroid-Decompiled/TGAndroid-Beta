package org.telegram.ui;
public final class xc1 extends od1 {
    public final wn f39901k2;
    public final boolean f39902l2;

    public xc1(Object obj, wn wnVar, boolean z10) {
        super(obj, null, true);
        this.f39901k2 = wnVar;
        this.f39902l2 = z10;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        un unVar = this.f39901k2.f39470ea;
        unVar.i(unVar.f38507f, unVar.h, false, Boolean.valueOf(this.f39902l2), false);
    }
}
