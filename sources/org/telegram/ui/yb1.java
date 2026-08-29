package org.telegram.ui;
public final class yb1 extends qc1 {
    public final tn f44832g2;
    public final boolean f44833h2;

    public yb1(Object obj, tn tnVar, boolean z10) {
        super(obj, null, true);
        this.f44832g2 = tnVar;
        this.f44833h2 = z10;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        rn rnVar = this.f44832g2.f42746aa;
        rnVar.i(rnVar.f42156f, rnVar.h, false, Boolean.valueOf(this.f44833h2), false);
    }
}
