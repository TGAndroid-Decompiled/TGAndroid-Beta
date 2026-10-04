package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ti implements Runnable {
    public final int f40855a;
    public final ui f40856b;
    public final int f40857c;
    public final boolean d;
    public final org.telegram.ui.Components.sk0 f40858e;
    public final float f40859f;
    public final float h;
    public final zg.o0 f40860n;

    public ti(ui uiVar, int i10, boolean z10, org.telegram.ui.Components.sk0 sk0Var, float f7, float f10, zg.o0 o0Var, int i11) {
        this.f40855a = i11;
        this.f40856b = uiVar;
        this.f40857c = i10;
        this.d = z10;
        this.f40858e = sk0Var;
        this.f40859f = f7;
        this.h = f10;
        this.f40860n = o0Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f40855a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ti(this.f40856b, this.f40857c, this.d, this.f40858e, this.f40859f, this.h, this.f40860n, 1), 50L);
                return;
            default:
                yn ynVar = this.f40856b.f41239s;
                org.telegram.ui.Cells.a0 q82 = ynVar.q8(this.f40857c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
                    zg.k0.d(ynVar, this.f40858e, q82, null, this.f40859f, this.h, this.f40860n, i10, 1);
                    zg.k0.f();
                    return;
                }
                return;
        }
    }
}
