package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ti implements Runnable {
    public final int f38525a;
    public final ui f38526b;
    public final int f38527c;
    public final boolean d;
    public final org.telegram.ui.Components.pk0 e;
    public final float f38528f;
    public final float h;
    public final mg.q0 f38529n;

    public ti(ui uiVar, int i10, boolean z4, org.telegram.ui.Components.pk0 pk0Var, float f10, float f11, mg.q0 q0Var, int i11) {
        this.f38525a = i11;
        this.f38526b = uiVar;
        this.f38527c = i10;
        this.d = z4;
        this.e = pk0Var;
        this.f38528f = f10;
        this.h = f11;
        this.f38529n = q0Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f38525a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ti(this.f38526b, this.f38527c, this.d, this.e, this.f38528f, this.h, this.f38529n, 1), 50L);
                return;
            default:
                zn znVar = this.f38526b.f38824s;
                org.telegram.ui.Cells.a0 q82 = znVar.q8(this.f38527c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
                    mg.m0.d(znVar, this.e, q82, null, this.f38528f, this.h, this.f38529n, i10, 1);
                    mg.m0.f();
                    return;
                }
                return;
        }
    }
}
