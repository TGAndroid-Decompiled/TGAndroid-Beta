package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class si implements Runnable {
    public final int f37306a;
    public final ti f37307b;
    public final int f37308c;
    public final boolean d;
    public final org.telegram.ui.Components.gk0 e;
    public final float f37309f;
    public final float h;
    public final zg.p0 f37310n;

    public si(ti tiVar, int i10, boolean z10, org.telegram.ui.Components.gk0 gk0Var, float f7, float f10, zg.p0 p0Var, int i11) {
        this.f37306a = i11;
        this.f37307b = tiVar;
        this.f37308c = i10;
        this.d = z10;
        this.e = gk0Var;
        this.f37309f = f7;
        this.h = f10;
        this.f37310n = p0Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f37306a) {
            case 0:
                AndroidUtilities.runOnUIThread(new si(this.f37307b, this.f37308c, this.d, this.e, this.f37309f, this.h, this.f37310n, 1), 50L);
                return;
            default:
                xn xnVar = this.f37307b.f37697s;
                org.telegram.ui.Cells.a0 q82 = xnVar.q8(this.f37308c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.n2) xnVar).currentAccount;
                    zg.l0.d(xnVar, this.e, q82, null, this.f37309f, this.h, this.f37310n, i10, 1);
                    zg.l0.f();
                    return;
                }
                return;
        }
    }
}
