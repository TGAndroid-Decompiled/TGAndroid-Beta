package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ri extends pf.c {
    public final int d;
    public final int e;
    public final org.telegram.ui.Cells.t1 f41152f;
    public final sn f41153g;

    public ri(sn snVar, int i10, org.telegram.ui.Cells.t1 t1Var, int i11) {
        this.d = i11;
        this.f41153g = snVar;
        this.e = i10;
        this.f41152f = t1Var;
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
                sn snVar = this.f41153g;
                snVar.Jb = i10;
                snVar.Kb = 6;
                this.f41152f.invalidate();
                return;
            case 1:
                int i11 = this.e;
                sn snVar2 = this.f41153g;
                snVar2.Jb = i11;
                snVar2.Kb = 5;
                snVar2.Mb = null;
                this.f41152f.invalidate();
                return;
            default:
                int i12 = this.e;
                sn snVar3 = this.f41153g;
                snVar3.Jb = i12;
                snVar3.Kb = 7;
                this.f41152f.invalidate();
                return;
        }
    }
}
