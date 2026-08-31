package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ri implements Runnable {
    public final int f40967a;
    public final si f40968b;
    public final int f40969c;
    public final boolean d;
    public final org.telegram.ui.Components.rk0 f40970e;
    public final float f40971f;
    public final float h;
    public final ng.q0 f40972n;

    public ri(si siVar, int i10, boolean z4, org.telegram.ui.Components.rk0 rk0Var, float f10, float f11, ng.q0 q0Var, int i11) {
        this.f40967a = i11;
        this.f40968b = siVar;
        this.f40969c = i10;
        this.d = z4;
        this.f40970e = rk0Var;
        this.f40971f = f10;
        this.h = f11;
        this.f40972n = q0Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f40967a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ri(this.f40968b, this.f40969c, this.d, this.f40970e, this.f40971f, this.h, this.f40972n, 1), 50L);
                return;
            default:
                xn xnVar = this.f40968b.f41300s;
                org.telegram.ui.Cells.a0 q82 = xnVar.q8(this.f40969c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                    ng.m0.d(xnVar, this.f40970e, q82, null, this.f40971f, this.h, this.f40972n, i10, 1);
                    ng.m0.f();
                    return;
                }
                return;
        }
    }
}
