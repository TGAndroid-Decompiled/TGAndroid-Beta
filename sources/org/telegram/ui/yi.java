package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class yi extends nf.e {
    public final int d;
    public final int f43236e;
    public final org.telegram.ui.Cells.u1 f43237f;
    public final yn f43238g;

    public yi(yn ynVar, int i10, org.telegram.ui.Cells.u1 u1Var, int i11) {
        this.d = i11;
        this.f43238g = ynVar;
        this.f43236e = i10;
        this.f43237f = u1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.o8(this, this.f43236e, 21), 240L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.o8(this, this.f43236e, 23), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.o8(this, this.f43236e, 24), 240L);
                    return;
                }
                return;
        }
    }

    @Override
    public final void d() {
        switch (this.d) {
            case 0:
                int i10 = this.f43236e;
                yn ynVar = this.f43238g;
                ynVar.f43518tb = i10;
                ynVar.f43531ub = 6;
                this.f43237f.invalidate();
                return;
            case 1:
                int i11 = this.f43236e;
                yn ynVar2 = this.f43238g;
                ynVar2.f43518tb = i11;
                ynVar2.f43531ub = 5;
                ynVar2.f43557wb = null;
                this.f43237f.invalidate();
                return;
            default:
                int i12 = this.f43236e;
                yn ynVar3 = this.f43238g;
                ynVar3.f43518tb = i12;
                ynVar3.f43531ub = 7;
                this.f43237f.invalidate();
                return;
        }
    }
}
