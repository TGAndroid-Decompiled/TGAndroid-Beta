package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ri implements Runnable {
    public final int f40855a;
    public final si f40856b;
    public final int f40857c;
    public final boolean d;
    public final org.telegram.ui.Components.qk0 f40858e;
    public final float f40859f;
    public final float h;
    public final ng.q0 f40860n;

    public ri(si siVar, int i10, boolean z4, org.telegram.ui.Components.qk0 qk0Var, float f10, float f11, ng.q0 q0Var, int i11) {
        this.f40855a = i11;
        this.f40856b = siVar;
        this.f40857c = i10;
        this.d = z4;
        this.f40858e = qk0Var;
        this.f40859f = f10;
        this.h = f11;
        this.f40860n = q0Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f40855a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ri(this.f40856b, this.f40857c, this.d, this.f40858e, this.f40859f, this.h, this.f40860n, 1), 50L);
                return;
            default:
                xn xnVar = this.f40856b.f41253s;
                org.telegram.ui.Cells.a0 q82 = xnVar.q8(this.f40857c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                    ng.m0.d(xnVar, this.f40858e, q82, null, this.f40859f, this.h, this.f40860n, i10, 1);
                    ng.m0.f();
                    return;
                }
                return;
        }
    }
}
