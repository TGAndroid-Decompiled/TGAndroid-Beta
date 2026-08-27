package org.telegram.ui;

public final class vb1 extends nc1 {

    public final rn f43413g2;

    public final boolean f43414h2;

    public vb1(Object obj, rn rnVar, boolean z10) {
        super(obj, null, true);
        this.f43413g2 = rnVar;
        this.f43414h2 = z10;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        pn pnVar = this.f43413g2.f41983aa;
        pnVar.i(pnVar.f41395f, pnVar.h, false, Boolean.valueOf(this.f43414h2), false);
    }
}
