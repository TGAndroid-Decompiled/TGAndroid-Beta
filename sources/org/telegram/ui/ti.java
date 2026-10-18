package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ti extends pf.c {
    public final int d;
    public final int e;
    public final org.telegram.ui.Cells.u1 f41783f;
    public final sn f41784g;

    public ti(sn snVar, int i10, org.telegram.ui.Cells.u1 u1Var, int i11) {
        this.d = i11;
        this.f41784g = snVar;
        this.e = i10;
        this.f41783f = u1Var;
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
                sn snVar = this.f41784g;
                snVar.f41451wb = i10;
                snVar.f41465xb = 6;
                this.f41783f.invalidate();
                return;
            case 1:
                int i11 = this.e;
                sn snVar2 = this.f41784g;
                snVar2.f41451wb = i11;
                snVar2.f41465xb = 5;
                snVar2.f41490zb = null;
                this.f41783f.invalidate();
                return;
            default:
                int i12 = this.e;
                sn snVar3 = this.f41784g;
                snVar3.f41451wb = i12;
                snVar3.f41465xb = 7;
                this.f41783f.invalidate();
                return;
        }
    }
}
