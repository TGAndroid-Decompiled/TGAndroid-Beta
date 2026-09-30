package org.telegram.ui;
public final class xc1 extends od1 {
    public final wn f39998k2;
    public final boolean f39999l2;

    public xc1(Object obj, wn wnVar, boolean z10) {
        super(obj, null, true);
        this.f39998k2 = wnVar;
        this.f39999l2 = z10;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        un unVar = this.f39998k2.f39562ea;
        unVar.i(unVar.f38598f, unVar.h, false, Boolean.valueOf(this.f39999l2), false);
    }
}
