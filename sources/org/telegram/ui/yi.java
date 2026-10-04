package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class yi extends nf.e {
    public final int d;
    public final int f43228e;
    public final org.telegram.ui.Cells.u1 f43229f;
    public final yn f43230g;

    public yi(yn ynVar, int i10, org.telegram.ui.Cells.u1 u1Var, int i11) {
        this.d = i11;
        this.f43230g = ynVar;
        this.f43228e = i10;
        this.f43229f = u1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.o8(this, this.f43228e, 21), 240L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.o8(this, this.f43228e, 23), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.o8(this, this.f43228e, 24), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i10 = this.f43228e;
                yn ynVar = this.f43230g;
                ynVar.f43510tb = i10;
                ynVar.f43523ub = 6;
                this.f43229f.invalidate();
                return;
            case 1:
                int i11 = this.f43228e;
                yn ynVar2 = this.f43230g;
                ynVar2.f43510tb = i11;
                ynVar2.f43523ub = 5;
                ynVar2.f43549wb = null;
                this.f43229f.invalidate();
                return;
            default:
                int i12 = this.f43228e;
                yn ynVar3 = this.f43230g;
                ynVar3.f43510tb = i12;
                ynVar3.f43523ub = 7;
                this.f43229f.invalidate();
                return;
        }
    }
}
