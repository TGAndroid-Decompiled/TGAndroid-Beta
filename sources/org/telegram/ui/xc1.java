package org.telegram.ui;
public final class xc1 extends od1 {
    public final wn f39900k2;
    public final boolean f39901l2;

    public xc1(Object obj, wn wnVar, boolean z10) {
        super(obj, null, true);
        this.f39900k2 = wnVar;
        this.f39901l2 = z10;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        un unVar = this.f39900k2.f39469ea;
        unVar.i(unVar.f38506f, unVar.h, false, Boolean.valueOf(this.f39901l2), false);
    }
}
