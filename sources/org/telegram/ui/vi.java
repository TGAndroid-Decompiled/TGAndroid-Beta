package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class vi implements Runnable {
    public final int f41567a;
    public final wi f41568b;
    public final int f41569c;
    public final boolean d;
    public final org.telegram.ui.Components.fk0 f41570e;
    public final float f41571f;
    public final float h;
    public final ah.j1 f41572n;

    public vi(wi wiVar, int i10, boolean z10, org.telegram.ui.Components.fk0 fk0Var, float f7, float f10, ah.j1 j1Var, int i11) {
        this.f41567a = i11;
        this.f41568b = wiVar;
        this.f41569c = i10;
        this.d = z10;
        this.f41570e = fk0Var;
        this.f41571f = f7;
        this.h = f10;
        this.f41572n = j1Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f41567a) {
            case 0:
                AndroidUtilities.runOnUIThread(new vi(this.f41568b, this.f41569c, this.d, this.f41570e, this.f41571f, this.h, this.f41572n, 1), 50L);
                return;
            default:
                co coVar = this.f41568b.f42408s;
                org.telegram.ui.Cells.a0 q82 = coVar.q8(this.f41569c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                    ah.e1.d(coVar, this.f41570e, q82, null, this.f41571f, this.h, this.f41572n, i10, 1);
                    ah.e1.f();
                    return;
                }
                return;
        }
    }
}
