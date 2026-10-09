package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class vi implements Runnable {
    public final int f42864a;
    public final wi f42865b;
    public final int f42866c;
    public final boolean d;
    public final org.telegram.ui.Components.kl0 f42867e;
    public final float f42868f;
    public final float h;
    public final zg.n0 f42869n;

    public vi(wi wiVar, int i10, boolean z10, org.telegram.ui.Components.kl0 kl0Var, float f7, float f10, zg.n0 n0Var, int i11) {
        this.f42864a = i11;
        this.f42865b = wiVar;
        this.f42866c = i10;
        this.d = z10;
        this.f42867e = kl0Var;
        this.f42868f = f7;
        this.h = f10;
        this.f42869n = n0Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f42864a) {
            case 0:
                AndroidUtilities.runOnUIThread(new vi(this.f42865b, this.f42866c, this.d, this.f42867e, this.f42868f, this.h, this.f42869n, 1), 50L);
                return;
            default:
                zn znVar = this.f42865b.f43622s;
                org.telegram.ui.Cells.a0 t82 = znVar.t8(this.f42866c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                    zg.j0.d(znVar, this.f42867e, t82, null, this.f42868f, this.h, this.f42869n, i10, 1);
                    zg.j0.f();
                    return;
                }
                return;
        }
    }
}
