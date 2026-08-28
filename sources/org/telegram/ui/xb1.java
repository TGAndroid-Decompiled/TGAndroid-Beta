package org.telegram.ui;
public final class xb1 extends oc1 {
    public final qn f44458g2;
    public final boolean f44459h2;

    public xb1(Object obj, qn qnVar, boolean z10) {
        super(obj, null, true);
        this.f44458g2 = qnVar;
        this.f44459h2 = z10;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        on onVar = this.f44458g2.f41848aa;
        onVar.i(onVar.f41205f, onVar.h, false, Boolean.valueOf(this.f44459h2), false);
    }
}
