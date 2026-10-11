package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class vi implements Runnable {
    public final int f43055a;
    public final wi f43056b;
    public final int f43057c;
    public final boolean d;
    public final org.telegram.ui.Components.ml0 f43058e;
    public final float f43059f;
    public final float h;
    public final zg.n0 f43060n;

    public vi(wi wiVar, int i10, boolean z10, org.telegram.ui.Components.ml0 ml0Var, float f7, float f10, zg.n0 n0Var, int i11) {
        this.f43055a = i11;
        this.f43056b = wiVar;
        this.f43057c = i10;
        this.d = z10;
        this.f43058e = ml0Var;
        this.f43059f = f7;
        this.h = f10;
        this.f43060n = n0Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f43055a) {
            case 0:
                AndroidUtilities.runOnUIThread(new vi(this.f43056b, this.f43057c, this.d, this.f43058e, this.f43059f, this.h, this.f43060n, 1), 50L);
                return;
            default:
                zn znVar = this.f43056b.f43788s;
                org.telegram.ui.Cells.a0 t82 = znVar.t8(this.f43057c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.m2) znVar).currentAccount;
                    zg.j0.d(znVar, this.f43058e, t82, null, this.f43059f, this.h, this.f43060n, i10, 1);
                    zg.j0.f();
                    return;
                }
                return;
        }
    }
}
