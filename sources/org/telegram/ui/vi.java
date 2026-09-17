package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class vi implements Runnable {
    public final int f41594a;
    public final wi f41595b;
    public final int f41596c;
    public final boolean d;
    public final org.telegram.ui.Components.fk0 f41597e;
    public final float f41598f;
    public final float h;
    public final ah.j1 f41599n;

    public vi(wi wiVar, int i10, boolean z10, org.telegram.ui.Components.fk0 fk0Var, float f7, float f10, ah.j1 j1Var, int i11) {
        this.f41594a = i11;
        this.f41595b = wiVar;
        this.f41596c = i10;
        this.d = z10;
        this.f41597e = fk0Var;
        this.f41598f = f7;
        this.h = f10;
        this.f41599n = j1Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f41594a) {
            case 0:
                AndroidUtilities.runOnUIThread(new vi(this.f41595b, this.f41596c, this.d, this.f41597e, this.f41598f, this.h, this.f41599n, 1), 50L);
                return;
            default:
                co coVar = this.f41595b.f42435s;
                org.telegram.ui.Cells.a0 q82 = coVar.q8(this.f41596c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                    ah.e1.d(coVar, this.f41597e, q82, null, this.f41598f, this.h, this.f41599n, i10, 1);
                    ah.e1.f();
                    return;
                }
                return;
        }
    }
}
