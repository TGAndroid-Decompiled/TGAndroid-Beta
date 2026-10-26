package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class si extends qf.c {
    public final int d;
    public final int e;
    public final org.telegram.ui.Cells.s1 f43524f;
    public final un f43525g;

    public si(un unVar, int i10, org.telegram.ui.Cells.s1 s1Var, int i11) {
        this.d = i11;
        this.f43525g = unVar;
        this.e = i10;
        this.f43524f = s1Var;
    }

    @Override
    public final void c(boolean z10) {
        switch (this.d) {
            case 0:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ag.r0(this, this.e, 23), 240L);
                    return;
                }
                return;
            case 1:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ag.r0(this, this.e, 26), 240L);
                    return;
                }
                return;
            default:
                if (!z10) {
                    AndroidUtilities.runOnUIThread(new ag.r0(this, this.e, 27), 240L);
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
                un unVar = this.f43525g;
                unVar.Sb = i10;
                unVar.Tb = 6;
                this.f43524f.invalidate();
                return;
            case 1:
                int i11 = this.e;
                un unVar2 = this.f43525g;
                unVar2.Sb = i11;
                unVar2.Tb = 5;
                unVar2.Vb = null;
                this.f43524f.invalidate();
                return;
            default:
                int i12 = this.e;
                un unVar3 = this.f43525g;
                unVar3.Sb = i12;
                unVar3.Tb = 7;
                this.f43524f.invalidate();
                return;
        }
    }
}
