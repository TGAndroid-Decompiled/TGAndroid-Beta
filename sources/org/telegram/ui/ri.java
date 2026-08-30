package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ri implements Runnable {
    public final int f38056a;
    public final si f38057b;
    public final int f38058c;
    public final boolean d;
    public final org.telegram.ui.Components.pk0 e;
    public final float f38059f;
    public final float h;
    public final mg.q0 f38060n;

    public ri(si siVar, int i10, boolean z4, org.telegram.ui.Components.pk0 pk0Var, float f10, float f11, mg.q0 q0Var, int i11) {
        this.f38056a = i11;
        this.f38057b = siVar;
        this.f38058c = i10;
        this.d = z4;
        this.e = pk0Var;
        this.f38059f = f10;
        this.h = f11;
        this.f38060n = q0Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f38056a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ri(this.f38057b, this.f38058c, this.d, this.e, this.f38059f, this.h, this.f38060n, 1), 50L);
                return;
            default:
                xn xnVar = this.f38057b.f38349s;
                org.telegram.ui.Cells.a0 q82 = xnVar.q8(this.f38058c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                    mg.m0.d(xnVar, this.e, q82, null, this.f38059f, this.h, this.f38060n, i10, 1);
                    mg.m0.f();
                    return;
                }
                return;
        }
    }
}
