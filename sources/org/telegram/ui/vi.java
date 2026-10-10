package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class vi implements Runnable {
    public final int f42910a;
    public final wi f42911b;
    public final int f42912c;
    public final boolean d;
    public final org.telegram.ui.Components.ll0 f42913e;
    public final float f42914f;
    public final float h;
    public final zg.n0 f42915n;

    public vi(wi wiVar, int i10, boolean z10, org.telegram.ui.Components.ll0 ll0Var, float f7, float f10, zg.n0 n0Var, int i11) {
        this.f42910a = i11;
        this.f42911b = wiVar;
        this.f42912c = i10;
        this.d = z10;
        this.f42913e = ll0Var;
        this.f42914f = f7;
        this.h = f10;
        this.f42915n = n0Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f42910a) {
            case 0:
                AndroidUtilities.runOnUIThread(new vi(this.f42911b, this.f42912c, this.d, this.f42913e, this.f42914f, this.h, this.f42915n, 1), 50L);
                return;
            default:
                zn znVar = this.f42911b.f43668s;
                org.telegram.ui.Cells.a0 t82 = znVar.t8(this.f42912c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                    zg.j0.d(znVar, this.f42913e, t82, null, this.f42914f, this.h, this.f42915n, i10, 1);
                    zg.j0.f();
                    return;
                }
                return;
        }
    }
}
