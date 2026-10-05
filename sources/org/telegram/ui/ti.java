package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ti implements Runnable {
    public final int f40917a;
    public final ui f40918b;
    public final int f40919c;
    public final boolean d;
    public final org.telegram.ui.Components.sk0 f40920e;
    public final float f40921f;
    public final float h;
    public final zg.m0 f40922n;

    public ti(ui uiVar, int i10, boolean z10, org.telegram.ui.Components.sk0 sk0Var, float f7, float f10, zg.m0 m0Var, int i11) {
        this.f40917a = i11;
        this.f40918b = uiVar;
        this.f40919c = i10;
        this.d = z10;
        this.f40920e = sk0Var;
        this.f40921f = f7;
        this.h = f10;
        this.f40922n = m0Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f40917a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ti(this.f40918b, this.f40919c, this.d, this.f40920e, this.f40921f, this.h, this.f40922n, 1), 50L);
                return;
            default:
                yn ynVar = this.f40918b.f41283s;
                org.telegram.ui.Cells.a0 q82 = ynVar.q8(this.f40919c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
                    zg.i0.d(ynVar, this.f40920e, q82, null, this.f40921f, this.h, this.f40922n, i10, 1);
                    zg.i0.f();
                    return;
                }
                return;
        }
    }
}
