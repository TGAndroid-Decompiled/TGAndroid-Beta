package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ti implements Runnable {
    public final int f40854a;
    public final ui f40855b;
    public final int f40856c;
    public final boolean d;
    public final org.telegram.ui.Components.sk0 f40857e;
    public final float f40858f;
    public final float h;
    public final zg.o0 f40859n;

    public ti(ui uiVar, int i10, boolean z10, org.telegram.ui.Components.sk0 sk0Var, float f7, float f10, zg.o0 o0Var, int i11) {
        this.f40854a = i11;
        this.f40855b = uiVar;
        this.f40856c = i10;
        this.d = z10;
        this.f40857e = sk0Var;
        this.f40858f = f7;
        this.h = f10;
        this.f40859n = o0Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f40854a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ti(this.f40855b, this.f40856c, this.d, this.f40857e, this.f40858f, this.h, this.f40859n, 1), 50L);
                return;
            default:
                yn ynVar = this.f40855b.f41238s;
                org.telegram.ui.Cells.a0 q82 = ynVar.q8(this.f40856c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
                    zg.k0.d(ynVar, this.f40857e, q82, null, this.f40858f, this.h, this.f40859n, i10, 1);
                    zg.k0.f();
                    return;
                }
                return;
        }
    }
}
