package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class vi implements Runnable {
    public final int f41593a;
    public final wi f41594b;
    public final int f41595c;
    public final boolean d;
    public final org.telegram.ui.Components.fk0 f41596e;
    public final float f41597f;
    public final float h;
    public final ah.j1 f41598n;

    public vi(wi wiVar, int i10, boolean z10, org.telegram.ui.Components.fk0 fk0Var, float f7, float f10, ah.j1 j1Var, int i11) {
        this.f41593a = i11;
        this.f41594b = wiVar;
        this.f41595c = i10;
        this.d = z10;
        this.f41596e = fk0Var;
        this.f41597f = f7;
        this.h = f10;
        this.f41598n = j1Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f41593a) {
            case 0:
                AndroidUtilities.runOnUIThread(new vi(this.f41594b, this.f41595c, this.d, this.f41596e, this.f41597f, this.h, this.f41598n, 1), 50L);
                return;
            default:
                co coVar = this.f41594b.f42434s;
                org.telegram.ui.Cells.a0 q82 = coVar.q8(this.f41595c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                    ah.e1.d(coVar, this.f41596e, q82, null, this.f41597f, this.h, this.f41598n, i10, 1);
                    ah.e1.f();
                    return;
                }
                return;
        }
    }
}
