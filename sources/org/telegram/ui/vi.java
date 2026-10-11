package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class vi implements Runnable {
    public final int f43089a;
    public final wi f43090b;
    public final int f43091c;
    public final boolean d;
    public final org.telegram.ui.Components.ll0 f43092e;
    public final float f43093f;
    public final float h;
    public final zg.n0 f43094n;

    public vi(wi wiVar, int i10, boolean z10, org.telegram.ui.Components.ll0 ll0Var, float f7, float f10, zg.n0 n0Var, int i11) {
        this.f43089a = i11;
        this.f43090b = wiVar;
        this.f43091c = i10;
        this.d = z10;
        this.f43092e = ll0Var;
        this.f43093f = f7;
        this.h = f10;
        this.f43094n = n0Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f43089a) {
            case 0:
                AndroidUtilities.runOnUIThread(new vi(this.f43090b, this.f43091c, this.d, this.f43092e, this.f43093f, this.h, this.f43094n, 1), 50L);
                return;
            default:
                zn znVar = this.f43090b.f43822s;
                org.telegram.ui.Cells.a0 t82 = znVar.t8(this.f43091c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.m2) znVar).currentAccount;
                    zg.j0.d(znVar, this.f43092e, t82, null, this.f43093f, this.h, this.f43094n, i10, 1);
                    zg.j0.f();
                    return;
                }
                return;
        }
    }
}
