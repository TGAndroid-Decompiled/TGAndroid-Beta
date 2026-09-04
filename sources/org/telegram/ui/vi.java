package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class vi implements Runnable {
    public final int f41566a;
    public final wi f41567b;
    public final int f41568c;
    public final boolean d;
    public final org.telegram.ui.Components.fk0 f41569e;
    public final float f41570f;
    public final float h;
    public final ah.j1 f41571n;

    public vi(wi wiVar, int i10, boolean z10, org.telegram.ui.Components.fk0 fk0Var, float f7, float f10, ah.j1 j1Var, int i11) {
        this.f41566a = i11;
        this.f41567b = wiVar;
        this.f41568c = i10;
        this.d = z10;
        this.f41569e = fk0Var;
        this.f41570f = f7;
        this.h = f10;
        this.f41571n = j1Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f41566a) {
            case 0:
                AndroidUtilities.runOnUIThread(new vi(this.f41567b, this.f41568c, this.d, this.f41569e, this.f41570f, this.h, this.f41571n, 1), 50L);
                return;
            default:
                co coVar = this.f41567b.f42407s;
                org.telegram.ui.Cells.a0 q82 = coVar.q8(this.f41568c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                    ah.e1.d(coVar, this.f41569e, q82, null, this.f41570f, this.h, this.f41571n, i10, 1);
                    ah.e1.f();
                    return;
                }
                return;
        }
    }
}
