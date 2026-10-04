package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ti implements Runnable {
    public final int f40861a;
    public final ui f40862b;
    public final int f40863c;
    public final boolean d;
    public final org.telegram.ui.Components.sk0 f40864e;
    public final float f40865f;
    public final float h;
    public final zg.o0 f40866n;

    public ti(ui uiVar, int i10, boolean z10, org.telegram.ui.Components.sk0 sk0Var, float f7, float f10, zg.o0 o0Var, int i11) {
        this.f40861a = i11;
        this.f40862b = uiVar;
        this.f40863c = i10;
        this.d = z10;
        this.f40864e = sk0Var;
        this.f40865f = f7;
        this.h = f10;
        this.f40866n = o0Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f40861a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ti(this.f40862b, this.f40863c, this.d, this.f40864e, this.f40865f, this.h, this.f40866n, 1), 50L);
                return;
            default:
                yn ynVar = this.f40862b.f41246s;
                org.telegram.ui.Cells.a0 q82 = ynVar.q8(this.f40863c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
                    zg.k0.d(ynVar, this.f40864e, q82, null, this.f40865f, this.h, this.f40866n, i10, 1);
                    zg.k0.f();
                    return;
                }
                return;
        }
    }
}
