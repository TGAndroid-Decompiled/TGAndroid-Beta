package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class zi extends nf.e {
    public final int d;
    public final int e;
    public final org.telegram.ui.Cells.u1 f40221f;
    public final zn f40222g;

    public zi(zn znVar, int i10, org.telegram.ui.Cells.u1 u1Var, int i11) {
        this.d = i11;
        this.f40222g = znVar;
        this.e = i10;
        this.f40221f = u1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.n8(this, this.e, 21), 240L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.n8(this, this.e, 23), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ai.n8(this, this.e, 24), 240L);
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
                zn znVar = this.f40222g;
                znVar.f40514vb = i10;
                znVar.f40528wb = 6;
                this.f40221f.invalidate();
                return;
            case 1:
                int i11 = this.e;
                zn znVar2 = this.f40222g;
                znVar2.f40514vb = i11;
                znVar2.f40528wb = 5;
                znVar2.f40553yb = null;
                this.f40221f.invalidate();
                return;
            default:
                int i12 = this.e;
                zn znVar3 = this.f40222g;
                znVar3.f40514vb = i12;
                znVar3.f40528wb = 7;
                this.f40221f.invalidate();
                return;
        }
    }
}
