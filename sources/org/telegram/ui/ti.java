package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ti extends pf.c {
    public final int d;
    public final int e;
    public final org.telegram.ui.Cells.u1 f41757f;
    public final sn f41758g;

    public ti(sn snVar, int i10, org.telegram.ui.Cells.u1 u1Var, int i11) {
        this.d = i11;
        this.f41758g = snVar;
        this.e = i10;
        this.f41757f = u1Var;
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
                sn snVar = this.f41758g;
                snVar.f41430wb = i10;
                snVar.f41444xb = 6;
                this.f41757f.invalidate();
                return;
            case 1:
                int i11 = this.e;
                sn snVar2 = this.f41758g;
                snVar2.f41430wb = i11;
                snVar2.f41444xb = 5;
                snVar2.f41469zb = null;
                this.f41757f.invalidate();
                return;
            default:
                int i12 = this.e;
                sn snVar3 = this.f41758g;
                snVar3.f41430wb = i12;
                snVar3.f41444xb = 7;
                this.f41757f.invalidate();
                return;
        }
    }
}
