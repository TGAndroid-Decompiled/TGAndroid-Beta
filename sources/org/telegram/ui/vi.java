package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class vi implements Runnable {
    public final int f42866a;
    public final wi f42867b;
    public final int f42868c;
    public final boolean d;
    public final org.telegram.ui.Components.kl0 f42869e;
    public final float f42870f;
    public final float h;
    public final zg.n0 f42871n;

    public vi(wi wiVar, int i10, boolean z10, org.telegram.ui.Components.kl0 kl0Var, float f7, float f10, zg.n0 n0Var, int i11) {
        this.f42866a = i11;
        this.f42867b = wiVar;
        this.f42868c = i10;
        this.d = z10;
        this.f42869e = kl0Var;
        this.f42870f = f7;
        this.h = f10;
        this.f42871n = n0Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f42866a) {
            case 0:
                AndroidUtilities.runOnUIThread(new vi(this.f42867b, this.f42868c, this.d, this.f42869e, this.f42870f, this.h, this.f42871n, 1), 50L);
                return;
            default:
                zn znVar = this.f42867b.f43624s;
                org.telegram.ui.Cells.a0 t82 = znVar.t8(this.f42868c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                    zg.j0.d(znVar, this.f42869e, t82, null, this.f42870f, this.h, this.f42871n, i10, 1);
                    zg.j0.f();
                    return;
                }
                return;
        }
    }
}
