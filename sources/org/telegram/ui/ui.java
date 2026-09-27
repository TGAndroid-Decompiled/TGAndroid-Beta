package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ui implements Runnable {
    public final int f38261a;
    public final vi f38262b;
    public final int f38263c;
    public final boolean d;
    public final org.telegram.ui.Components.sk0 e;
    public final float f38264f;
    public final float h;
    public final zg.p0 f38265n;

    public ui(vi viVar, int i10, boolean z10, org.telegram.ui.Components.sk0 sk0Var, float f7, float f10, zg.p0 p0Var, int i11) {
        this.f38261a = i11;
        this.f38262b = viVar;
        this.f38263c = i10;
        this.d = z10;
        this.e = sk0Var;
        this.f38264f = f7;
        this.h = f10;
        this.f38265n = p0Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f38261a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ui(this.f38262b, this.f38263c, this.d, this.e, this.f38264f, this.h, this.f38265n, 1), 50L);
                return;
            default:
                xn xnVar = this.f38262b.f38619s;
                org.telegram.ui.Cells.a0 q82 = xnVar.q8(this.f38263c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.o2) xnVar).currentAccount;
                    zg.l0.d(xnVar, this.e, q82, null, this.f38264f, this.h, this.f38265n, i10, 1);
                    zg.l0.f();
                    return;
                }
                return;
        }
    }
}
