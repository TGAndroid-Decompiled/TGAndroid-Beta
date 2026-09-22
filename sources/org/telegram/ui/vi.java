package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class vi implements Runnable {
    public final int f38579a;
    public final wi f38580b;
    public final int f38581c;
    public final boolean d;
    public final org.telegram.ui.Components.sk0 e;
    public final float f38582f;
    public final float h;
    public final zg.p0 f38583n;

    public vi(wi wiVar, int i10, boolean z10, org.telegram.ui.Components.sk0 sk0Var, float f7, float f10, zg.p0 p0Var, int i11) {
        this.f38579a = i11;
        this.f38580b = wiVar;
        this.f38581c = i10;
        this.d = z10;
        this.e = sk0Var;
        this.f38582f = f7;
        this.h = f10;
        this.f38583n = p0Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f38579a) {
            case 0:
                AndroidUtilities.runOnUIThread(new vi(this.f38580b, this.f38581c, this.d, this.e, this.f38582f, this.h, this.f38583n, 1), 50L);
                return;
            default:
                zn znVar = this.f38580b.f39185s;
                org.telegram.ui.Cells.a0 q82 = znVar.q8(this.f38581c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                    zg.l0.d(znVar, this.e, q82, null, this.f38582f, this.h, this.f38583n, i10, 1);
                    zg.l0.f();
                    return;
                }
                return;
        }
    }
}
