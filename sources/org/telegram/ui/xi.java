package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class xi implements Runnable {
    public final int f38758a;
    public final yi f38759b;
    public final int f38760c;
    public final boolean d;
    public final org.telegram.ui.Components.pk0 e;
    public final float f38761f;
    public final float h;
    public final yg.p0 f38762n;

    public xi(yi yiVar, int i10, boolean z10, org.telegram.ui.Components.pk0 pk0Var, float f7, float f10, yg.p0 p0Var, int i11) {
        this.f38758a = i11;
        this.f38759b = yiVar;
        this.f38760c = i10;
        this.d = z10;
        this.e = pk0Var;
        this.f38761f = f7;
        this.h = f10;
        this.f38762n = p0Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f38758a) {
            case 0:
                AndroidUtilities.runOnUIThread(new xi(this.f38759b, this.f38760c, this.d, this.e, this.f38761f, this.h, this.f38762n, 1), 50L);
                return;
            default:
                eo eoVar = this.f38759b.f39011s;
                org.telegram.ui.Cells.a0 q82 = eoVar.q8(this.f38760c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                    yg.l0.d(eoVar, this.e, q82, null, this.f38761f, this.h, this.f38762n, i10, 1);
                    yg.l0.f();
                    return;
                }
                return;
        }
    }
}
