package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class zi implements Runnable {
    public final int f44851a;
    public final aj f44852b;
    public final int f44853c;
    public final boolean d;
    public final org.telegram.ui.Components.nl0 f44854e;
    public final float f44855f;
    public final float h;
    public final zg.n0 f44856n;

    public zi(aj ajVar, int i10, boolean z10, org.telegram.ui.Components.nl0 nl0Var, float f7, float f10, zg.n0 n0Var, int i11) {
        this.f44851a = i11;
        this.f44852b = ajVar;
        this.f44853c = i10;
        this.d = z10;
        this.f44854e = nl0Var;
        this.f44855f = f7;
        this.h = f10;
        this.f44856n = n0Var;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f44851a) {
            case 0:
                AndroidUtilities.runOnUIThread(new zi(this.f44852b, this.f44853c, this.d, this.f44854e, this.f44855f, this.h, this.f44856n, 1), 50L);
                return;
            default:
                eo eoVar = this.f44852b.f35856s;
                org.telegram.ui.Cells.a0 t82 = eoVar.t8(this.f44853c, true);
                if (this.d) {
                    i10 = ((org.telegram.ui.ActionBar.m2) eoVar).currentAccount;
                    zg.j0.d(eoVar, this.f44854e, t82, null, this.f44855f, this.h, this.f44856n, i10, 1);
                    zg.j0.f();
                    return;
                }
                return;
        }
    }
}
