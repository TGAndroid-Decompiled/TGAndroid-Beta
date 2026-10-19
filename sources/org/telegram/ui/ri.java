package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ri extends pf.c {
    public final int d;
    public final int e;
    public final org.telegram.ui.Cells.u1 f41220f;
    public final qn f41221g;

    public ri(qn qnVar, int i10, org.telegram.ui.Cells.u1 u1Var, int i11) {
        this.d = i11;
        this.f41221g = qnVar;
        this.e = i10;
        this.f41220f = u1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ah.g(this, this.e, 23), 240L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ah.g(this, this.e, 26), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ah.g(this, this.e, 27), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i10 = this.e;
                qn qnVar = this.f41221g;
                qnVar.f40892wb = i10;
                qnVar.f40906xb = 6;
                this.f41220f.invalidate();
                return;
            case 1:
                int i11 = this.e;
                qn qnVar2 = this.f41221g;
                qnVar2.f40892wb = i11;
                qnVar2.f40906xb = 5;
                qnVar2.f40931zb = null;
                this.f41220f.invalidate();
                return;
            default:
                int i12 = this.e;
                qn qnVar3 = this.f41221g;
                qnVar3.f40892wb = i12;
                qnVar3.f40906xb = 7;
                this.f41220f.invalidate();
                return;
        }
    }
}
